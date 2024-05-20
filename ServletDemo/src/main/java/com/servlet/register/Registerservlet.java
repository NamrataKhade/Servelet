package com.servlet.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Registerservlet extends HttpServlet{
	
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Welcome To Register Servlet</h2>");
	
		//Fetch data
		
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		String email=request.getParameter("email");
		String dateofbirth=request.getParameter("dob");
		String gender=request.getParameter("gender");
		String course=request.getParameter("courses");
		
		String cond=request.getParameter("check");
		
		out.println(cond);
		
		if(cond!=null)
		{
		if(cond.equals("checked"))
		{
			out.println("<h2> Name:" +name+ "</h2>");
			out.println("<h2> Password:" +pass+ "</h2>");
			out.println("<h2> Email:" +email+ "</h2>");
			out.println("<h2> Date of Birth:" +dateofbirth+ "</h2>");
			out.println("<h2> Gender:" +gender+ "</h2>");
			out.println("<h2> Courses:" +course+ "</h2>");
			
			
			//
			//JDBC 
			
			RequestDispatcher rd=request.getRequestDispatcher("success");
			rd.forward(request, response);
		}
		else {
			out.println("<h3>You have NOT accept terms and conditions </h3>");
		}
		}
		else {
			out.println("<h3>You have NOT accept terms and conditions </h3>");
			out.println("--------------------------------------------------------------------------------------------------------------");
			
			//i want to include output of index.html
			//get the object of -RequestDispatcher 
			
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			
			//include method
			rd.include(request, response);
			
		}
		
		
		
		
		
	}

}
