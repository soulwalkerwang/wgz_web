package com.guanzhong.thread;

public class ThreadTest3 {
	
	public static void main(String[] args) {
		
	
//	Thread t1 = new Thread(new Runnable() {
//		
//		public void run() {
//			for(int i =0; i < 100; i++)
//			{
//				System.out.println("hello :" + i);
//			}
//			
//		}
//	});
//	
//	t1.start();
//	}
		
		Thread t1 = new Thread(new MyThread1());
		
		t1.start();
		
		Thread t2 = new Thread(new MyThread2());
		
		t2.start();
	}
}

class MyThread1 implements Runnable
{
	public void run() {
		
		for(int i = 0; i < 100; i++)
		{
			System.out.println("hello : " + i);
			
		}
		
	}
}


class MyThread2 implements Runnable
{
	public void run() {
		
		for(int i = 0; i < 100; i++)
		{
			System.out.println("welcome: " + i);
		}
		
	}
}





