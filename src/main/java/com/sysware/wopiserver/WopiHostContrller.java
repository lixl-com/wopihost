package com.sysware.wopiserver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.sysware.wopiserver.entity.FileInfo;
import com.sysware.wopiserver.service.ValueService;
import com.sysware.wopiserver.utils.StringUtil;

/**
 * WOPI HOST Created by admin on 2017/4/15.
 */
@Controller
@RequestMapping(value = "/wopi")
public class WopiHostContrller {

	private Logger logger = Logger.getLogger(getClass());

	/**
	 * 获取文件流
	 * 
	 * @param name
	 * @param response
	 */
	@RequestMapping(value = "/files/{fileId}/contents", method = RequestMethod.GET)
	public void fileDownLoad(@PathVariable(value = "fileId") String fileId, HttpServletRequest request,
			HttpServletResponse response) {
		JSONObject obj = valueService.getFileInfo(fileId);
		if (obj == null)
			return;

		// 文件的路径
		File file = new File(obj.getString("filePath"));
		if (!file.exists()) {
			return;
		}
		InputStream fis = null;
		OutputStream toClient = null;
		try {
			// 取得文件名
			String fileName = obj.getString("fileName");
			FileInputStream is = new FileInputStream(file);
			// 以流的形式下载文件
			fis = new BufferedInputStream(is);
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			// 清空response
			response.reset();

			String header = request.getHeader("User-Agent").toUpperCase();
			if (header.contains("MSIE") || header.contains("TRIDENT") || header.contains("EDGE")) {
				fileName = URLEncoder.encode(fileName, "utf-8");
				fileName = fileName.replace("+", "%20"); // IE下载文件名空格变+号问题
			} else {
				fileName = new String(fileName.getBytes(), "ISO8859-1");
			}

			// 设置response的Header
			response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
			response.addHeader("Content-Length", "" + file.length());
			toClient = new BufferedOutputStream(response.getOutputStream());
			response.setContentType("application/octet-stream");
			toClient.write(buffer);
			toClient.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				fis.close();
				toClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 保存更新文件
	 * 
	 * @param name
	 * @param content
	 */
	@RequestMapping(value = "/files/{fileId}/contents", method = RequestMethod.POST)
	public void postFile(@PathVariable(value = "fileId") String fileId, @RequestBody byte[] content) {
		JSONObject obj = valueService.getFileInfo(fileId);
		if (obj == null)
			return;

		// 文件的路径
		File file = new File(obj.getString("filePath"));
		FileOutputStream fop = null;
		try {
			if (!file.exists()) {
				file.createNewFile();// 构建文件
			}
			fop = new FileOutputStream(file);
			fop.write(content);
			fop.flush();
			logger.debug("saved file " + obj.getString("filePath"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fop.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Autowired
	ValueService valueService;

	/**
	 * 获取文件信息
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value = "/files/{fileId}")
	@ResponseBody
	public String getFileInfo(@PathVariable(value = "fileId") String fileId, HttpServletRequest request,
			HttpServletResponse response) {
		String access_token = request.getParameter("access_token");
		JSONObject token = null;
		boolean canedit = false;
		if (StringUtils.isNotEmpty(access_token) && access_token.indexOf(".") > 0) {
			int l = access_token.indexOf(".");
			token = valueService.getToken(access_token.substring(0, l));
			if (l + 1 <= access_token.length() && "true".equals(access_token.substring(l + 1))) {
				canedit = true;
			}
		}

		if (token == null) {
			response.setStatus(HttpStatus.SC_UNAUTHORIZED);
			return null;
		}

		JSONObject fileInfo = valueService.getFileInfo(fileId);
		File file = null;
		if (fileInfo != null) {
			file = new File(fileInfo.getString("filePath"));
		}

		if (file == null || !file.exists()) {
			response.setStatus(HttpStatus.SC_NOT_FOUND);
			return null;
		}

		FileInfo info = new FileInfo();
		info.setUserFriendlyName(token.getString("userName"));
		// 取得文件名
		info.setBaseFileName(fileInfo.getString("fileName"));
		info.setSize(file.length());
		info.setFileExtension(FilenameUtils.getExtension(info.getBaseFileName()));
		info.setOwnerId(token.getString("userId"));
		info.setUserId(token.getString("userId"));
		info.setVersion("" + file.lastModified());
		info.setSHA256(getHash256(file));
		info.setAllowExternalMarketplace(true);
		// 显示下载按钮
		info.setDownloadUrl(StringUtil.BASE_PATH + "/files/" + fileId + "/contents");
		if (canedit) {
			info.setUserCanWrite(true);
			info.setSupportsUpdate(true);
			info.setSupportsLocks(true);
			// info.setSupportsCoauth(true);
			// info.setSupportsCobalt(true);
			info.setSupportsFolders(true);
		} else {
			info.setReadOnly(true);
		}

		try {
			ObjectMapper mapper = new ObjectMapper();
			return mapper.writeValueAsString(info);
		} catch (IOException e) {
			e.printStackTrace();
			response.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}

	/**
	 * 获取文件的SHA-256值
	 * 
	 * @param file
	 * @return
	 */
	public static String getHash256(File file) {
		String value = "";
		// 获取hash值
		try {
			byte[] buffer = new byte[1024];
			int numRead;
			InputStream fis = new FileInputStream(file);
			// 如果想使用SHA-1或SHA-256，则传入SHA-1,SHA-256
			MessageDigest complete = MessageDigest.getInstance("SHA-256");
			do {
				// 从文件读到buffer
				numRead = fis.read(buffer);
				if (numRead > 0) {
					// 用读到的字节进行MD5的计算，第二个参数是偏移量
					complete.update(buffer, 0, numRead);
				}
			} while (numRead != -1);

			fis.close();
			value = new String(Base64Utils.encode(complete.digest()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

}
