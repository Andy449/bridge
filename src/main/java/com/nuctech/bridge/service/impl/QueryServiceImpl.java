package com.nuctech.bridge.service.impl;

import java.nio.ByteBuffer;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nuctech.bridge.common.ApiResponse;
import com.nuctech.bridge.entity.Brand;
import com.nuctech.bridge.entity.Dangerous;
import com.nuctech.bridge.entity.Goods;
import com.nuctech.bridge.entity.GoodsLabel;
import com.nuctech.bridge.entity.UserOperation;
import com.nuctech.bridge.repository.BrandRepository;
import com.nuctech.bridge.repository.DangerousRepository;
import com.nuctech.bridge.repository.GoodsLabelRepository;
import com.nuctech.bridge.repository.GoodsRepository;
import com.nuctech.bridge.repository.UserOperationRepository;
import com.nuctech.bridge.rpc.Classification;
import com.nuctech.bridge.rpc.GoodsObject;
import com.nuctech.bridge.rpc.Image;
import com.nuctech.bridge.rpc.NucDLReply;
import com.nuctech.bridge.rpc.NucDLRequest;
import com.nuctech.bridge.rpc.TextObject;
import com.nuctech.bridge.rpc.client.RpcClient;
import com.nuctech.bridge.service.QueryService;
import com.nuctech.bridge.util.JsonUtil;
import com.nuctech.bridge.util.SpringContextUtil;
import com.nuctech.bridge.util.StringUtil;

@Service
public class QueryServiceImpl implements QueryService{
	
	private final static Logger logger = LoggerFactory.getLogger(QueryServiceImpl.class);
	
	@Autowired
	private GoodsRepository goodsRepository;
	
	@Autowired
	private UserOperationRepository uoRepository;
	
	@Autowired
	private BrandRepository brandRepository;
	
	@Autowired
	private DangerousRepository dangerousRepository;
	
	@Autowired
	private GoodsLabelRepository goodsLabelRepository;
	

	@Override
	public String getGoods(Map<String, Object> map) {
		//判断参数
		ApiResponse<Object> apiResponse = new ApiResponse<>();
		String baseImg = map.get("img").toString();
		if(StringUtil.isNull(map) || map.get("img")==null || baseImg.equals("")){
			
			logger.info("**<getGoods** param is null........");
			setApiResponse(apiResponse,"0x0001","param is null........",false);
			return JsonUtil.ObjectToJson(apiResponse);
		}
		
		RpcClient rpcClient = (RpcClient) SpringContextUtil.getBean("rpcclient");
		if(rpcClient == null){
			
			logger.info("**<getGoods>** rpc bean is null.......");
			setApiResponse(apiResponse,"0x0001","rpc bean is null",false);
			return JsonUtil.ObjectToJson(apiResponse);
		}

		NucDLReply reply = null;
		//获取算法结果
		try {
			
			if(rpcClient != null && !rpcClient.isOpen()){
				rpcClient.open();
			}
			NucDLRequest request = new NucDLRequest();
			Image image = new Image();
			ByteBuffer buffer = ByteBuffer.wrap(baseImg.getBytes().clone());
			image.setBuffer(buffer);
			request.setGoods(image);
			reply = rpcClient.getRpcClient().Goods(request);
		} catch (TTransportException e) {
			logger.error("**<getGoods>*TTransportException",e);
		} catch (TException e) {
			logger.error("**<getGoods>*TException",e);
		}
		//返回结果
		if(reply==null){
			
			logger.info("**<getGoods>** get goodsinfo reply is null.");
			setApiResponse(apiResponse,"0x0001","rpc reply is null",false);
		}else{
			
			logger.info("*********<getGoods>****reply:"+reply);
			try {
				
				JSONArray jArrayRet = new JSONArray();
				for(GoodsObject go:reply.getGoods().getObjs()) {
					
					String img = new String(go.img.buffer.array());
					Goods goods = new Goods();
					
					goods.setLabel(go.label);
					goods.setDescription(go.description);
					goods.setImage(img);
					goods.setScore(go.score);
					goodsRepository.saveAndFlush(goods);
					
					JSONObject jret = new JSONObject();
					jret.put("label", go.label);
					jret.put("description",go.description);
					jret.put("score",go.score);
					jret.put("img",img);
					jret.put("resultId", goods.getId());
					jArrayRet.add(jret);
				}
				JSONObject jsonRet = new JSONObject();
				jsonRet.put("data", jArrayRet);
				
				apiResponse.setCode("0x0000");
				apiResponse.setData(jsonRet);
				apiResponse.setSuccess(true);
			}catch(Exception ex) {
				logger.info("-------<getGoods>-Exception:"+ex.getStackTrace());
			}
		}
		
		return JsonUtil.ObjectToJson(apiResponse);
	}

	
	
	@Override
	public String getBrand(Map<String, Object> map) {
		
		//判断参数
		ApiResponse<Object> apiResponse = new ApiResponse<>();
		String baseImg = map.get("img").toString();
		if(StringUtil.isNull(map) || map.get("img")==null || baseImg.equals("")){
			
			logger.info("**<getBrand** param is null........");
			setApiResponse(apiResponse,"0x0001","param is null........",false);
			return JsonUtil.ObjectToJson(apiResponse);
		}
		
		RpcClient rpcClient = (RpcClient) SpringContextUtil.getBean("rpcclient");
		if(rpcClient == null){
			
			logger.info("**<getBrand>** rpc bean is null.......");
			setApiResponse(apiResponse,"0x0001","rpc bean is null",false);
			return JsonUtil.ObjectToJson(apiResponse);
		}
		NucDLReply reply = null;
		//获取算法结果
		try {
			
			if(rpcClient != null && !rpcClient.isOpen()){
				rpcClient.open();
			}
			NucDLRequest request = new NucDLRequest();
			Image image = new Image();
			ByteBuffer buffer = ByteBuffer.wrap(baseImg.getBytes().clone());
			image.setBuffer(buffer);
			request.setBrand(image);
			reply = rpcClient.getRpcClient().Brand(request);
		} catch (TTransportException e) {
			logger.error("**<getBrand>*TTransportException",e);
		} catch (TException e) {
			logger.error("**<getBrand>*TException",e);
		}
		//返回结果
		if(reply==null){
			
			logger.info("**<getBrand>** get goodsinfo reply is null.");
			setApiResponse(apiResponse,"0x0001","rpc reply is null",false);
		}else{
			
			logger.info("*********<getBrand>****reply:"+reply);
			try {
				
				JSONArray jArrayRet = new JSONArray();
				for(Classification cf:reply.getBrand().getClses()) {
					
					Brand brand = new Brand();
					brand.setLabel(cf.label);
					brand.setConfidence(cf.confidence);
					brandRepository.saveAndFlush(brand);
					
					JSONObject jret = new JSONObject();
					jret.put("label", cf.label);
					jret.put("confidence",cf.confidence);
					jret.put("resultId", brand.getId());
					jArrayRet.add(jret);
				}
				JSONObject jsonRet = new JSONObject();
				jsonRet.put("data", jArrayRet);
				
				apiResponse.setCode("0x0000");
				apiResponse.setData(jsonRet);
				apiResponse.setSuccess(true);
			}catch(Exception ex) {
				logger.info("-------<getBrand>-Exception:"+ex.getStackTrace());
			}
		}
		return JsonUtil.ObjectToJson(apiResponse);
	}



	@Override
	public String getGoodsLabel(Map<String, Object> map) {
		
		//判断参数
		ApiResponse<Object> apiResponse = new ApiResponse<>();
		String baseImg = map.get("img").toString();
		if(StringUtil.isNull(map) || map.get("img")==null || baseImg.equals("")){
			
			logger.info("**<getGoodsLabel** param is null........");
			setApiResponse(apiResponse,"0x0001","param is null........",false);
			return JsonUtil.ObjectToJson(apiResponse);
		}
		
		RpcClient rpcClient = (RpcClient) SpringContextUtil.getBean("rpcclient");
		if(rpcClient == null){
			
			logger.info("**<getGoodsLabel>** rpc bean is null.......");
			setApiResponse(apiResponse,"0x0001","rpc bean is null",false);
			return JsonUtil.ObjectToJson(apiResponse);
		}
		NucDLReply reply = null;
		
		//获取算法结果
		try {
			
			if(rpcClient != null && !rpcClient.isOpen()){
				rpcClient.open();
			}
			NucDLRequest request = new NucDLRequest();
			Image image = new Image();
			ByteBuffer buffer = ByteBuffer.wrap(baseImg.getBytes().clone());
			image.setBuffer(buffer);
			request.setGoods_label(image);
			reply = rpcClient.getRpcClient().GoodsLabel(request);
		} catch (TTransportException e) {
			logger.error("**<getGoodsLabel>*TTransportException",e);
		} catch (TException e) {
			logger.error("**<getGoodsLabel>*TException",e);
		}
		//返回结果
		if(reply==null){
			
			logger.info("**<getGoodsLabel>** get getGoodsLabel reply is null.");
			setApiResponse(apiResponse,"0x0001","rpc reply is null",false);
		}else{
			
			logger.info("*********<getGoodsLabel>****reply:"+reply);
			try {
				
				JSONArray jArrayRet = new JSONArray();
				for(TextObject to:reply.getGoods_label().getObjs()) {
					
					String img = new String(to.txt_img.buffer.array());
					GoodsLabel goodsLabel = new GoodsLabel();
					
					goodsLabel.setLabel(to.text);
					goodsLabel.setImage(img);
					goodsLabel.setConfidence(to.confidence);
					goodsLabelRepository.saveAndFlush(goodsLabel);
					
					JSONObject jret = new JSONObject();
					jret.put("text", to.text);
					jret.put("box",to.box);
					jret.put("confidence",to.confidence);
					jret.put("img",img);
					jret.put("resultId", goodsLabel.getId());
					jArrayRet.add(jret);
				}
				JSONObject jsonRet = new JSONObject();
				jsonRet.put("data", jArrayRet);
				
				apiResponse.setCode("0x0000");
				apiResponse.setData(jsonRet);
				apiResponse.setSuccess(true);
			}catch(Exception ex) {
				logger.info("-------<getGgetGoodsLabeloods>-Exception:"+ex.getStackTrace());
			}
		}
		return JsonUtil.ObjectToJson(apiResponse);
	}



	@Override
	public String getDangerous(Map<String, Object> map) {
		
		//判断参数
		ApiResponse<Object> apiResponse = new ApiResponse<>();
		String baseImg = map.get("img").toString();
		if(StringUtil.isNull(map) || map.get("img")==null || baseImg.equals("")){
			
			logger.info("**<getDangerous** param is null........");
			setApiResponse(apiResponse,"0x0001","param is null........",false);
			return JsonUtil.ObjectToJson(apiResponse);
		}
		
		RpcClient rpcClient = (RpcClient) SpringContextUtil.getBean("rpcclient");
		if(rpcClient == null){
			
			logger.info("**<getDangerous>** rpc bean is null.......");
			setApiResponse(apiResponse,"0x0001","rpc bean is null",false);
			return JsonUtil.ObjectToJson(apiResponse);
		}
		NucDLReply reply = null;
		//获取算法结果
		try {
			
			if(rpcClient != null && !rpcClient.isOpen()){
				rpcClient.open();
			}
			NucDLRequest request = new NucDLRequest();
			Image image = new Image();
			ByteBuffer buffer = ByteBuffer.wrap(baseImg.getBytes().clone());
			image.setBuffer(buffer);
			request.setDangerous(image);
			reply = rpcClient.getRpcClient().Dangerous(request);
		} catch (TTransportException e) {
			logger.error("**<getDangerous>*TTransportException",e);
		} catch (TException e) {
			logger.error("**<getDangerous>*TException",e);
		}
		//返回结果
		if(reply==null){
			
			logger.info("**<getDangerous>** get goodsinfo reply is null.");
			setApiResponse(apiResponse,"0x0001","rpc reply is null",false);
		}else{
			
			logger.info("*********<getDangerous>****reply:"+reply);
			try {
				
				JSONArray jArrayRet = new JSONArray();
				for(Classification cf:reply.getDangerous().getClses()) {
					
					Dangerous dan = new Dangerous();
					dan.setLabel(cf.label);
					dan.setConfidence(cf.confidence);
					dangerousRepository.saveAndFlush(dan);
					
					JSONObject jret = new JSONObject();
					jret.put("label", cf.label);
					jret.put("confidence",cf.confidence);
					jret.put("resultId", dan.getId());
					jArrayRet.add(jret);
				}
				JSONObject jsonRet = new JSONObject();
				jsonRet.put("data", jArrayRet);
				
				apiResponse.setCode("0x0000");
				apiResponse.setData(jsonRet);
				apiResponse.setSuccess(true);
			}catch(Exception ex) {
				logger.info("-------<getDangerous>-Exception:"+ex.getStackTrace());
			}
		}
		
		return JsonUtil.ObjectToJson(apiResponse);
	}

	
	
	@SuppressWarnings("unchecked")
	@Override
	public String confirm(Map<String, Object> map) {
		
		ApiResponse<Object> apiResponse = new ApiResponse<>();
		
		try {
			
			List<UserOperation> listUo = (List<UserOperation>) map.get("data");
			for(UserOperation uo : listUo) {
				uo.setCreateTime(new Date());
				uoRepository.saveAndFlush(uo);
			}
			
			setApiResponse(apiResponse,"0x0000","",true);
			
		}catch(Exception ex) {
			
			logger.info("----confirm---Exception:"+ex.getStackTrace());
			setApiResponse(apiResponse,"0x0001","inner exception",false);
		}
	
		
		return JsonUtil.ObjectToJson(apiResponse);
	}


	/**
	 * 
	 */
	private void setApiResponse(ApiResponse<Object> apiResponse, String code, String msg, boolean suc) {
		
		apiResponse.setCode(code);
		apiResponse.setErrMsg(msg);
		apiResponse.setSuccess(suc);
	}




}
