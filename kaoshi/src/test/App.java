package test;

public class App
{
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		
		Person per1 = new Person();
		per1.setName("wang");
		per1.setAge("24");
		
		Person per2 = new Person();
		per2.setName("wang");
		per2.setAge("24");
		
		a.setPerson(per1);
		b.setPerson(per2);
		
		System.out.println(a.getPerson().getName());
		b.getPerson().setName("zhang");
		System.out.println(a.getPerson().getName());
	}

}
