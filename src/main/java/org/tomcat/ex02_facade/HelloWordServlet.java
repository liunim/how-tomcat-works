package org.tomcat.ex02_facade;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWordServlet extends HttpServlet {

	private static final long serialVersionUID = 7695723329584767450L;
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response){
		try {
			response.getWriter().write("Hello Word !!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response){
		doGet(request, response);
	}
}
