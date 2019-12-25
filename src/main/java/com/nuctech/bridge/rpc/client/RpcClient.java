package com.nuctech.bridge.rpc.client;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nuctech.bridge.rpc.NucDL;

public class RpcClient {

	private final static Logger logger = LoggerFactory.getLogger(RpcClient.class);
	
	private NucDL.Client rpcClient;
	private TBinaryProtocol protocol;
	private TSocket transport;
	private String host;
	private int port;
	private int timeout = 1000*30;//默认30s
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	public NucDL.Client getRpcClient(){
		return rpcClient;
	}
	
	public void init() {
		try {
			
		     transport = new TSocket(host, port,timeout);
		     //设置超时时间
//		     transport.setTimeout(timeout);
		     protocol = new TBinaryProtocol(transport);
		     rpcClient = new NucDL.Client(protocol);
		}catch(Exception ex) {
			
			logger.error("---RpcClient--init error"+ex.getStackTrace());
		}
    }
	
	public void open() throws TTransportException {
        transport.open();
    }

    public void close(){
    	
        transport.close();
    }
    
    public boolean isOpen(){
    	
    	try {
    		
    		rpcClient.Ping();
    		return true;
    	}catch(TTransportException e) {
    		logger.error("TTransportException",e);
    		logger.info("reconnect...................");
    		init();
    	}catch(TException ex) {
    		
    	}
  
//    	return transport.isOpen();
    	return false;
    }
    
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
}
