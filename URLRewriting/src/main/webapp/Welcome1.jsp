<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align:center; background-color:orange;padding:50px;margin:50px;">
<%
out.println("Welcome");
out.println("<h2>"+session.getAttribute("name")+"<h2>");
%>
</div>
</body>
</html>