<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	double num1=Double.parseDouble(request.getParameter("num1"));
	double num2=Double.parseDouble(request.getParameter("num2"));
	String str=request.getParameter("op");
	
	double result=0;
	if(str.equals("+"))
		result=num1+num2;
	else if(str.equals("-"))
		result=num1-num2;
	else if(str.equals("*"))
		result=num1*num2;
	else if(str.equals("/"))
		result=num1/num2;
		out.println(result);
	
	%>

</body>
</html>