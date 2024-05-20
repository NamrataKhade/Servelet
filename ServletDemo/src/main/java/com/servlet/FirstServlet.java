package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {
	
	//Life Cycle Methods
	
	ServletConfig config;
	
	public void init(ServletConfig config)
	
	{
		this.config=config;
		System.out.println(config+" Creating Object...");
		
	}
	
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		System.out.println("Servicing .....");
		System.out.println("this is my first servlet Servlet Interface-----------------------");
		//set the content of response
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h3>This is my output from servlet method :</h3>");
		out.println("<h3>Todays Date and time is : "+new Date().toString()+"</h3>");
		
		
	}
	
	public void destroy() {
		System.out.println("going to destroy servlet object......");
	}
	
	
	//Non life cycle method override
	
	public ServletConfig getServletConfig() {
		return config;
	}
	
	public String getServletInfo()
	{
		return"This Servlet Created by Namrata";
	}

}
