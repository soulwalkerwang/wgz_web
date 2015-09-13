package com.guanzhong.exception;

public class ExceptionTest4 {
	public void method(String str) throws MyException
	{
		
		if(null == str)
		{
			throw new MyException("Inputting String can not be null");
			
		}
		else
		{
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) throws MyException
    {
		try
		{
		ExceptionTest4 test = new ExceptionTest4();
		
		
		test.method(null);
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Exception handling completed" );
			
		}
		System.out.println("Program execution completed");
	}

}
