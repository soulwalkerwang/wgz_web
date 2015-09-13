<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<h:form>
			<h:panelGrid>
				<h:outputText value="User Name: "></h:outputText>
				<h:inputText id="username" value="#{user.userName}" required="true"></h:inputText>
				<h:message for="username"></h:message>
				<h:outputText value="Password: "></h:outputText>
				<h:inputText id="password" value="#{user.password}" required="true"></h:inputText>
				<h:message for="password"></h:message>
				<h:commandButton action="#{userService.login}"></h:commandButton>
			</h:panelGrid>
		</h:form>
	</f:view>
</body>
</html>