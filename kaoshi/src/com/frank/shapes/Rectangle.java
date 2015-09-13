package com.frank.shapes;



public class Rectangle implements ShapeIter
{
	double length;  
	double width; 
	
	
	
	public void setLength(double length)
	{
		this.length = length;
	}



	public void setWidth(double width)
	{
		this.width = width;
	}



	@Override
	public double calulateArea()
	{
		double area;
		area = length * width;
		return area;
	}
	
	

}
