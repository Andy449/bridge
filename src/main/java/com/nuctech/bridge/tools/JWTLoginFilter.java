package com.nuctech.bridge.tools;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nuctech.bridge.common.Constant;
import com.nuctech.bridge.entity.User;
import com.nuctech.bridge.util.JsonUtil;
import com.nuctech.bridge.util.ResponseBody;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;




/**
 * 
 * @author AnEnyang
 *
 */
public class JWTLoginFilter extends UsernamePasswordAuthenticationFilter {
	
	private static Logger logger = LoggerFactory.getLogger(JWTLoginFilter.class);

	static final String HEADER_STRING = "Authorization";
	
	private AuthenticationManager authenticationManager;
	
	
	public JWTLoginFilter() {
		
	}
	
	 
    public JWTLoginFilter(AuthenticationManager authenticationManager) {
    	
        this.authenticationManager = authenticationManager;
    }
	
	
    /**
     * 接收并解析用户凭证
     */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest req,
                                                HttpServletResponse res) throws AuthenticationException {
    	
    	logger.info("--->attemptAuthentication<--");
    
        try {
            User user = new ObjectMapper().readValue(req.getInputStream(), User.class);
            
            logger.info("---attemptAuthentication--->user"+JsonUtil.ObjectToJson(user));

            UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(user.getUsername().trim(),user.getPassword());
          
            
            return authenticationManager.authenticate(authToken);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
	
	
	/**
	 * 用户成功登录后，这个方法会被调用，我们在这个方法里生成token
	 */
	@Override
	protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, 
			FilterChain chain, Authentication auth) throws IOException, ServletException {
		
		User user = (User)auth.getPrincipal();
		logger.info("----->successfulAuthentication<-----user"+JsonUtil.ObjectToJson(user));
		
		//允许前端获取自定义的header
	    res.setHeader("Access-Control-Expose-Headers", "Authorization,userid");
		
		String token = Jwts.builder()
                .setSubject(user.getUsername())
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 1000 * 60 * 24))//24h: 60 * 1000 * 60 * 24
                .signWith(SignatureAlgorithm.HS512, "MyJwtSecret")
                .compact();
		
	    //将token放到header
	    res.addHeader(Constant.AUTHORIZATION, Constant.AUTHORIZATION_PRE + token);
        res.addHeader("userid", user.getId().toString());
        //将token放到body
//        ResponseBody rb=new ResponseBody();
//        rb.setAuthorization(Constant.AUTHORIZATION_PRE + token);
//        rb.setUserid(user.getId().toString());
//       
//        PrintWriter out = res.getWriter();	
//        out.write(new ObjectMapper().writeValueAsString(rb));	
//        out.flush();	
//        out.close();
	}
	
	@Override
	protected void unsuccessfulAuthentication(HttpServletRequest request,HttpServletResponse response, 
			AuthenticationException failed) throws IOException, ServletException {
		
		logger.info("---unsuccessfulAuthentication----");
		//正常运行时日志设为info后打开
//		logger.info("Authentication request failed: " + failed.toString(), failed);
//		logger.info("Updated SecurityContextHolder to contain null Authentication");
		
		response.addHeader(Constant.AUTHORIZATION, "error");
	}
	
}