package com.guanzhong.spring.innerbean;

public class Customer 
{
	private Person person;
 

	public void setPerson(Person person) 
	{
		this.person = person;
	}
 
	public Person getPerson()
	{
		return person;
	}

	@Override
	public String toString() 
	{
		return "Customer [person=" + person + "]";
	}
}
