package com.guanzhong.cxf.server;

import javax.xml.ws.Endpoint;

import com.guanzhong.cxf.HelloWorld;
import com.guanzhong.cxf.HelloWorldImpl;

public class ServerMain
{
	public static void main(String[] args)
	{
		HelloWorld hw = new HelloWorldImpl();
		Endpoint.publish("http://127.0.0.1:8888/helloworld", hw);
		
		System.out.println("SUCCESS");
	}

}
