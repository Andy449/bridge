package com.nuctech.bridge.util;

import java.util.List;
import java.util.Map;

public class StringUtil {

	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isNull(Object obj){
		if(obj == null){
			return true;
		}
		if(obj instanceof String){
			return isNull(obj.toString());
		}
		if(obj instanceof Boolean){
			return obj.equals(false);
		}
		if(obj instanceof Integer){
			return obj.equals(0);
		}
		if(obj instanceof Map ){
			return obj == null || ((Map)obj).isEmpty();
		}
		if(obj instanceof Enum){
			return obj == null || ((Enum)obj).name() == null;
		}
		if(obj instanceof List){
			return obj == null || ((List)obj).size() == 0;
		}
		return false;
	}
}
