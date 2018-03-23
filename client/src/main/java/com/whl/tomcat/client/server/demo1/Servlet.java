package com.whl.tomcat.client.server.demo1;

public class Servlet {
	public void service(Request req,Response rep){
		rep.println("<html><head><title>HTTP��Ӧʾ��</title>");
		rep.println("</head><body>");
		rep.println("��ӭ:").println(req.getParameter("uname")).println("����");
		rep.println("</body></html>");
	}
}
