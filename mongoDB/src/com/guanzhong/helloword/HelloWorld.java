package com.guanzhong.helloword;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class HelloWorld
{
	public static void main(String[] args) throws Exception
	{
		MongoClient mongo = new MongoClient("127.0.0.1",27017 );
		
		DB db = mongo.getDB("wgz");
		List<String> dbs = mongo.getDatabaseNames();
		for(String name : dbs)
		{
			System.out.println(name);
		}
		
		System.out.println("-------------");
		
		Set<String> collections = db.getCollectionNames();
		for(String c : collections)
		{
			System.out.println(c);
		}
		
		DBCollection dbc = db.getCollection("testData");
//		BasicDBObject document = new BasicDBObject();
//		document.put("name", "xiaoming");
//		document.put("age", "25");
//		document.put("createDate", new Date());
//		dbc.insert(document);
		
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("name", 1);
	 
		DBCursor cursor = dbc.find(new BasicDBObject(),searchQuery);
	 
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}
	}

	
}
