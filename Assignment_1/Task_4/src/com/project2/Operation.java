package com.project2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Operation extends HttpServlet{
public void service(HttpServletRequest req, HttpServletResponse res)
{
	double num1=Double.parseDouble(req.getParameter("num1"));
	double num2=Double.parseDouble(req.getParameter("num2"));
	String str=req.getParameter("op");
	
	double result=0;
	if(str.equals("+"))
		result=num1+num2;
	else if(str.equals("-"))
		result=num1-num2;
	else if(str.equals("*"))
		result=num1*num2;
	else if(str.equals("/"))
		result=num1/num2;
	else if(str.equals(null))
		try {
			res.getWriter().println("Please enter valid operation");
			System.exit(0);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	try {
		res.getWriter().println(result);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
}
