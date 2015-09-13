package com.gunzhong.factory;

public class App
{
	public static void main(String[] args)
	{
		Car car = CarFactory.buildCar(CarType.SMALL);
		
		car.construct();
		
	}

}
