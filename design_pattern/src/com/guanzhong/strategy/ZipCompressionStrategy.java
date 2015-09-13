package com.guanzhong.strategy;

import java.io.File;
import java.util.ArrayList;


public class ZipCompressionStrategy implements CompressionStrategy
{
	@Override
	public void compressFiles(ArrayList<File> files)
	{
			System.out.println("zip compressing");
			
	}
}



