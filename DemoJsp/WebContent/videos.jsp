<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% response.setHeader("Cache-Control"," no-cache,no-store,,must-revalidate");//http1.1
    response.setHeader("Pragma"," no-cache");//http 1.0
       response.setHeader("Expires","0");// Proxies
    if(session.getAttribute("uname")==null)
    {
    	response.sendRedirect("login.jsp");
    }
%>

videos are here
<a href="aboutus.jsp"> abot us</a>
<iframe width="560" height="315" src="https://www.youtube.com/embed/dae80jDqaoQ" frameborder="0" allowfullscreen></iframe>
</body>
</html>