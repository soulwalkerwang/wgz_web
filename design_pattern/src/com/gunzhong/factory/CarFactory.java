package com.gunzhong.factory;

public class CarFactory
{
	public static Car buildCar(CarType model)
	{
		Car car = null;
		
		switch (model)
		{
		case SMALL: car = new SmallCar(); break;

		case LUXURY: car = new LuxuryCar(); break;
		}
		
		return car;
	}

}
