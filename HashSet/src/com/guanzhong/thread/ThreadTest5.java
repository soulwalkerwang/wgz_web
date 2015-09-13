package com.guanzhong.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;



public class ThreadTest5 
{

	public static void main(String[] args) 
	{
		
		 Example example1 = new Example();
		 
		 Thread t1 = new TheThread1(example1);
		 
		 
		 
		 Thread t2 = new TheThread2(example1);
		 t2.start();
		 t1.start();
		 
	}
	
	
}

class Example
{
	ReadWriteLock lock = new ReentrantReadWriteLock();
	
	
		public void execute()
		{
			Lock writeLock = lock.writeLock();
				for(int i = 0; i < 10; i++)
				{
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("hello: " + i);
				}							
		}
	
	
	    public void execute2()
		{
	    	synchronized(this)
	    	{
	    		for(int i = 0; i < 10; i++)
				{
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("hello: " + i);
				}
	    	}	
		}
		
	
		
		
	
	
}

class TheThread1 extends Thread
{
	private Example example;
	
	public TheThread1(Example example)
	{
		this.example = example;
	}
	
	public void run()
	{
		this.example.execute();
	}
	
	
}

class TheThread2 extends Thread
{
	private Example example;
	
	public TheThread2(Example example)
	{
		this.example = example;
	}
	
	public void run()
	{
		this.example.execute2();
	}
	
	
}
