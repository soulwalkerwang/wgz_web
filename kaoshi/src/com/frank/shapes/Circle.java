package com.frank.shapes;



public class Circle implements ShapeIter
{
	final static double PI = 3.14;
	double radius;
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}


	@Override
	public double calulateArea()
	{
		double area;
		area = PI * (radius * radius);
		return area;
	}
	

}
