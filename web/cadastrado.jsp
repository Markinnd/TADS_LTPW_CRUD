<%-- 
    Document   : cadastrado
    Created on : 4 de set. de 2024, 20:03:12
    Author     : marki
--%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <script language="Javascript">
            var timer = 2;
            function countdown(){
                if (timer > 0){
                    timer -= 1;
                    setTimeout("countdown()", 3000);
                } else {
                    location.href = 'login.jsp';
                }
            }
            countdown();
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cadastrado</title>
    </head>
    <body>
        <% String email = (String) request.getAttribute("email");
        out.println("<h4>Email " + email + " Cadastrado com sucesso<h4>");
        out.println("Você será redirecionado para pagina de login");
        %>
    </body>
</html>
