package com.whl.tomcat.client.server.demo1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ������������������
 * 
 * 1������
 * 2����Ӧ
 * @author Administrator
 *
 */
public class Server6 {
	private ServerSocket server;
	public static final String CRLF="\r\n";
	public static final String BLANK=" ";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Server6 server = new Server6();
		server.start();
		
		
	}
	/**
	 * ��������
	 */
	public void start(){		
		try {
			server = new ServerSocket(8888);
			this.receive();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	/**
	 * ���տͻ���
	 */
	private void receive(){
		try {
			Socket client =server.accept();			
			Servlet serv =new Servlet();
			Request req =new Request(client.getInputStream());
			Response rep =new Response(client.getOutputStream());
			serv.service(req,rep); 				
			rep.pushToClient(200);	
			
		} catch (IOException e) {
		}
	}
	
	/**
	 * ֹͣ������
	 */
	public void stop(){
		
	}
	
	
}
