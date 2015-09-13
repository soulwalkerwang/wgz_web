package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondMax
{
	public static Integer findSecondLargest(List<Integer> integerList)
	{
		Object[] a = integerList.toArray();
		int temp;
		for(int i = 1; i<a.length; i++)
		{
			int j = i-1;
			temp = (int) a[i];
			for(; j >= 0&&temp<(int)a[j];j--)
			{
				a[j+1] = a[j];
			}
			
			a[j+1]=temp;
		}
		
		return (Integer)a[1];
	}
	
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(5);
		System.out.println(findSecondLargest(list));
	}

}
