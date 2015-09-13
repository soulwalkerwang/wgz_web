package com.guanzhong.cxf;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.guanzhong.cxf.domain.Cat;
import com.guanzhong.cxf.domain.User;
import com.guanzhong.cxf.service.UserService;
import com.guanzhong.cxf.service.UserServiceImpl;

@WebService(endpointInterface="com.guanzhong.cxf.HelloWorld", serviceName="HelloWorldWs")
public class HelloWorldImpl implements HelloWorld
{

	
	@Override
	public List<Cat> getCatsByUser(User user)
	{
		//should use spring dependency injection
		UserService us = new UserServiceImpl();
		return us.getCatsByUser(user);
	}
	
	@Override
	public Map<String, Cat> getAllCats()
	{
		UserService us = new UserServiceImpl();
		return us.getAllCats();
	}

}
