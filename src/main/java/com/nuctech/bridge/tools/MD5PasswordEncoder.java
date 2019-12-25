package com.nuctech.bridge.tools;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.DigestUtils;
/**
 * MD5虽然是单向加密，不能反推，但是对一样对密码产生一样对加密结果，更容易被暴力破解
 * @author AnEnyang
 *
 */
public class MD5PasswordEncoder implements PasswordEncoder{

	@Override
	public String encode(CharSequence rawPassword) {
		
		return DigestUtils.md5DigestAsHex(rawPassword.toString().getBytes());
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		
		return encodedPassword.equals(DigestUtils.md5DigestAsHex(rawPassword.toString().getBytes()));
	}

}