package com.guanzhong.thread;

public class IncreaseThread extends Thread 
{
      private Sample sample;
      
      public IncreaseThread(Sample sample)
      {
    	  this.sample = sample;
      }
      
      @Override
    public void run() {
    	for(int i = 0; i < 20; i++)
    	{
    		try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		sample.increase();
    	}
    }
}
