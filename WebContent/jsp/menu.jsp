<%@ page import="edu.jsp.models.Image" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu</title>
</head>
<body>
	<img alt="Welcome to my world" 
		src="<%= ((Image)request.getAttribute("ImageShow")).getPath() %>" 
		width="<%= ((Image)request.getAttribute("ImageShow")).getWidth() %>"
		height="<%= ((Image)request.getAttribute("ImageShow")).getHeight() %>">
	<br/>
	<p>Hello, <%= session.getAttribute("username") %></p>
	Page Context - Find Attribute: <%= pageContext.findAttribute("otherScope") %><br/>
	
	Page Context - Get Request Scope: <%= pageContext.getAttribute("otherScope", pageContext.REQUEST_SCOPE) %><br/>
	Page Context - Get Request Scope Expression Language: ${requestScope.otherScope}<br/>
	
	Page Context - Get Session Scope: <%= pageContext.getAttribute("otherScope", pageContext.SESSION_SCOPE) %><br/>
	Page Context - Get Session Scope Expression Language: ${sessionScope.otherScope}<br/>
	
	Page Context - Get Application Scope: <%= pageContext.getAttribute("otherScope", pageContext.APPLICATION_SCOPE) %><br/>
	Page Context - Get Application Scope Expression Language: ${applicationScope.otherScope}<br/>
	
	Student's name is ${requestScope.student.name}<br/>
	Get initParam of Application by EL: Red chosen ${initParam.red}, Green chosen ${initParam.green}<br/>
	Languages: ${requestScope.languages}
	<ul>
		<li>${requestScope.languages[0]}</li>
	</ul>

	<jsp:useBean id="student" type="edu.jsp.models.Person" class="edu.jsp.models.Student" scope="request">
		<jsp:setProperty property="name" name="student" value="Green" />
	</jsp:useBean>
	<%-- <jsp:setProperty property="name" name="student" value="Green" /> --%>
	Get Property: <jsp:getProperty property="name" name="student"/>
	
	<p><a href="logout">Logout</a></p>
</body>
</html>