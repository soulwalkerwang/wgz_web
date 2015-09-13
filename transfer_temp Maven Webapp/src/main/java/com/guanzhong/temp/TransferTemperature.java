package com.guanzhong.temp;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface TransferTemperature
{
	 @WebMethod
	 public double toCelsius(double TF);
	 
	 @WebMethod
	 public double toFahrenheit(double TC);

}
