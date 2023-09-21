

<%@page import="java.util.*" %>
	Declaraion
	Directive
	Scriptlet
	Expression



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Tags</title>
</head>
<body>


	<%!
		int coef=54;
		
	
	%>

	<h1>Hello World!</h1>
	<%
		int i = 9;
		out.print(23+42);
	 %>
	 
	 <%=coef %>

		
</body>
</html>