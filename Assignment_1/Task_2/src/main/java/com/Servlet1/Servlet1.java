package com.Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet1", urlPatterns = { "/Servlet1" })
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		System.out.println("Hello World in Servlet");
		PrintWriter out=response.getWriter();
		out.println("<H1>Hello World from Servlet</H1>");
	}

}
