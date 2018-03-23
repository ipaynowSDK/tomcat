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
public class Server4 {
	private ServerSocket server;
	public static final String CRLF="\r\n";
	public static final String BLANK=" ";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Server4 server = new Server4();
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
			byte[] data=new byte[20480];
			int len =client.getInputStream().read(data);				
			//���տͻ��˵�������Ϣ
			String requestInfo=new String(data,0,len).trim();	
			System.out.println(requestInfo);
			
			
			//��Ӧ
					
			Response rep=new Response(client.getOutputStream());
			rep.println("<html><head><title>HTTP��Ӧʾ��</title>");
			rep.println("</head><body>Hello server!</body></html>");
			rep.pushToClient(200);
			
		
			
		} catch (IOException e) {
		}
	}
	
	/**
	 * ���ŷ�����
	 */
	public void stop(){
		
	}
	
	
}
