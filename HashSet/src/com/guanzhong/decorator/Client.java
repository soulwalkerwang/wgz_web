package com.guanzhong.decorator;

public class Client {
	
	public static void main(String[] args) {
		
		Component component = new ConcreteComponent();
		
		Component component2 = new ConcreteDecorator1(component);
		
		Component component3 = new ConcreteDecorator2(component2);
		
		component3.doSomething();
	}

}
