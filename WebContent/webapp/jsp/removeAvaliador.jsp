<%-- 
    Document   : removeAvaliador
    Created on : 18/04/2018, 11:05:52
    Author     : Hugo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sara</title>
    </head>
    <body>
    <center>
        <form action="confirmaRemocao" method="post">
            Remover por CPF: <input type="text" name="cpf">
            <input type="submit" value="Buscar">
            <input type="button" value="Voltar" onClick="history.go(-1)">
        </form>
    </center>
    </body>
</html>
