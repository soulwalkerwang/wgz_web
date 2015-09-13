package test;

public class StaticTest
{
	private static String name;
	
	public StaticTest(String name)
	{
		StaticTest.name = name; 
	}

	public static String getName()
	{
		return name;
	}

	public static void setName(String name)
	{
		StaticTest.name = name;
	}
	
	public static void main(String[] args)
	{
		StaticTest s1 = new StaticTest("wgz");
		StaticTest s2 = new StaticTest("lee");
		System.out.println(s1.getName());
		System.out.println(s2.getName());
	}
	
	

}
