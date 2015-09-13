package com.guanzhong.thread;

public class ThreadTest4 
{
   public static void main(String[] args) {
	
	 Runnable r = new HelloThread();
	 
	 Thread t1 = new Thread(r);
	 Thread t2 = new Thread(r);
	 
	 t1.start();
	 t2.start();
	   
  }
}

class HelloThread implements Runnable
{
	
	
	public void run() {
		
		int i = 0;
		
		while(true)
		{
			System.out.println("number: " + i++);
			try {
				Thread.sleep((long)Math.random() * 1000000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			if(50 == i)
			{
				break;
			}
				
			
			
			
			
			
			
		}
	}
}
