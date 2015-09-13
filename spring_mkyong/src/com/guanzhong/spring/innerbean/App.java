package com.guanzhong.spring.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"spring-customer.xml"});
		
		Customer cust1 = (Customer)context.getBean("CustomerBean");
		Customer cust2 = (Customer)context.getBean("CustomerBean");
		System.out.println(cust1);
		cust2.getPerson().setName("zhang");
//		Person per1 = new Person();
//		per1.setName("li");
//		per1.setAge(24);
//		per1.setAddress("sterling");
//		cust2.setPerson(per1);
		System.out.println(cust1);
	}

}
