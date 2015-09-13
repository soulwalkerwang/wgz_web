package com.guanzhong2;

import java.util.HashSet;

public class SetTest2 {
	
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
//		set.add(new People("zhangsan"));
//		set.add(new People("lisi"));
//		set.add(new People("zhangsan"));
//		
//		People p1 =new People("zhangsan");
//		
//		set.add(p1);
//		set.add(p1);
		
		String s1 = new String("a");
		String s2 = new String("a");
		
		set.add(s1);
		set.add(s2);
		
		
		System.out.println(set);
		
		
	}

}

class People
{
	String name;
	
	public People(String name)
	{
		this.name = name;
		
	}
}