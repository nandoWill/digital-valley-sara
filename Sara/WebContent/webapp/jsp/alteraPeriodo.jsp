<%-- 
    Document   : alteraPeriodo
    Created on : 18/04/2018, 11:18:43
    Author     : Hugo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <form action="confirmaAlteraPeriodo" method="POST">
            <h1>Nome do Periodo</h1>
            <p>Data de Inicio: <input type="date" name="dataInicial"> </p>
            <p>Data de Fim: <input type="date" name="dataFinal"> </p>
            <input type="submit" value="Alterar">
            <input type="button" value="Voltar" onClick="history.go(-1)">
        </form>
    </center>
    </body>
</html>
