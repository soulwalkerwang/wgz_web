package com.guanzhong.cxf.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.guanzhong.cxf.domain.Cat;
import com.guanzhong.cxf.domain.User;


public class UserServiceImpl implements UserService
{
	//use hashmap to imitate database in memory
	static Map<User, List<Cat>> catDb = new HashMap<User, List<Cat>>();
	
	static 
	{
		List<Cat> catList1 = new ArrayList<Cat>();
		catList1.add(new Cat(1, "garfield", "orange"));
		catList1.add(new Cat(2, "doraemon", "blue"));
		
		catDb.put(new User(1, "Guanzhong", "123456", "Sterling"), catList1);
		
		List<Cat> catList2 = new ArrayList<Cat>();
		catList2.add(new Cat(3, "kitty", "white"));
		catList2.add(new Cat(4, "panda", "black and white"));
		
		catDb.put(new User(2, "Li", "654321", "Sterling"), catList2);
	}

	@Override
	public List<Cat> getCatsByUser(User user)
	{
		
		return catDb.get(user);
	}
	
	@Override
	public Map<String, Cat> getAllCats()
	{
		Map<String, Cat> result = new HashMap<String,Cat>();
		int i = 1;
		for(List<Cat> cats : catDb.values())
		{
			for(Cat cat : cats)
			{
				String temp = String.valueOf(i++);
				
				result.put(temp, cat);
			}
		}
		
		return result;
	}

}
