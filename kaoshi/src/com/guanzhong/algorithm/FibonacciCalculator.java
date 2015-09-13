package com.guanzhong.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciCalculator
{
	public static void main(String[] args)
	{
		System.out.println("Enter number upto which Fibonacci series to print: ");
		
		int number = new Scanner(System.in).nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		
		for(int i =1; i <= number; i++)
		{
			list.add(fibonacci(i));
			
		}
		System.out.println(list);
		System.out.println(evenSum(list));
		
		
		
		
	}
	
	public static int fibonacci(int number)
	{
		if(number == 1 || number == 2)
		{
			return 1;
		}
		
		return fibonacci(number - 1) + fibonacci(number - 2);
	}
	
	public static int evenSum(List<Integer> list)
	{
		int sum = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i)%2 == 0)
			{
				sum = sum + list.get(i);
			}
			
		}
		return sum;
	}

}
