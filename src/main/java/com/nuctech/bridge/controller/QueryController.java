package com.nuctech.bridge.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nuctech.bridge.service.QueryService;




@RestController
@RequestMapping("/query")
public class QueryController {
	
	private final static Logger logger = LoggerFactory.getLogger(QueryController.class);
	
	@Autowired
	private QueryService queryService;
	
	
	/***
	 * 商品识别
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/recognizegoods",method = {RequestMethod.POST,RequestMethod.OPTIONS})
	public String recognizeGoods(@RequestBody Map<String,Object> map) {
		
		logger.info("-----------<recognizeGoods>---------");
		
		return queryService.getGoods(map);
	}
	
	/**
	 * 商标识别
	 * @param map
	 * @return
	 */
	@RequestMapping("/recognizebrand")
	public String recognizebBrand(@RequestBody Map<String,Object> map) {
	
		return queryService.getBrand(map);
	}
	
	/**
	 * 标签识别
	 * @param map
	 * @return
	 */
	@RequestMapping("/recognizelabel")
	public String recognizeLabel(@RequestBody Map<String,Object> map) {
	
		return queryService.getGoodsLabel(map);
	}
	
	/**
	 * 危险品识别
	 * @param map
	 * @return
	 */
	@RequestMapping("/recognizedangerous")
	public String recognizeDangerous(@RequestBody Map<String,Object> map) {
	
		return queryService.getDangerous(map);
	}
	
	
	@RequestMapping("/recognizeconfirm")
	public String recognizeConfirm(@RequestBody Map<String, Object> map) {
		
		
		return queryService.confirm(map);
	}
}
