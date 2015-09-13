package com.guanzhong.innerclass;

class MemberInner
{
	private int a = 4;
	
	public class Inner2
	{
		public void doSomething()
		{
			System.out.println("hello world");
		}
	}
}



public class MemberInnerClassTest {
	
	public static void main(String[] args) {
		
		MemberInner.Inner2 inner = new MemberInner().new Inner2();
		
		inner.doSomething();
	}

}
