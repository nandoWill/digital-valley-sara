<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
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
        <% 
            LocalDate time = LocalDate.now();
            String dia_atual = time.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        %>
    <center>
        <form action="confirmaPeriodo" method="POST">
            <p>Informações: <input type="text" name="descricao" required></p>
            <p>Data de Inicio: <input type="date" name="dataInicial" required
                                      > </p>
            <p>Data de Fim: <input type="date" name="dataFinal" required> </p>
            <button>Submit</button>
            <input type="button" value="Voltar" onClick="history.go(-1)">
            
        </form>
        
    </center>
    </body>
</html>
