package com.sysware.wopiserver.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.codec.digest.DigestUtils;

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

}
