<%-- 
    Document   : index
    Created on : 4 de set. de 2024, 19:13:47
    Author     : marki
--%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" 
        pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
            
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login - JSP Page</title>
        
    </head>
    <body>
        <h1>Cadastrar Login</h1>
        <table>
            <form name="frmCadastrarLogin" action="CadastroLogin" method="post">
                
                <tr>
                    <td>Email.:</td><td><input type="text" name="email"></td>
                    <td>Senha.:</td><td><input type="password" name="senha"></td>
                    
                    <td colspan="2"><input type="submit" value="cadastrar"/></td>
                </tr>
            </form>
        </table>
    </body>
</html>
