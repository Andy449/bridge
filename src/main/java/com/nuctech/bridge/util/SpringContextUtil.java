package com.nuctech.bridge.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextUtil implements ApplicationContextAware{

private static ApplicationContext applicationContext = null;

	private final static Logger logger = LoggerFactory.getLogger(ApplicationContext.class);
	
	@SuppressWarnings("static-access")
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		if(this.applicationContext == null){
			this.applicationContext = applicationContext;
		}
	}
	
	
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	/**
	 * 通过名称获取bean
	 * @param name
	 * @return
	 */
	public static Object getBean(String name){
		
		try {
			
			Object o = getApplicationContext().getBean(name);
			
			return o;
		}catch(Exception ex) {
			
			logger.error("--SpringContextUtil--getBean--ex:"+ex.getStackTrace());			
		}
		
		return null;
	}
	
	/**
	 * 通过class获取bean
	 * @param t
	 * @return
	 */
	public static <T>T getBean(Class<T> t){
		if(getApplicationContext()==null){
			logger.error("applicationcontext is null");
		}
		return getApplicationContext().getBean(t);
	}
	
	/**
	 * 通过制定name和class返回bean
	 * @param name
	 * @param t
	 * @return
	 */
	public static <T> T getBean(String name,Class<T> t){
		return getApplicationContext().getBean(name, t);
	}
	
	/**
	 * 获取bean工厂
	 * @return
	 */
	public static DefaultListableBeanFactory defaultListableBeanFactory(){
		return (DefaultListableBeanFactory) applicationContext.getAutowireCapableBeanFactory();
	}

}
