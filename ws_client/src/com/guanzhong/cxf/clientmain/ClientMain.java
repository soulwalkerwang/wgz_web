package com.guanzhong.cxf.clientmain;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.guanzhong.cxf.Cat;
import com.guanzhong.cxf.CatMapEntry;
import com.guanzhong.cxf.Entry;
import com.guanzhong.cxf.HelloWorld;
import com.guanzhong.cxf.HelloWorldWs;
import com.guanzhong.cxf.User;

public class ClientMain
{
	public static void main(String[] args)
	{
		HelloWorldWs factory = new HelloWorldWs();
		
		//return proxy of remote service
		HelloWorld hw = factory.getHelloWorldImplPort();
		
		
//		
//		User user = new User();
//		user.setName("Guanzhong");
//		user.setPassword("123456");
//		user.setId(1);
//		
//		List<Cat> cats = hw.getCatsByUser(user);
//		for(Cat cat : cats)
//		{
//			System.out.println(cat.getName());
//		}
//		
		CatMapEntry cme = hw.getAllCats();
		for(Entry entry : cme.getEntries())
		{
			System.out.println(entry.getKey() + entry.getValue().getName());
		}
		
		
		
		
	}

}
