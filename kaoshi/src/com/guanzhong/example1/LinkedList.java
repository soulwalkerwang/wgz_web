package com.guanzhong.example1;

public class LinkedList
{
	private Node head;
	private int listCount;
	
	public LinkedList()
	{
		head = new Node(null);
		listCount = 0;
	}
	
	public void add(String data)
	{
		Node temp = new Node(data);
		Node current = head;
	}
	

}


class Node
{
	String data;
	
	Node next;
	
	public Node(String data)
	{
		this.data = data;
	}
	
	public Node(String data, Node next)
	{
		this.data = data;
		this.next = next;
	}

	public String getData()
	{
		return data;
	}

	public void setData(String data)
	{
		this.data = data;
	}

	public Node getNext()
	{
		return next;
	}

	public void setNext(Node next)
	{
		this.next = next;
	}
	
	
	
}