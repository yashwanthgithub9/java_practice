<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Failed Login</title>
</head>
<body>
Your link is broken please login to view
<a href="login.jsp">Login</a>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//for HTTP 1.1 and above
	response.setHeader("Pragma", "no-cache");//HTTP1.0
	response.setHeader("Expires", "0"); // proxies

%>

</body>
</html>