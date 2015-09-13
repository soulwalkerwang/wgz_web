package com.guanzhong.string;

public class StringTest
{
	public static void main(String[] args)
	{
		String alphabetic= "abcdefghijklmnopqrstuvwxyz";
		String alp1 = "1234";
		String alp2 = "abcde";
		char[] data1 = {'a','b','c','d','e'};
		
//		for(int i = 0; i < alphabetic.length(); i++)
//		{
//			System.out.println(alphabetic.charAt(i));
//			if(alphabetic.charAt(i) == 'f')
//				System.out.println("---------");
//		}
		
		System.out.println(alphabetic.codePointAt(1));
		System.out.println(alphabetic.codePointBefore(1));
		System.out.println(alphabetic.codePointCount(0, 5));
		
		System.out.println(alp1.compareTo(alphabetic));
		System.out.println(alphabetic.concat(alp1));
		System.out.println(alphabetic.contains(alp2));
		
		//System.out.println(alphabetic.copyValueOf(data1,2,2));
		System.out.println(alphabetic.hashCode());
		System.out.println(alphabetic.getBytes());
		System.out.println(alphabetic.indexOf("efg"));
		
		
	}

}
