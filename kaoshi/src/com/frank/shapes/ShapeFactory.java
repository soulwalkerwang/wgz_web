package com.frank.shapes;

public class ShapeFactory
{
	private static ShapeFactory shapeFactory = null;
	
	private ShapeFactory()
	{
		
	}
	
	public static ShapeFactory getInstance()
	{
		if(shapeFactory == null)
		{
			shapeFactory = new ShapeFactory();
		}
		
		return shapeFactory;
	}
	
	public ShapeIter getShape(ShapeType shapeType)
	{
		ShapeIter shapeIter = null;
		try
		{
			shapeIter = (ShapeIter) Class.forName(shapeType.getType()).newInstance();
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return shapeIter;
	}

}
