package com.nuctech.bridge.tools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.nuctech.bridge.common.Constant;
import com.nuctech.bridge.util.JsonUtil;

import io.jsonwebtoken.Jwts;



/**
 * token的校验
 * 该类继承自BasicAuthenticationFilter，在doFilterInternal方法中，
 * 从http头的Authorization 项读取token数据，然后用Jwts包提供的方法校验token的合法性。
 * 如果校验通过，就认为这是一个取得授权的合法请求
 * @author AnEnyang
 *
 */

public class JWTAuthenticationFilter extends BasicAuthenticationFilter{

	
	public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
	}

	
	
	
	@Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
       
		System.out.println("----->doFilterInternal");
		
		
		String header = request.getHeader(Constant.AUTHORIZATION);//不区分大小写
		
		logger.info("----------doFilterInternal:"+header);
 
        if (header == null || !header.startsWith(Constant.AUTHORIZATION_PRE)) {
            chain.doFilter(request, response);//带Authorization成功过后即使不带也能成功(?)
            return;
        }
 
        UsernamePasswordAuthenticationToken authentication = getAuthentication(request);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(request, response);
        
        //认证错误，例如Authorization错误
        
        //过了期限
    }
	
	
	/**
	 * 
	 * @param request
	 * @return
	 */
	private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
		
		System.out.println("--------------->getAuthentication");
		
        String token = request.getHeader(Constant.AUTHORIZATION);
        if (token != null) {
            // parse the token.
            String user = Jwts.parser()
                    .setSigningKey("MyJwtSecret")
                    .parseClaimsJws(token.replace(Constant.AUTHORIZATION_PRE, ""))
                    .getBody()
                    .getSubject();
 
            if (user != null) {
                return new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>());
            }
            return null;
        }
        return null;
    }
}
