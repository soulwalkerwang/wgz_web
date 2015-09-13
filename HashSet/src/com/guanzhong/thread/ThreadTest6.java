package com.guanzhong.thread;

public class ThreadTest6 {
	
	public static void main(String[] args) {
		
		Example2 e = new Example2();
		
		TheThread3 t1 = new TheThread3(e);
		
		TheThread4 t2 = new TheThread4(e);
		
		t1.start();
		t2.start();
	}

}

class Example2
{
	private Object object = new Object();
	
	public void execute()
	{
		synchronized(object)
		{
			
		
		
		for(int i = 0; i < 50; i++)
		{
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hellow: " + i);
		 }
		}
	}
	
	public  void execute2()
	{
		synchronized(object)
		{
		for(int i = 0; i < 50; i++)
		{
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("world: " + i);
		
		  }
		}
	}
		
	
}

class TheThread3 extends Thread
{
	private Example2 example;
	
	public TheThread3(Example2 example)
	{
		this.example = example;
	}
	
	public void run()
	{
		this.example.execute();
	}
	
	
}

class TheThread4 extends Thread
{
	private Example2 example;
	
	public TheThread4(Example2 example)
	{
		this.example = example;
	}
	
	public void run()
	{
		this.example.execute2();
	}
	
	
}

