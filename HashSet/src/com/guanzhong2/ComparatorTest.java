package com.guanzhong2;

import java.util.Arrays;
import java.util.Comparator;


public class ComparatorTest
{
	public static void main(String[] args)
	{
		Number[] number = new Number[4];
		number[0] = new Number(3);
		number[1] = new Number(4);
		number[2] = new Number(7);
		number[3] = new Number(1);
		
		Arrays.sort(number);
		
		for(Number n : number)
		{
			System.out.println(n.getNum());
		}
		
		Arrays.sort(number, Number.NumberComparator);
		
		System.out.println("----------------------");
		
		for(Number n : number)
		{
			System.out.println(n.getNum());
		}

		
	}

}

class Number implements Comparable<Number>
{
	private int num = 0;
	
	public Number(int num)
	{
		this.num = num;
	}

	public int getNum()
	{
		return num;
	}

	public void setNum(int num)
	{
		this.num = num;
	}
	
	public int compareTo(Number o)
	{
		return this.num - o.getNum();
		
	}
	
	public static Comparator<Number> NumberComparator = 
			new Comparator<Number>() {
		       
		      public int compare(Number o1, Number o2) {
		    	  
		    	  return o2.compareTo(o1);
		    	  
		      };
		
		
			};
	
}
