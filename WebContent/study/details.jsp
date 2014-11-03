<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student's details</title>
</head>
<body>
	<jsp:useBean id="student" class="edu.jsp.models.Student" scope="request">
		<jsp:setProperty property="name" name="student" param="studentName"/>
		<%-- <jsp:setProperty property="name" name="student" value="Green"/> --%>
		<jsp:setProperty property="region" name="student" />
	</jsp:useBean>
	Get Property Name: <jsp:getProperty property="name" name="student"/><br/>
	Get Property Region: <jsp:getProperty property="region" name="student"/><br/>
	Student's Name: ${param.studentName}<br/>
	Region: ${param.region}
</body>
</html>