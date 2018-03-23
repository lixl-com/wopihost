package com.sysware.wopiserver;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.sysware.wopiserver.utils.StringUtil;

public class WebBootStrapFilter extends CharacterEncodingFilter {
	private static Logger log = Logger.getLogger(WebBootStrapFilter.class);

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		String path = request.getContextPath();
		StringUtil.BASE_PATH = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ path + "/";
		
		log.info(request.getMethod()+"\t"+StringUtil.BASE_PATH + request.getServletPath());

		super.doFilterInternal(request, response, filterChain);
	}

}
