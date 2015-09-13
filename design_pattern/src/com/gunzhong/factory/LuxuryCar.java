package com.gunzhong.factory;

public class LuxuryCar extends Car
{
	public LuxuryCar()
	{
		super(CarType.LUXURY);
		construct();
	}
	
	@Override
	protected void construct()
	{
		System.out.println("Building luxury car");
		
	}
	

}
