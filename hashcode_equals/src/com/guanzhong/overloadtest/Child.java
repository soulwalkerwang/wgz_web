package com.guanzhong.overloadtest;

import java.util.HashMap;

public class Child extends Parent
{
	public static void print(int a)
	{
		System.out.println("This is child " + a);
	}
	
	public static void sayHi()
	{
		System.out.println("child say hi");
	}
	
	public static void main(String[] args)
	{
		Parent p1 = new Child();
		p1.print(false);
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
		
		Child c = new Child();
		c.print(1);
		p1.sayHi();
		
	}

}
