package com.guanzhong.cxf.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.guanzhong.cxf.domain.Cat;
import com.guanzhong.cxf.domain.CatMapEntry;
import com.guanzhong.cxf.domain.CatMapEntry.Entry;


public class CatXMLAdapter extends XmlAdapter<CatMapEntry, Map<String, Cat>>
{
	@Override
	public CatMapEntry marshal(Map<String, Cat> v) throws Exception
	{
		System.out.println(v);
		CatMapEntry cme = new CatMapEntry();
		
		cme.setEntries(new ArrayList<Entry>());
		for(String key : v.keySet())
		{
			System.out.println(key);
			System.out.println(v.get(key));
			cme.getEntries().add(new Entry(key, v.get(key)));
		}
		
		return cme;
	}
	
	@Override
	public Map<String, Cat> unmarshal(CatMapEntry v) throws Exception
	{
		Map<String, Cat> result = new HashMap<String, Cat>();
		for(Entry entry : v.getEntries())
		{
			result.put(entry.getKey(), entry.getValue());
		}
		
		return result;
	}
	
}
