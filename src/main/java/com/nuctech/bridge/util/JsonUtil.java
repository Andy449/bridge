package com.nuctech.bridge.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	
	
	/**
	 * 将对象转为json字符串
	 * @param o
	 * @return
	 */
	public static String ObjectToJson(Object o){
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(o);
		} catch (JsonProcessingException e) {
			
		}
		return null;
	}
}
