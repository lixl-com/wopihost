package com.sysware.wopiserver.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;

public class StringUtil {

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
			InputStream fis = new FileInputStream(file);
			value = DigestUtils.sha256Hex(fis);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

	public static String BASE_PATH = "";

	public static File getLastestFile(File oldFile) {
		File file = oldFile;
		final String bname = oldFile.getName();
		// 取最新版本的文件
		File[] files = oldFile.getParentFile().listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.equals(bname) || FilenameUtils.getBaseName(FilenameUtils.getBaseName(name)).equals(bname))
					return true;
				else
					return false;
			}
		});

		System.out.println(files);
		if (files.length > 1) {
			String currentVersion = FilenameUtils.getExtension(bname);
			int cv = 0;
			if (StringUtils.isNotEmpty(currentVersion)) {
				cv = Integer.parseInt(currentVersion);
			}
			for (File f : files) {
				String tempVersion = FilenameUtils.getExtension(f.getName());
				if (StringUtils.isNotEmpty(tempVersion) && Integer.parseInt(tempVersion) > cv) {
					file = f;
				}
			}
		}
		return file;
	}

}
