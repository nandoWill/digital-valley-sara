<%-- 
    Document   : adicionaPeriodo
    Created on : 18/04/2018, 11:18:16
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
        <form action="confirmaPeriodo" method="POST">
            <p>Informações: <input type="text" name="descricao" required></p>
            <p>Data de Inicio: <input type="date" name="dataInicial"> </p>
            
            <p>Data de Fim: <input type="date" name="dataFinal"> </p>
            <button>Submit</button>
        </form>
    </center>
    </body>
</html>
