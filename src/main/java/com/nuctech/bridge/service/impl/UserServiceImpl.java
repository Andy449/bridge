package com.nuctech.bridge.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nuctech.bridge.entity.User;
import com.nuctech.bridge.repository.UserRepository;
import com.nuctech.bridge.service.UserService;
import com.nuctech.bridge.util.JsonUtil;





/**
 * 
 * @author AnEnyang
 *
 */
@Service
public class UserServiceImpl implements UserService, UserDetailsService{
	
	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		logger.info("---------------<loadUserByUsername>--------");
		
		User user = userRepository.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("****<UserServiceImpl>*****username NOT found");
		}
		
		logger.info("---------<loadUserByUsername>----User:"+JsonUtil.ObjectToJson(user));
		
		return user;
	}

}
