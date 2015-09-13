package com.guanzhong.endpoint;

import java.util.Date;
import java.util.HashSet;

public class Day extends Date
{
	@Override
	public void setTime(long time)
	{
		System.out.println("sorry can't set time");
	}
	public static void main(String[] args)
	{
		String s1 = "abc";
		String s2 = s1;
		s1 = "def";
		System.out.println(Boolean.TRUE);
		
	}

}
