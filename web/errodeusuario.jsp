<%@page isErrorPage="true" %>
<%@page import="java.util.Enumeration" %>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
    
<html>
    <head>
        <style type="text/css">
            body{background-color: #fff;}
            #cabecalho{
                background-color: #fff;
                width: 800px;
                height: 100px;
            }
            
            #corpo{
                background-color: #fff;
                width: 800px;
                height: 450px;
            }
            #rodape{
                background-color: #fff;
                width: 800px;
                height: 100px;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Error</title>
    </head>
    <body>
        <div align="center">
            <div id="cabecalho"> </div>
            <div id="corpo">
                
                <img src="imagens/erro1.jpg"/>
                <hr/>
                <h3> Email e Senha incorretos </h3><br/><!-- comment -->
                <br/><!-- comment -->
                <hr/>
                <a href="login.jsp">Tentar novamente</a> <a href="index.jsp">Cadastre-se</a>

            </div>
            <div id="rodape"> </div>
        </div>
    </body>
</html>
