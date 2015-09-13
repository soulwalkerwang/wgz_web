package com.guanzhong.temp;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class TransferTemperatureImpl implements TransferTemperature
{
	
	public double toCelsius(double TF)
	{
		return (5d / 9d) * (TF - 32);
	}
	
	public double toFahrenheit(double TC)
	{
		return (9d / 5d) * (TC + 32); 
	}
	public static void main(String[] args)
	{
		TransferTemperatureImpl transferTemperatureImpl = new TransferTemperatureImpl();
		JaxWsServerFactoryBean svrFactory = new JaxWsServerFactoryBean(); 
		
		svrFactory.setServiceClass(TransferTemperature.class);  
	  
	    svrFactory.setAddress("http://localhost:9999/transfertemp");  
	    svrFactory.setServiceBean(transferTemperatureImpl);  
	    svrFactory.getInInterceptors().add(new LoggingInInterceptor());  
	    svrFactory.getOutInterceptors().add(new LoggingOutInterceptor());  
	    svrFactory.create();  
	}

}
