package com.guanzhong.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ReadWriteLock内置两个Lock，一个是读的Lock，一个是写的Lock。 多个线程可同时得到读的Lock，但只有一个线程能得到写的Lock，
 * 而且写的Lock被锁定后，任何线程都不能得到Lock。ReadWriteLock提供的方法有： readLock(): 返回一个读的lock
 * writeLock(): 返回一个写的lock, 此lock是排他的。 ReadWriteLockTest很适合处理类似文件的读写操作。
 * 读的时候可以同时读，但不能写；写的时候既不能同时写也不能读。
 */
public class ReadWriteLockTest
{
	// 锁
	ReadWriteLock lock = new ReentrantReadWriteLock();
	// 值
	double value = 0d;
	int addtimes = 0;

	/**
	 * 增加value的值，不允许多个线程同时进入该方法
	 */
	public void addValue(double v)
	{
		// 得到writeLock并锁定
		Lock writeLock = lock.writeLock();
		writeLock.lock();
		System.out.println("ReadWriteLockTest to addValue: " + v + "   "
				+ System.currentTimeMillis());
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
		}
		try
		{
			// 做写的工作
			this.value += v;
			this.addtimes++;
			System.out.println("WRITE DONE");
		} finally
		{
			// 释放writeLock锁
			writeLock.unlock();
		}
	}

	/**
	 * 获得信息。当有线程在调用addValue方法时，getInfo得到的信息可能是不正确的。
	 * 所以，也必须保证该方法在被调用时，没有方法在调用addValue方法。
	 */
	public String getInfo()
	{
		// 得到readLock并锁定
		Lock readLock = lock.readLock();
		readLock.lock();
		System.out.println("ReadWriteLockTest to getInfo   "
				+ System.currentTimeMillis());
		try
		{
			Thread.sleep(4000);
		} catch (InterruptedException e)
		{
		}
		try
		{
			// 做读的工作
			return this.value + " : " + this.addtimes;
		} finally
		{
			// 释放readLock
			readLock.unlock();
		}
	}

	public static void testReadWriteLockTest() throws Exception
	{
		final ReadWriteLockTest readWriteLockTest = new ReadWriteLockTest();
		// 新建任务1，调用lockTest的addValue方法
		Runnable task_1 = new Runnable()
		{
			public void run()
			{
				readWriteLockTest.addValue(55.55);
			}
		};
		// 新建任务2，调用lockTest的getValue方法
		Runnable task_2 = new Runnable()
		{
			public void run()
			{
				System.out.println("info: " + readWriteLockTest.getInfo());
			}
		};
		// 新建任务执行服务
		ExecutorService cachedService_1 = Executors.newCachedThreadPool();
		Future future_1 = null;
		// 同时执行5个任务，其中前2个任务是task_1，后两个任务是task_2
		for (int i = 0; i < 20; i++)
		{
			future_1 = cachedService_1.submit(task_2);
		}
		for (int i = 0; i < 4; i++)
		{
			future_1 = cachedService_1.submit(task_1);
		}
		for (int i = 0; i < 4; i++)
		{
			future_1 = cachedService_1.submit(task_2);
		}
		
		
		// 这5个任务的执行顺序应该是：
		// 第一个task_1先执行，第二个task_1再执行；这是因为不能同时写，所以必须等。
		// 然后2个task_2同时执行；这是因为在写的时候，就不能读，所以都等待写结束，
		// 又因为可以同时读，所以它们同时执行
		// 最后一个task_1再执行。这是因为在读的时候，也不能写，所以必须等待读结束后，才能写。

		// 等待最后一个task_2被执行完
		future_1.get();
		cachedService_1.shutdownNow();
	}

	public static void main(String[] args) throws Exception
	{

		System.out.println("---------------------");
		ReadWriteLockTest.testReadWriteLockTest();
	}
}
