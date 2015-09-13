<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Form</title>
</head>
<body>
	<div>
	<h2>Create Employee Account</h2>
		
		<sf:form method="POST" modelAttribute="employee">
			<tr>
				<th><label for="employee_name">Employee Name:</label></th>
				<td><sf:input path="employeeName" size="15" id="employee_full_name"/></td>
			
			</tr>
			<tr>
				<th><label for="employee_age">Age:</label></th>
				<td><sf:input path="fullname" size="15" id="employee_age"/></td>
			
			</tr>
		
		</sf:form>
	</div>
	


</body>
</html>