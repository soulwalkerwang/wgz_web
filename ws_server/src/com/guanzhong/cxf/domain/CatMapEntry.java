package com.guanzhong.cxf.domain;

import java.util.List;
import java.util.Map.Entry;

public class CatMapEntry
{
	public static class Entry
	{
		private String key;
		private Cat value;
		public Entry()
		{
			// TODO Auto-generated constructor stub
		}
		
		public Entry(String key, Cat value)
		{
			
			this.key = key;
			this.value = value;
		}
		public String getKey()
		{
			return key;
		}
		public void setKey(String key)
		{
			this.key = key;
		}
		public Cat getValue()
		{
			return value;
		}
		public void setValue(Cat value)
		{
			this.value = value;
		}
		
		
	}
	
	private List<Entry> entries;

	public List<Entry> getEntries()
	{
		return entries;
	}

	public void setEntries(List<Entry> entries)
	{
		this.entries = entries;
	}

}
