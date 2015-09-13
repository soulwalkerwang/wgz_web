package com.guanzhong.io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest1 {
	
	public static void main(String[] args) throws Exception
	{
		
		OutputStream os = new FileOutputStream("c:/out.txt");
		
		//String str = "hello world";
		
		//byte[] buffer = str.getBytes();
		
		os.write("hello world".getBytes());
		
		os.close();
		
		
	}

}
