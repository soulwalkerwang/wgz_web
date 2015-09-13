package com.guanzhong.example;

public class ThreadDemo1
{
	
	public static void main(String[] args)
	{
		final Business business = new Business();
		Thread thread1 = new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				for(int i=0;i<50;i++)
				{
					business.subThreadPrint(i);
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<50;i++)
				{
					business.mainThreadPrint(i);
				}
			}
		});
		
		thread1.start();
		thread2.start();
	}

}





class Business
{
	boolean flag = true;
	public synchronized void subThreadPrint(int i)
	{
		while(!flag)
		{
			try
			{
				this.wait();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int j=0; j<10; j++)
		{
			System.out.println("Sub thread running" + i +" " + j);
		}
		flag = false;
		this.notify();
	}
	
	public synchronized void mainThreadPrint(int i)
	{
		while(flag)
		{
			try
			{
				this.wait();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int j=0; j<50; j++)
		{
			System.out.println("Main thread running" + i +" " + j);
		}
		flag = true;
		this.notify();
	}
}