package com.baili.corejava.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo2
{
	public static void main(String[] args)
	{
		// ArraryList is a collection class, List and Collection are interface
		// ArrayList<String> al = new ArrayList<String>();
		// ArrayList<Integer> al2 = new ArrayList<Integer>();
		List<User> al3 = new ArrayList<User>();
		// User user = new User();
		// String s1 = "a";
		// String s2 = "b";
		// String s3 = "c";
		// al.add(s1);
		// al.add(s3);
		// al.add(s2);
		// al.remove(0);
		// al.get(0);
		// al.size();
		//
		// al3.add(s1);
		// al3.add(1);
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		user1.setUsername("wgz");
		user2.setUsername("lb");
		user3.setUsername("tiny");
		al3.add(user1);
		al3.add(user2);
		al3.add(user3);

		// for(User user : al3)
		// {
		// System.out.println(user.getUsername());
		// }

		// for(Iterator<User> iter = al3.iterator();iter.hasNext();iter.next())
		// {
		// System.out.println(((User)iter).getUsername());
		// }
		//
		// for(User user : al3)
		// {
		// System.out.println(user.getUsername());
		// }

		// StringBuilder sb = new StringBuilder("abc");
		// sb.append("cde");
		// sb.append("aaa").append("dasd").append("asdad");
		// sb.insert(0, "asdasd");
		// String s = sb.toString();

		List<User> list = new LinkedList<User>();

		list.add(user1);
		list.add(user2);

	}
}
