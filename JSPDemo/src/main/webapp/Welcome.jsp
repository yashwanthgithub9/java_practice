<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Welcome</title>
</head>
<body>
<%
	response.setHeader("Cache-Control","no-cache");
	response.setHeader("Cache-Control","no-store");
	response.setHeader("Pragma","no-cache");
	response.setDateHeader ("Expires", 0);
	if(session.getAttribute("username")==null){ // check for empty username
		response.sendRedirect("login.jsp"); // sends response to Login page
	}

%>
Hi ${username}
welcome.jsp welcomes you to the landing page...
<br />
Access Videos from below hyperlink<br />
<a href="Videos.jsp">Videos</a>

<form action="Logout">
	<input type="submit" value="Logout"/>
</form>

</body>
</html>