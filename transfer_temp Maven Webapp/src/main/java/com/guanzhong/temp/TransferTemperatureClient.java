package com.guanzhong.temp;

import java.util.Scanner;

import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class TransferTemperatureClient
{
	public static void main(String[] args)
	{
		 JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();  
         //factory.getInInterceptors().add(new LoggingInInterceptor());  
         factory.getOutInterceptors().add(new LoggingOutInterceptor());  
         factory.setServiceClass(TransferTemperature.class);  
         factory.setAddress("http://127.0.0.1:8080/transfer_temp/services/TransferTemperature?wsdl");  
         TransferTemperature client = (TransferTemperature) factory.create(); 
         Scanner scanner = new Scanner(System.in);
         System.out.println();
         System.out.println("Input Fahrenheit That You Want Transfer: "); 
         Double f = scanner.nextDouble();
         System.out.println("Input Celsius That You Want Transfer: ");  
         Double c = scanner.nextDouble();
         
         Double replyf = client.toFahrenheit(c);
         Double replyc = client.toCelsius(f); 
         System.out.println("ToFahrenheit result: " + replyf);  
         System.out.println("ToCelsius result: " + replyc);
         System.exit(0);  
           
	}

}
