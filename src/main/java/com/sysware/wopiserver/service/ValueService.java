package com.sysware.wopiserver.service;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

@Service
public class ValueService {

	@Value("${SYSWARE_HOST}")
	private String SYSWARE_HOST;

	public JSONObject getToken(String access_token) {
		String datas = "";
		try {
			Resource fileRource = new ClassPathResource("data/access_token.json");
			datas = IOUtils.toString(fileRource.getInputStream());
		} catch (IOException e) {
		}
		if (StringUtils.isNotEmpty(datas)) {
			JSONObject data = JSONObject.parseObject(datas);
			if (data != null) {
				return data.getJSONObject(access_token);
			}
		}
		return null;
	}

	public JSONObject getFileInfo(String fileId) {
			String datas = "";
			try {
				Resource fileRource = new ClassPathResource("data/files.json");
				datas = IOUtils.toString(fileRource.getInputStream());
			} catch (IOException e) {
			}

			if (StringUtils.isNotEmpty(datas)) {
				JSONObject data = JSONObject.parseObject(datas);
			if (data != null) {
				return data.getJSONObject(fileId);
			}
			}
		return null;
	}

}
