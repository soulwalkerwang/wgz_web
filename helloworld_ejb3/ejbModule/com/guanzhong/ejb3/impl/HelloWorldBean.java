package com.guanzhong.ejb3.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.guanzhong.ejb3.HelloWorld;


@Stateless
@Remote(HelloWorld.class)
public class HelloWorldBean implements HelloWorld
{

	@Override
	public String sayHello(String name)
	{
		
		return "Hello " + name;
	}

}
