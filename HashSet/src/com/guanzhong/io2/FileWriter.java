package com.guanzhong.io2;

public class FileWriter {
	
	public static void main(String[] args) throws Exception
	{
		String str = "hello world welcome nihao hehe";
		
		char[] buffer = new char[str.length()];
		
		str.getChars(0, str.length(), buffer, 0);
		
		java.io.FileWriter f = new java.io.FileWriter("c:/file2.txt");
		
		for(int i=0; i<buffer.length; i++)
		{
			f.write(buffer[i]);
			
		}
		f.close();
		
	}

}
