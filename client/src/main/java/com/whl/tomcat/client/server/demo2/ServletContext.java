package com.whl.tomcat.client.server.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * ������
 * @author Administrator
 *
 */
public class ServletContext {
	//Ϊÿһ��servletȡ������  
	// login  -->LoginServlet
	private Map<String,Servlet> servlet ;
	//url -->login
	//   /log -->login
	//   /login -->login
	private Map<String,String> mapping;
	
	ServletContext(){
		servlet =new HashMap<String,Servlet>();
		mapping =new HashMap<String,String>();
	}
	
	
	public Map<String, Servlet> getServlet() {
		return servlet;
	}
	public void setServlet(Map<String, Servlet> servlet) {
		this.servlet = servlet;
	}
	public Map<String, String> getMapping() {
		return mapping;
	}
	public void setMapping(Map<String, String> mapping) {
		this.mapping = mapping;
	}
	
	
	
	
}
