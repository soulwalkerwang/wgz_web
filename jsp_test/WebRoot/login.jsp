<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>reCAPTCHA demo: Simple page</title>
    <script src="https://www.google.com/recaptcha/api.js" async defer></script>
</head>
<body>
<form action="LoginServlet" method="POST">
    <div class="g-recaptcha" data-sitekey="6LfJuwMTAAAAANCBYnLHSTmCTyHT48myc1ysH6pO"></div>
    <br/>
    <input type="submit" value="Submit">
</form>
</body>
</html>
