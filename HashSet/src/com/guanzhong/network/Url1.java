package com.guanzhong.network;

import java.net.MalformedURLException;
import java.net.URL;

public class Url1 {

	public static void main(String[] args) throws MalformedURLException 
	{
		
		URL url = new URL("http://www.google.com:80");
		
		String protocal = url.getProtocol();		
		String host = url.getHost();
		String file = url.getFile();
		int port = url.getPort();
		String ref = url.getRef();
		
		System.out.println(protocal);
		System.out.println(host);
		System.out.println(file);
		System.out.println(port);
		System.out.println(ref);
		
		
		
		
	}
}
