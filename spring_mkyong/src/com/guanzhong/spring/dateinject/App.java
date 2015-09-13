package com.guanzhong.spring.dateinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-dateinject-config.xml");
		
		Customer cust = (Customer) context.getBean("customer");
		
		System.out.println(cust);
		
	}

}
