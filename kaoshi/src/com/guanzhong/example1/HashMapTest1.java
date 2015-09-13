package com.guanzhong.example1;

import java.util.HashMap;
import java.util.Random;

public class HashMapTest1
{
	public HashMap<Integer, Student> buildMap(Student[] student)
	{
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		for(Student s : student)
		{
			map.put(s.getId(), s);
		}
		
		return map;
	}
	
	
	public static void main(String[] args)
	{
		Student[] stu = new Student[5];
		
		for(int i=0 ; i<5 ; i++)
		{
			stu[i] = new Student();
		}
		
		HashMapTest1 test = new HashMapTest1();
		System.out.println(test.buildMap(stu));
	}

}


class Student
{
	private int id;
	
	Student()
	{
		Random rand = new Random();
		this.id = rand.nextInt(20);
	}

	public int getId()
	{
		return id;
	}
	
}


