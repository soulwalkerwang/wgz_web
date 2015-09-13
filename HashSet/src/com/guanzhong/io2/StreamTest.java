package com.guanzhong.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamTest {
	
	public static void main(String[] args) throws Exception 
	{
	      
		FileOutputStream fos = new FileOutputStream("c:/file.txt");
		
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("hellow world");
		
		bw.write("\n");
		
		bw.write("http://www.google.com");
		
		bw.close();
		
		FileInputStream fis = new FileInputStream("c:/file.txt");
		
		InputStreamReader isr = new InputStreamReader(fis);
		
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println(br.readLine());
		
		System.out.println(br.readLine());
		
		br.close();
		
		
		
		
		
		
	      
	}

}
