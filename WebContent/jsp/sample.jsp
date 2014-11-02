<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sample</title>
</head>
<body>
	<% 
		out.println("Hello World <br/>");
		int i = 8;
		out.println("Trainer: " + config.getInitParameter("Trainer") + " <br/>");
	%>
	Value of i: <%= i %><br/>
	<%= application.getInitParameter("red") %><br/>
	Username: <%= session.getAttribute("username") %><br/>
	
	<% pageContext.setAttribute("scope", "Page Context"); %>
	Page Context - Get Attribute: <%= pageContext.getAttribute("scope") %><br/>
	Page Context - Expression Language: ${pageScope.scope }<br/>
	
	Example EL: ${4+3}
</body>
</html>