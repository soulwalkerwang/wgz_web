package com.guanzhong.example1;

import java.util.ArrayList;

public class ArrayListTest1
{
	public ArrayList<String> merge(String[] word, String[] more)
	{
		ArrayList<String> list = new ArrayList<String>();
		for(String w : word) list.add(w);
		for(String w : more) list.add(w);
		
		return list;
	}
	
	public static void main(String[] args)
	{
		String[] word = {"a","b","c","d"};
		String[] more = {"e","f","g","h"};
		
		ArrayListTest1 alt = new ArrayListTest1();
		System.out.println(alt.merge(word, more));
		
	}

}
