package com.nuctech.bridge.service;

import java.util.Map;

public interface QueryService {

	public String getGoods(Map<String,Object> map);
	
	public String getBrand(Map<String,Object> map);
	
	public String getGoodsLabel(Map<String,Object> map);
	
	public String getDangerous(Map<String,Object> map);
	
	public String confirm(Map<String,Object> map);
}
