package com.guanzhong.io2;

import java.io.File;
import java.util.ArrayList;

public class ListAllTest {
	
	private static int time;
	
	public static void deepList(File file)
	{
		if(file.isFile() || 0 == file.listFiles().length)
		{
			time--;
			return;
		}
		else
		{
			File[] files = file.listFiles();
			
			//System.out.println(files.length);
			
			files = sort(files);
			
			//System.out.println(files.length);
			
			for(File f : files)
			{
				StringBuffer output = new StringBuffer();
				
				if(f.isFile())
				{
					output.append(getTabs(time));
					output.append(f.getName());
					
					
					System.out.println(output);
					
				}
				
				if(f.isDirectory())
				{
					output.append(getTabs(time));
					output.append(f.getName());
					output.append("\\");
					
					System.out.println(output);
					
					time++;
					deepList(f);
					
					
					
				
				}
					
			}
			time--;
			
		}
	}
	
	private static File[] sort(File[] files)
	{
		ArrayList<File> sorted = new ArrayList<File>();
		
		//System.out.println(files.length);
		
		
		for(File f : files)
		{
			if(f.isDirectory())
			{
				sorted.add(f);
			}
		}
		
		
		
		for(File f : files)
		{
			if(f.isFile())
			{
				sorted.add(f);
			}
		}
		
		return sorted.toArray(new File[files.length]);
		
		
	}
	
	private static String getTabs(int time)
	{
		StringBuffer buffer = new StringBuffer();
		
		for(int i = 0; i < time; i++)
		{
			buffer.append("\t");
		}
		
		return buffer.toString();
	}
	
   public static void main(String[] args) 
    {
	   File file = new File("C:/Program Files/Alienware");
	   
	   deepList(file);
	   
	   
	
    }
}
