package com.guanzhong.strategy;

public class App
{
	public static void main(String[] args)
	{
		CompressionContext ctx = new CompressionContext();
		ctx.setStrategy(new ZipCompressionStrategy());
		
		
	}

}
