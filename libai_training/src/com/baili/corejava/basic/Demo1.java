package com.baili.corejava.basic;

public class Demo1
{
	//primitive type
	private int i = 1;
	
	//String is a class
	private String s = "123";
	private float f = 1.0f;
	
	//source->generate getter and setter
	public int getI()
	{
		return i;
	}

	public void setI(int i)
	{
		this.i = i;
	}


	public static void main(String[] args)
	{ 
		/**
		Demo1 demo1 = new Demo1();
		demo1.setI(2);
		System.out.println(demo1.getI()); **/
		
		//Integer intger1 = new Integer(2);
		
		//Auto boxing
//		Integer intger2 = 3;
		//Auto unboxing
//		int i2 = new Integer(4);
		
		//String to int
//		int i4 = Integer.valueOf("22");
//		System.out.println(i4);
		
		//Int to String
//		int i3 = 4; 
//		Integer i = 4;
//		String s = i.toString();
		
//		String s2 = String.valueOf(i3);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Short.MAX_VALUE);
		
//		int i = new Integer(1);
//		float f = new Float(1.0);
//		double d = new Double(1.0);
//		char c = new Character('c');
//		long l = new Long(1);
//		short s = new Short((short) 1);
//		byte b = new Byte((byte) 1);
//		boolean be = new Boolean(true);
		
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		String s2 = "ABC";
		String s3 = null;
		String s4 = "";
//		if(s3 == null)
//			System.out.println(s3);
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.toUpperCase());
//		System.out.println(s2.toLowerCase());
//		System.out.println(s1.length());
//		System.out.println(s1.indexOf("c"));
//		System.out.println(s1.endsWith("xyz"));
//		System.out.println(s1.startsWith("abc"));
//		System.out.println(s1.trim());
//		String ss = null;
//		System.out.println(ss == null? false: ss.toUpperCase());
//		System.out.println(ss.toUpperCase());
		
		System.out.println(s4.isEmpty());
		System.out.println(s1.substring(s1.indexOf("f"), s1.indexOf("q")+1));
//		for(int i = 0; i<s1.length(); i++)
//		{
//			
//			System.out.print((i%2 == 0 || i==0)?((Character)s1.charAt(i)).toString().toUpperCase():((Character)s1.charAt(i)).toString());
//		}
		
		
		
		
	}
}
