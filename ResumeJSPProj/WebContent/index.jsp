<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cg.jspresume.Resume" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Resume resume=(Resume)request.getAttribute("Resume"); %>
<h1> <%=resume.getFirstName()%> </h1>
</body>
</html>