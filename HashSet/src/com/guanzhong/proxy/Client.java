package com.guanzhong.proxy;

public class Client {

	public static void main(String[] args) {
		
		Subject subject = new ProxySubject();
		
		subject.request();
		
		Subject subject2 = new RealSubject();
		
		subject2.request();
		
		
		
	}
	
}
