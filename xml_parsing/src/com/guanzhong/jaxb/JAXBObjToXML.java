package com.guanzhong.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JAXBObjToXML
{
	public static void main(String[] args)
	{
		Customer customer = new Customer();
		customer.setId(100);
		customer.setName("guanzhong");
		customer.setAge(29);
		
		try
		{
			File file = new File("C:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	 
			jaxbMarshaller.marshal(customer, file);
			jaxbMarshaller.marshal(customer, System.out);
			
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
