package com.nuctech.bridge.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class CORSFilter implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		System.out.println("--CORSFilter--------init----->");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("--CORSFilter--------doFilter----->");
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
//		Enumeration<String> headerNames = req.getHeaderNames();
//		
//        while (headerNames.hasMoreElements()) {// 判断是否还有下一个元素
//        	
//            String nextElement = headerNames.nextElement();// 获取headerNames集合中的请求头
//            String header2 = req.getHeader(nextElement);// 通过请求头得到请求内容
//            System.out.println(nextElement + ":" + header2);
//        }
//        System.out.println("--MyFilter--------doFilter----------------------->");
		//允许跨域访问的域
	    res.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
	    //是否允许请求带有验证信息
	    res.setHeader("Access-Control-Allow-Credentials", "true");
	    //允许使用的请求方法
	    res.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE,PUT");
	    res.setHeader("Access-Control-Max-Age", "3600");
	    //允许携带的请求头
	    res.setHeader("Access-Control-Allow-Headers", "x-requested-with,Cache-Control,Pragma,Content-Type,Authorization,token");//
		
		if(req.getMethod().equals(HttpMethod.OPTIONS.toString())) {
			System.out.println("--return OPTIONS--");
			res.setStatus(HttpStatus.OK.value());
			return;
		}
		
		chain.doFilter(request, res);
	}

	

	@Override
	public void destroy() {
		
	}
}
