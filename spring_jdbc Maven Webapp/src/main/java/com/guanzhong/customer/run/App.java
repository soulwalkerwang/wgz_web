
package com.guanzhong.customer.run;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.guanzhong.customer.dao.CustomerDAO;
import com.guanzhong.customer.model.Customer;

public class App
{
	public static void main(String[] args)
	{
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Spring-Module.xml");
		
		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
		
		Customer customer = new Customer();
		customer.setCusId(2);
		customer.setName("Li");
		customer.setAge(23);
		
//		Customer customer1 = customerDAO.findByCustomerId(1);
//	    System.out.println(customer1.getName());
	    
	    List<Customer> list = customerDAO.findAll();
	    
	    for(Customer cus : list)
	    {
	    	System.out.println(cus.getName());
	    }
	   
		
//		customerDAO.insert(customer);
		
		
		
	}

}
