package com.guanzhong.dynamicproxy;

public class RealSubject implements Subject {

	public void request() 
	{
		System.out.println("From real subject");

	}

}
