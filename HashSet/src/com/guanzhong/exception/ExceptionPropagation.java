package com.guanzhong.exception;

public class ExceptionPropagation
{
	void method1()
	{
		try
		{
			method2();
			
		}
		catch (Exception e)
		{
			System.out.println("handle exception");
		}
	}
	void method2() throws Exception
	{
		method3();
	}
	void method3()  throws Exception
	{
		throw new java.io.IOException("checked exception");
	}
	
	public static void main(String[] args)
	{
		ExceptionPropagation ep = new ExceptionPropagation();
		ep.method1();
	}

}
