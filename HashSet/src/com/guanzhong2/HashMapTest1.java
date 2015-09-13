package com.guanzhong2;

import java.util.HashMap;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;


public class HashMapTest1 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("a","zhangsan");
		map.put("b","lisi");
		map.put("c","wangwu");
		
//		System.out.println(map);
		
		String value1 = (String)map.get("b");
		System.out.println(value1);
		
		Hashtable table = new Hashtable();
		table.put("a","zhangsan");
		table.put("b","lisi");
		table.put("c","wangwu");
		
		String value2 = (String)table.get("c");
		
		System.out.println(value2);
		
		
	}
}
