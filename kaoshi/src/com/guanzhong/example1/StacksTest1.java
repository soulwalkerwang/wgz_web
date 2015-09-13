package com.guanzhong.example1;

public class StacksTest1
{
	
	Node2 top;
	
	Object pop()
	{
		if(top != null)
		{
		  Object item = top.data;
		  top = top.next;
		  return item;
		}
		
		return null;
	}
	
	void push(Object item)
	{
		Node2 t = new Node2(item);
		t.next = top;
		top = t;
		
	}
	
	Object peek()
	{
		return top.data;
	}
	
	
	

}

class Node2
{
	Object data;
	
	Node2 next;
	
	public Node2(Object data)
	{
		this.data = data;
	}
	
	
	
}