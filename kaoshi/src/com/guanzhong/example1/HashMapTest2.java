package com.guanzhong.example1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest2
{
	public static void main(String[] args)
	{
		Map<Integer, User> userMap = new HashMap<Integer,User>();
		
		userMap.put(1, new User("aaa","111"));
		userMap.put(2, new User("bbb","222"));
		userMap.put(3, new User("ccc","333"));
		userMap.put(4, new User("ddd","444"));
		userMap.put(5, new User("eee","555"));
		
		Iterator<Entry<Integer, User>> iter = userMap.entrySet().iterator();
		while (iter.hasNext())
		{
			Entry<Integer, User> entry = iter.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName());
			
		}
	}
	
	

}

class User
{
	private String name;
	private String password;
	
	public User()
	{
		
	}
	public User(String name, String password)
	{
		super();
		this.name = name;
		this.password = password;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
}
