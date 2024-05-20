package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet_Generic extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("This is 2nd servlet using generic servlet....>>>>>>>");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2>This is my second servlet using generic servlet</h2>");
	}

}
