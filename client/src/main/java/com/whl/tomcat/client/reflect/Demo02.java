package com.whl.tomcat.client.reflect;


import com.whl.tomcat.client.server.demo1.Servlet;

/**
 * ����ʵ��  ���ÿչ���
 * @author Administrator
 *
 */
public class Demo02 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> clz =Class.forName("com.bjsxt.server.demo03.LoginServlet");
		// ���ÿչ��� ȷ���չ������
		Servlet ser=(Servlet)clz.newInstance();
		//retrun ser;
	}

}
