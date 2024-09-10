
<%@page language="Java" contentType="text/html; charset=ISO-8859-1" 
        pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.removeAttribute("email");
            response.sendRedirect("login.jsp");
        %>
    </body>
</html>
