<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


 <c:forEach items="${list}" var="employee">
 Employee Id:<c:out value="${employee.id}"></c:out>
 Employee Name:<c:out value="${employee.employee_name}"></c:out>
 Department Id:<c:out value="${employee.department.id}"></c:out>
 Department Name:<c:out value="${employee.department.department_name}"></c:out>
 ----------------------------------------
                          
 </c:forEach>
