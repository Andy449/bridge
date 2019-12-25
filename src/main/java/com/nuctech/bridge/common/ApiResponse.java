package com.nuctech.bridge.common;

import java.io.Serializable;


public class ApiResponse<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5332559907391515447L;
	//请求是否成功
	private boolean success;
	//错误码
	private String code;
	//错误信息
	private String errMsg;
	//返回业务数据
	private T data;
	
	//请求url
	private String url;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}


	/**
	 * 
	 * @param data
	 * @return
	 */
	public static <T> ApiResponse<T> buildSuccess(T data){
		ApiResponse<T> response = new ApiResponse<T>();
		response.setData(data);
		response.setSuccess(true);
		return response;
	}
	
	/**
	 * 
	 * @return
	 */
	public static <T> ApiResponse<T> buildSuccess(){
		ApiResponse<T> response = new ApiResponse<T>();
		response.setSuccess(true);
		return response;
	}
	
	/**
	 * 
	 * @return
	 */
	public static <T> ApiResponse<T> buildFailure(){
		ApiResponse<T> response = new ApiResponse<T>();
		response.setSuccess(false);
		return response;
	}
	
	/**
	 * 
	 * @param errorMsg
	 * @return
	 */
	public static <T> ApiResponse<T> buildFailure(String errorMsg){
		ApiResponse<T> response = new ApiResponse<T>();
		response.setSuccess(false);
		response.setCode("ffff");//ffff默认错误码；
		response.setErrMsg(errorMsg);
		return response;
	}
	
	/**
	 * 
	 * @param errorCode
	 * @param errorMsg
	 * @return
	 */
	public static <T> ApiResponse<T> buildFailure(String errorCode,String errorMsg){
		ApiResponse<T> response = new ApiResponse<T>();
		response.setSuccess(false);
		response.setCode(errorCode);
		response.setErrMsg(errorMsg);
		return response;
	}
}
