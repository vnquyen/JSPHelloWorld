<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student</title>
</head>
<body>
	<form action="details.jsp" method="get">
		Student's name: <input type="text" name="studentName" /><br/>
		Region: 
			<select name="region">
				<option value="asia">Asia</option>
				<option value="america">America</option>
				<option value="europe">Europe</option>
				<option value="africa">Africa</option>
			</select>
		<br/>
		<input type="submit" value="Ok" />
	</form>
</body>
</html>