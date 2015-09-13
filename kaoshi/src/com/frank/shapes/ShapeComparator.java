package com.frank.shapes;

import java.util.Comparator;

public class ShapeComparator implements Comparator<ShapeIter>
{
	@Override
	public int compare(ShapeIter o1, ShapeIter o2)
	{
		return (int)(o1.calulateArea() - o2.calulateArea());
	}

}
