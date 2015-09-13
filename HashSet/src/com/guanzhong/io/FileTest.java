package com.guanzhong.io;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) 
	{
		
	
	  File file = new File("C:/Users/wgz/Google Drive/wgz web/javastudy/text.txt");
	
      try {
		System.out.println(file.createNewFile());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    }
}
