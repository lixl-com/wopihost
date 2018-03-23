package com.sysware.wopiserver.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.sysware.wopiserver.utils.HttpClientUtil;
import com.sysware.wopiserver.utils.StringUtil;

@Service
public class ValueService {

	@Value("${SYSWARE_HOST}")
	private String SYSWARE_HOST;

	public JSONObject getToken(String access_token) {
		String datas = HttpClientUtil.get(StringUtil.BASE_PATH + "data/access_token.json");
		if (StringUtils.isNotEmpty(datas)) {
			JSONObject data = JSONObject.parseObject(datas);
			if (data != null) {
				return data.getJSONObject(access_token);
			}
		}
		return null;
	}

	public JSONObject getFileInfo(String fileId) {
		String datas = HttpClientUtil.get(StringUtil.BASE_PATH + "data/files.json");
		if (StringUtils.isNotEmpty(datas)) {
			JSONObject data = JSONObject.parseObject(datas);
			if (data != null) {
				return data.getJSONObject(fileId);
			}
		}
		return null;
	}

}
