package com.frank.shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test
{
	public static void main(String[] args) throws IOException
	{
		List<ShapeIter> list = new ArrayList<ShapeIter>();
		boolean flag = true;
		while(flag)
		{
			System.out.println("which shape you want to create?");
			System.out.println("1.Circle. 2.Rectangle. 3.Square. 4.Exit");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			switch(Integer.parseInt(br.readLine()))
			{
			   case 1 : 
				   Circle circle = (Circle) ShapeFactory.getInstance().getShape(ShapeType.CIRCLE);
				   System.out.println("Please input the radius :");
				   circle.setRadius(Double.parseDouble(br.readLine()));
				   list.add(circle); break;
			   case 2 :
				   Rectangle rectangle = (Rectangle)ShapeFactory.getInstance().getShape(ShapeType.RECTANGLE);
				   System.out.println("Please input the width :");
				   rectangle.setWidth(Double.parseDouble(br.readLine()));
				   System.out.println("Please input the length :");
				   rectangle.setLength(Double.parseDouble(br.readLine()));
				   list.add(rectangle); break;
			   case 3 :
				   Square square = (Square) ShapeFactory.getInstance().getShape(ShapeType.SQUARE);
				   System.out.println("Please input the side :");
				   square.setSide(Double.parseDouble(br.readLine()));
				   list.add(square); break;
			   case 4 :
				   flag = false;
				   br.close();
				   break;
			
			}
			
			
			
			
		}
		
		System.out.println("Before sort");
		
		for(ShapeIter shape : list)
		{
			System.out.println(shape.calulateArea());
			
		}
		
		Collections.sort(list, new ShapeComparator());
		System.out.println("---------------------");
		
		System.out.println("After sort");
		for(ShapeIter shape : list)
		{
			System.out.println(shape.calulateArea());
			
		}
		
	}
		
		

}
