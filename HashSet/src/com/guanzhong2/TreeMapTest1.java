package com.guanzhong2;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest1
{
	public static void main(String[] args)
	{
            TreeMap<String, String> map = new TreeMap<String, String>();
		
		    map.put("a","zhangsan");
		    map.put("b","lisi");
		    map.put("c","wangwu");
		

		
		    Set<String> keys = map.keySet();
	        for(String key: keys){
	            System.out.println(key);
	        }
		
		
	}

	
	  

}
