<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.ArrayList" %>
    <%@ include file= "Home.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "brown">

	<%
			int m = Integer.parseInt(request.getParameter("num1"));
			int j = Integer.parseInt(request.getParameter("num2"));
			
			int k = m+j;
			
			out.print("Output : "+k);
			
			 %>
</body>
</html>