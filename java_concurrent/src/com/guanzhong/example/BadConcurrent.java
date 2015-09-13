package com.guanzhong.example;


public class BadConcurrent implements Runnable
{
	public BadConcurrent()
	{
		synchronized (BadConcurrent.class)
		{
			
		}
	}
	static
	{
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (BadConcurrent.class)
		{
			
		}
	}
	
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
		for(int i=0; i<10; i++)
		{
			BadConcurrent bc = new BadConcurrent();
			Thread t = new Thread(bc);
			t.start();
		}
	}

}
