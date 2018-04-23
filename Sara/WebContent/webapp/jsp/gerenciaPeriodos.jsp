<%-- 
    Document   : gerenciaPeriodos
    Created on : 18/04/2018, 08:57:30
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
        <form action="adicionaPeriodo" method="post">
            <input type="submit" name="adcPr" value="Adicionar Período">
        </form>
        <p/>
        <form action="alteraPeriodo" method="post">
            <input type="submit" name="altPr" value="Alterar um Período">
        </form>
        <p/>
        <form action="removePeriodo" method="post">
            <input type="submit" name="rmPr" value="Remover Período">
        </form>
    </center>  
    </body>
</html>
