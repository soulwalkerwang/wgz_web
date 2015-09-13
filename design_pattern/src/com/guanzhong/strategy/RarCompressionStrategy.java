package com.guanzhong.strategy;

import java.io.File;
import java.util.ArrayList;

public class RarCompressionStrategy implements CompressionStrategy
{
	@Override
	public void compressFiles(ArrayList<File> files)
	{
		System.out.println("rar compressing");
		
	}
	

}
