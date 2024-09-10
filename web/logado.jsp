<%@page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Logado</title>
    </head>
    <body>
        
        <% 
            String email = (String) session.getAttribute("email");
        %>
        
        Seja bem vindo = <%=email %> | <a href="remover.jsp">Sair</a>
        
        <h1>Logado</h1>
        <hr>
    </body>
</html>
