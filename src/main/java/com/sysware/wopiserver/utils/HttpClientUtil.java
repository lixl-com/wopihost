package com.sysware.wopiserver.utils;

import java.io.IOException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

/**
 * HttpClient
 * @author lixl
 *
 */
public class HttpClientUtil {

	static Logger log = Logger.getLogger(HttpClientUtil.class);
	
	/**
	 * 
	 * <h1>HttpClient发起post请求</h1>
	 * 
	 * <pre></pre>
	 * 
	 * @date : 2017年9月9日上午10:30:55
	 * @author : EAP.yupf
	 * @param url
	 * @param params
	 * @return
	 */
	public static String post(String url, Map<String, String> params) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		String body = null;
		log.info("create http post:" + url);
		HttpPost post = postForm(url, params);
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();// 设置请求和传输超时时间
		post.setConfig(requestConfig);
		body = invoke(httpClient, post);
		close(httpClient);
		return body;
	}

	/**
	 * 
	 * <h1>HttpClient发起get请求</h1>
	 * 
	 * <pre></pre>
	 * 
	 * @date : 2017年9月9日上午10:31:25
	 * @author : EAP.yupf
	 * @param url
	 * @return
	 */
	public static String get(String url) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		String body = null;
		log.info("create http get:" + url);
		HttpGet get = new HttpGet(url);
		body = invoke(httpclient, get);
		close(httpclient);
		return body;
	}

	/**
	 * 
	 * <h1>HttpClient发起delete请求</h1>
	 * 
	 * <pre></pre>
	 * 
	 * @date : 2017年9月9日上午10:31:25
	 * @author : EAP.yupf
	 * @param url
	 * @return
	 */
	public static String delete(String url, Map<String, String> params) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		String body = null;
		log.info("create http delete:" + url);
		HttpDelete delete = deleteForm(url, params);
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();// 设置请求和传输超时时间
		delete.setConfig(requestConfig);
		body = invoke(httpClient, delete);
		close(httpClient);
		return body;
	}

	/**
	 * 
	 * <h1>HttpClient发起put请求</h1>
	 * 
	 * <pre></pre>
	 * 
	 * @date : 2017年9月9日上午10:31:25
	 * @author : EAP.yupf
	 * @param url
	 * @return
	 */
	public static String put(String url, Map<String, String> params) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		String body = null;
		log.info("create http put:" + url);
		HttpPut put = putForm(url, params);
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();// 设置请求和传输超时时间
		put.setConfig(requestConfig);
		body = invoke(httpClient, put);
		close(httpClient);
		return body;
	}

	/**
	 * 
	 * <h1>关闭HttpClient连接</h1>
	 * 
	 * <pre></pre>
	 * 
	 * @date : 2017年9月9日上午10:31:43
	 * @author : EAP.yupf
	 * @param httpclient
	 */
	public static void close(CloseableHttpClient httpclient) {
		try {
			log.info("close httpClient");
			httpclient.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * <h1>生成HttpPost对象</h1>
	 * 
	 * <pre></pre>
	 * 
	 * @date : 2017年9月9日上午10:32:51
	 * @author : EAP.yupf
	 * @param url
	 * @param params
	 * @return
	 */
	private static HttpPost postForm(String url, Map<String, String> params) {
		HttpPost httpost = new HttpPost(url);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		Set<String> keySet = params.keySet();
		for (String key : keySet) {
			nvps.add(new BasicNameValuePair(key, params.get(key)));
		}
		log.info("set utf-8 form entity to httppost");
		httpost.setEntity(new UrlEncodedFormEntity(nvps, StandardCharsets.UTF_8));
		return httpost;
	}

	/**
	 * 
	 * <h1>生成HttpDelete对象</h1>
	 * <pre></pre>
	 *
	 * @date   : 2017年9月19日下午3:47:45
	 * @author : EAP.yupf
	 * @param url
	 * @param params
	 * @return
	 */
	private static HttpDelete deleteForm(String url, Map<String, String> params) {
		HttpDelete httpdelete = new HttpDelete(url);
		log.info("set hesder to httpdelete");
		for (Map.Entry<String, String> entry : params.entrySet()) {
			httpdelete.setHeader(entry.getKey(),entry.getValue());
		}
		return httpdelete;
	}

	/**
	 * 
	 * <h1>生成HttpPut对象</h1>
	 * <pre></pre>
	 *
	 * @date   : 2017年9月19日下午3:47:45
	 * @author : EAP.yupf
	 * @param url
	 * @param params
	 * @return
	 */
	private static HttpPut putForm(String url, Map<String, String> params) {
		HttpPut httpput = new HttpPut(url);
		log.info("set hesder to httpput");
		//TODO header传参，传中文会出现乱码，待修改
		for (Map.Entry<String, String> entry : params.entrySet()) {
			httpput.setHeader(entry.getKey(),entry.getValue());
		}
		return httpput;
	}

	/**
	 * 
	 * <h1>发起httpClient请求，得到返回值</h1>
	 * 
	 * <pre></pre>
	 * 
	 * @date : 2017年9月9日上午10:33:52
	 * @author : EAP.yupf
	 * @param httpClient
	 * @param httpRequest
	 * @return
	 */
	private static String invoke(CloseableHttpClient httpClient, HttpUriRequest httpRequest) {
		HttpResponse response = sendRequest(httpClient, httpRequest);
		String body = paseResponse(response);
		return body;
	}

	/**
	 * 
	 * <h1>发起httpClient请求</h1>
	 * 
	 * <pre></pre>
	 * 
	 * @date : 2017年9月9日上午10:34:52
	 * @author : EAP.yupf
	 * @param httpClient
	 * @param httpRequest
	 * @return
	 */
	private static HttpResponse sendRequest(CloseableHttpClient httpClient, HttpUriRequest httpRequest) {
		log.info("execute httpRequest...");
		HttpResponse response = null;
		try {
			response = httpClient.execute(httpRequest);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (NoRouteToHostException e) {
			log.error("ip地址访问不通！");
		} catch (SocketTimeoutException e) {
			log.error("超时或是没有访问的权限！");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * 
	 * <h1>httpClient请求返回值</h1>
	 * 
	 * <pre></pre>
	 * 
	 * @date : 2017年9月9日上午10:35:04
	 * @author : EAP.yupf
	 * @param response
	 * @return
	 */
	private static String paseResponse(HttpResponse response) {
		if (response == null) {
			return null;
		}
		log.info("get response from http server");
		HttpEntity entity = response.getEntity();
		log.info("response status: " + response.getStatusLine());
		String body = null;
		try {
			body = EntityUtils.toString(entity, StandardCharsets.UTF_8);
			log.info("response body: " + body);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return body;
	}

	/**
	 * 
	 * <h1>通过HttpClient发送Post请求</h1>
	 * 
	 * <pre>
	 * 一个方法执行完所有逻辑的例子
	 * </pre>
	 * 
	 * @date : 2017年9月7日上午10:29:59
	 * @author : EAP.yupf
	 * @param path
	 * @param token
	 * @param params
	 * @param encoding
	 * @throws Exception
	 * @throws Exception
	 */
	public static String sendHttpClientPOSTRequest(String url, Map<String, String> map, String charset) {
		String result = null;
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(url);
			// 设置参数
			List<NameValuePair> list = new ArrayList<NameValuePair>();
			for (String key : map.keySet()) {
				list.add(new BasicNameValuePair(key, map.get(key)));
			}
			if (list.size() > 0) {
				UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list, charset);
				httpPost.setEntity(entity);
			}
			HttpResponse response = httpClient.execute(httpPost);
			// 设置请求和传输超时时间
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();
			httpPost.setConfig(requestConfig);
			if (response != null) {
				HttpEntity resEntity = response.getEntity();
				if (resEntity != null) {
					result = EntityUtils.toString(resEntity, charset);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 
	 * <h1>用于@RequestBody方式接受参数的POST请求</h1>
	 * <pre></pre>
	 *
	 * @date   : 2017年9月15日上午11:17:11
	 * @author : EAP.yupf
	 * @param url
	 * @param json
	 * @return
	 * @throws Exception
	 */
	public static String post(String url, String json) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		String result = "";
		log.info("create http post:" + url);
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader("Content-type", "application/json; charset=utf-8");
		httpPost.setHeader("Accept", "application/json");
		httpPost.setEntity(new StringEntity(json, StandardCharsets.UTF_8));
		result = invoke(httpClient, httpPost);
		close(httpClient);
		return result;
	}
	/**
	 * 
	 * <h1>用于@RequestBody方式接受参数的POST请求xml请求</h1>
	 * <pre></pre>
	 *
	 * @since  : 2017年10月30日:上午11:51:41
	 * @author : dujg
	 * @param url
	 * @param xml
	 * @return
	 */
	public static String postXml(String url, String xml) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		String result = "";
		log.info("create http post:" + url);
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader("Content-type", "application/xml; charset=utf-8");
		httpPost.setHeader("Accept", "application/xml");
		httpPost.setEntity(new StringEntity(xml, StandardCharsets.UTF_8));
		result = invoke(httpClient, httpPost);
		close(httpClient);
		return result;
	}
	
	/**
	 * 
	 * <h1>post请求无返回值</h1>
	 * <pre></pre>
	 *
	 * @date   : 2017年9月18日上午9:58:59
	 * @author : EAP.yaoyn
	 * @param url
	 * @param json
	 */
	public static void postVoid(String url, String json) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		log.info("create http post:" + url);
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader("Content-type", "application/json; charset=utf-8");
		httpPost.setHeader("Accept", "application/json");
		httpPost.setEntity(new StringEntity(json, StandardCharsets.UTF_8));
		sendRequest(httpClient, httpPost);
	}
}
