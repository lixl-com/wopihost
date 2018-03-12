package com.sysware.wopiserver.utils;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import com.alibaba.fastjson.JSONObject;

public class ValueUtil {

	@Value("${SYSWARE_HOST}")
	private String SYSWARE_HOST;

	private static ValueUtil instance;

	private ValueUtil() {
		instance = new ValueUtil();
	}

	public static ValueUtil getInstance() {
		return instance;
	}

	public JSONObject getToken(String access_token) {
		String url = SYSWARE_HOST + "/data/access_token.json";
		String datas = HttpClientUtil.get(url);
		if (StringUtils.isNotEmpty(datas)) {
			JSONObject data = JSONObject.parseObject(datas);
			if (data != null) {
				return data.getJSONObject(access_token);
			}
		}
		return null;
	}

	public JSONObject getFileInfo(String access_token) {
		JSONObject token = getToken(access_token);
		if (token != null) {
			String url = SYSWARE_HOST + "/data/files.json";
			String datas = HttpClientUtil.get(url);
			if (StringUtils.isNotEmpty(datas)) {
				JSONObject data = JSONObject.parseObject(datas);
				if (data != null) {
					return data.getJSONObject(token.getString("fileId"));
				}
			}
		}
		return null;
	}

}
