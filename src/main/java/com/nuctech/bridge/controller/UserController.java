package com.nuctech.bridge.controller;


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nuctech.bridge.common.ApiResponse;
import com.nuctech.bridge.entity.User;
import com.nuctech.bridge.repository.UserRepository;
import com.nuctech.bridge.util.JsonUtil;
import com.nuctech.bridge.util.StringUtil;


@RestController
@RequestMapping("/user")
public class UserController {
	
	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	
	@Autowired
	private UserRepository userRepository;
	
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		
		return "hello,world";
	}

	@RequestMapping("/signup")
	@ResponseBody
	public String signup(@RequestBody Map<String, Object> map) {
		
		System.out.println("---------->"+JsonUtil.ObjectToJson(map));
		
		String name = map.get("username").toString();
		String psw = map.get("password").toString();
		
		ApiResponse<Object> apiResponse = new ApiResponse<>();
		if(StringUtil.isNull(name)||StringUtil.isNull(psw)){
			apiResponse.setCode("0x0001");
			apiResponse.setErrMsg("param is null");
			apiResponse.setSuccess(false);
			
			return JsonUtil.ObjectToJson(apiResponse);
		}
		
		
		User user = new User("","");
		user.setUsername(name);
		
		BCryptPasswordEncoder bEncoder = new BCryptPasswordEncoder();
		user.setPassword(bEncoder.encode(psw.trim()));
		
		logger.info("------>signup:"+JsonUtil.ObjectToJson(user));
		
		userRepository.save(user);
		
		apiResponse.setCode("0x0000");
		apiResponse.setSuccess(true);
		return JsonUtil.ObjectToJson(apiResponse);
	}
}
