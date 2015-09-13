package com.guanzhong2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Iterator;


public class CollectionsTest {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(new Integer(-8));
		list.add(new Integer(20));
		list.add(new Integer(-20));
		list.add(new Integer(8));
		
//		Comparator r = Collections.reverseOrder();
		
//		Collections.sort(list, r);
		
		for(Iterator iter = list.iterator(); iter.hasNext();  )
		{
			System.out.println(iter.next());
		}
		
	}

}
