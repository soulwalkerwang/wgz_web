package com.frank.shapes;

public enum ShapeType
{
	
	CIRCLE("com.frank.shapes.Circle"), 
	SQUARE("com.frank.shapes.Square"), 
	RECTANGLE("com.frank.shapes.Rectangle");
	
	String type = "";
	private ShapeType(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}

}
