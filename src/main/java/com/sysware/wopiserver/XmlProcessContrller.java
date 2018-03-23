package com.sysware.wopiserver;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.dom4j.tree.DefaultElement;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping(value = "/xmlProcess")
public class XmlProcessContrller {

	@RequestMapping(value = "/parseTag")
	@ResponseBody
	public String parseTag(HttpServletRequest request) {
		String requrl = request.getParameter("url");
		if (StringUtils.isEmpty(requrl))
			return "";
		String xpathExpression = request.getParameter("xpath");
		String attributes = request.getParameter("attributes");
		if (StringUtils.isEmpty(attributes))
			return "";

		JSONObject obj = new JSONObject();
		try {
			java.net.URL url = new java.net.URL(requrl);
			SAXReader reader = new SAXReader();
			Document document = reader.read(url);
			Node node = document.selectSingleNode(xpathExpression);
			if (node != null) {
				org.dom4j.tree.DefaultElement ele = (DefaultElement) node;
				if (attributes.length() > 0 && attributes.split(",") != null && attributes.split(",").length > 0) {
					for (String attr : attributes.split(",")) {
						obj.put(attr, ele.attributeValue(attr));
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return obj.toJSONString();
	}

}
