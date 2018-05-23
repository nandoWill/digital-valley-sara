<%-- 
    Document   : gerenciaAvaliadores
    Created on : 18/04/2018, 08:57:12
    Author     : Hugo
--%>

<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sara</title>
    </head>
    <body>

    <center>

        <form action="adicionaAvaliador.jsp" method="post">
            <input type="submit" name="adcAv" value="Adicionar Avaliadores">
        </form>
        <p/>

        <form action="removeAvaliador.jsp" method="post">
            <input type="submit" name="rmAv" value="Remover Avaliador">
        </form>
        
        <p/><input type="button" value="Voltar" onClick="history.go(-1)">
    </center>    
    </body>
</html>
