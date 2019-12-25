package com.nuctech.bridge.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;

import com.nuctech.bridge.filter.CORSFilter;
import com.nuctech.bridge.tools.JWTAuthenticationFilter;
import com.nuctech.bridge.tools.JWTLoginFilter;



@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService userDetailsService;
	 

	 
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		System.out.println("------>configure-http");
		 
        http.cors()//允许跨域，在filter中也设置了，这里应该可以不设置
        	.and().csrf().disable()//csrf针对的是session的攻击，使用jwt就不需要这个保护
        	// 基于token，所以不需要session
        	.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
        	.authorizeRequests()
//      	.requestMatchers(CorsUtils::isPreFlightRequest).permitAll()    //对preflight放行,在filter中设置OPTIONS放回
        	.antMatchers(HttpMethod.POST, "/user/signup").permitAll()
            .anyRequest().authenticated()
            .and()
            .addFilter(new JWTLoginFilter(authenticationManager()))
            .addFilter(new JWTAuthenticationFilter(authenticationManager()));
        
        //ChannelProcessingFilter.class这是第一个filter
        http.addFilterBefore(new CORSFilter(), ChannelProcessingFilter.class);
        
    }
 
	 
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
    	
    	System.out.println("------>configure-auth");
    	
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    	
    }

}
