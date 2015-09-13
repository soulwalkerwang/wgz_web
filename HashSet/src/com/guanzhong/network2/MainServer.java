package com.guanzhong.network2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
	public static void main(String[] args) throws Exception {
		
		ServerSocket serverSocket = new ServerSocket(4000);
		
		while(true)
		{
			Socket socket = serverSocket.accept();	
			
			new ServerInputThread(socket).start();
			new ServerOutputThread(socket).start();
			
			
		}
		
		
	}

}
