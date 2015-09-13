package com.guanzhong.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ReadWriteLock��������Lock��һ���Ƕ���Lock��һ����д��Lock�� ����߳̿�ͬʱ�õ�����Lock����ֻ��һ���߳��ܵõ�д��Lock��
 * ����д��Lock���������κ��̶߳����ܵõ�Lock��ReadWriteLock�ṩ�ķ����У� readLock(): ����һ������lock
 * writeLock(): ����һ��д��lock, ��lock�������ġ� ReadWriteLockTest���ʺϴ��������ļ��Ķ�д������
 * ����ʱ�����ͬʱ����������д��д��ʱ��Ȳ���ͬʱдҲ���ܶ���
 */
public class ReadWriteLockTest
{
	// ��
	ReadWriteLock lock = new ReentrantReadWriteLock();
	// ֵ
	double value = 0d;
	int addtimes = 0;

	/**
	 * ����value��ֵ�����������߳�ͬʱ����÷���
	 */
	public void addValue(double v)
	{
		// �õ�writeLock������
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
			// ��д�Ĺ���
			this.value += v;
			this.addtimes++;
			System.out.println("WRITE DONE");
		} finally
		{
			// �ͷ�writeLock��
			writeLock.unlock();
		}
	}

	/**
	 * �����Ϣ�������߳��ڵ���addValue����ʱ��getInfo�õ�����Ϣ�����ǲ���ȷ�ġ�
	 * ���ԣ�Ҳ���뱣֤�÷����ڱ�����ʱ��û�з����ڵ���addValue������
	 */
	public String getInfo()
	{
		// �õ�readLock������
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
			// �����Ĺ���
			return this.value + " : " + this.addtimes;
		} finally
		{
			// �ͷ�readLock
			readLock.unlock();
		}
	}

	public static void testReadWriteLockTest() throws Exception
	{
		final ReadWriteLockTest readWriteLockTest = new ReadWriteLockTest();
		// �½�����1������lockTest��addValue����
		Runnable task_1 = new Runnable()
		{
			public void run()
			{
				readWriteLockTest.addValue(55.55);
			}
		};
		// �½�����2������lockTest��getValue����
		Runnable task_2 = new Runnable()
		{
			public void run()
			{
				System.out.println("info: " + readWriteLockTest.getInfo());
			}
		};
		// �½�����ִ�з���
		ExecutorService cachedService_1 = Executors.newCachedThreadPool();
		Future future_1 = null;
		// ͬʱִ��5����������ǰ2��������task_1��������������task_2
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
		
		
		// ��5�������ִ��˳��Ӧ���ǣ�
		// ��һ��task_1��ִ�У��ڶ���task_1��ִ�У�������Ϊ����ͬʱд�����Ա���ȡ�
		// Ȼ��2��task_2ͬʱִ�У�������Ϊ��д��ʱ�򣬾Ͳ��ܶ������Զ��ȴ�д������
		// ����Ϊ����ͬʱ������������ͬʱִ��
		// ���һ��task_1��ִ�С�������Ϊ�ڶ���ʱ��Ҳ����д�����Ա���ȴ��������󣬲���д��

		// �ȴ����һ��task_2��ִ����
		future_1.get();
		cachedService_1.shutdownNow();
	}

	public static void main(String[] args) throws Exception
	{

		System.out.println("---------------------");
		ReadWriteLockTest.testReadWriteLockTest();
	}
}
