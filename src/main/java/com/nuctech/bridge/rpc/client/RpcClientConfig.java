package com.nuctech.bridge.rpc.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RpcClientConfig {

	
	@Value("${thrift.host}")
	private String host;
	
	@Value("${thrift.port}")
	private int port;
	
	@Value("${thrift.timeout}")
	private int timeout;
	
	@Bean(initMethod="init",name="rpcclient")
	public RpcClient rpcClient(){
		
		RpcClient rpcClient = new RpcClient();
		rpcClient.setHost(host);
		rpcClient.setPort(port);
		rpcClient.setTimeout(timeout);
		
		return rpcClient;
	}
}
