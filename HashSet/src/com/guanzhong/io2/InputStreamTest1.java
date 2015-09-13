package com.guanzhong.io2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest1 {
	
	public static void main(String[] args) throws IOException 
	{
		
		InputStream is = new FileInputStream("c:/hello.txt");
		
		byte[] buffer = new byte[5];
		
		int length = 0;
		
		while(-1 != (length = is.read(buffer,0,5)))
		{
			String str = new String(buffer,0,length);
			
			System.out.print(str);
		}
		
		is.close();
		
		
	}

}
