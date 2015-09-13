package hashcode_equals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App
{
	public static void main(String[] args)
	{
		Set<Person> set1 = new HashSet<Person>();
		
		
		List<Person> list = new ArrayList<Person>();
		
		String[] s = {"1","2","3"};
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.setName("a");
		p1.setAge("24");
		
		p2.setName("b");
		p2.setAge("23");
		
		p3.setName("c");
		p3.setAge("25");
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Collections.sort(list);
		
		for(Person p : list)
		{
			System.out.println(p.getAge());
		}
		
	}

}
