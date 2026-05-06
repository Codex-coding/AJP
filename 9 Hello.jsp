//Create dynamic web project -> Pr9 -> Target Runtime(Apache Tomcat v9.0) -> Next -> Next -> Check(Generate web.xml deployment descriptor) -> Finish
// Create JSP file : Expand(Pr9) -> src → main → webapp -> Right-click(webapp) -> New(JSP file) -> FileNAme(Hello) -> finish.
// Delete generated code and paste the below code
// Add project to server : Servers -> Tomcat -> Next -> Select Practical9 -> Add -> finish
// Run JSP file : Right click (Hello.jsp) -> Run As → Run on Server -> Tomcat v9.0 -> Finish


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Example</title>
</head>
<body>
<h1>Hello World!</h1>
<h2>Welcome to JSP</h2>
<%
Date date = new Date();
%>
<p>The current date and time is: <%= date %></p>
</body>
</html>
