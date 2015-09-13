package com.guanzhong.overloadtest;

public class Parent
{
	public static void print(int a)
	{
		System.out.println("This is parent " + a);
	}
	
	public void print(Boolean a)
	{
		System.out.println("This is parent " + a);
	}
	
	public static void sayHi()
	{
		System.out.println("parent say hi");
	}

}
