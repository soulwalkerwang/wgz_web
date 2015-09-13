package com.guanzhong2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HandleData
{
	public static void main(String[] args)
	{
		ArrayList<Data> arrayList = new ArrayList<Data>();
		
		arrayList.add(new Data("zhone", "food", "pistha"));
		arrayList.add(new Data("zhone", "car", "honda"));
		arrayList.add(new Data("peter", "car", "maruthi"));
		arrayList.add(new Data("peter", "car", "honda"));
		arrayList.add(new Data("reddy", "car", "benze"));
		
		System.out.println(getCategory("peter", "honda", arrayList));
		
		System.out.println(countMember("car", arrayList));
		
		System.out.println(countCategory("zhone", "honda", arrayList));
		
		
		
		
		
	}
	
	public static String getCategory(String name, String type, ArrayList<Data> arrayList)
	{
		
		for(Data d : arrayList)
		{
			if(d.getName().equals(name) && d.getType().equals(type))
			{
				return d.getCategory();
			}
		}
		
		return null;
		
	}
	
	public static int countMember(String category, ArrayList<Data> arrayList)
	{
		int count = 0;
		
		for(Data d : arrayList)
		{
			if(d.getCategory().equals(category))
			{
				count++;
			}
		}
		
		return count;
			
	}
	
	public static int countCategory(String name, String type, ArrayList<Data> arrayList)
	{
		Set<String> set = new HashSet<String>();
		
		for(Data d : arrayList)
		{
			if(d.getName().equals(name) && d.getType().equals(type))
			{
				set.add(d.getCategory());
			}
		}
		
		return set.size();
			
	}
	
	

}

class Data
{
	private String name = null;
	private String category = null;
	private String type = null;
	
	public Data(String name, String category, String type)
	{
		this.name = name;
		this.category = category;
		this.type = type;
		
	}
	
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getCategory()
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	
	
}