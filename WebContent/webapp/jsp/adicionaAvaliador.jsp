<%-- 
    Document   : adicionaAvaliador
    Created on : 18/04/2018, 09:18:49
    Author     : Hugo
--%>

<%@page import="br.com.n2s.sara.model.Usuario"%>
<%@page import="br.com.n2s.sara.controller.UsuarioController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sara</title>
    </head>
    <body>
    <center>
        <form action="buscaAvaliador.jsp" method="POST">
            <p>Busca por CPF:</p>
            <p>CPF: <input type="text" name="cpf" required></p>
            
<!--             <p>Nome: <input type="text" name="nome"> </p> -->
<!--             <p>Email: <input type="email" name="email"> </p> -->
<!--             <p>Data: <input type="date" name="testeData"></p> -->
<!--             <p>Número: <input type="tel" name="telefone"> </p> -->
<!--             <p>Endereço: <input type="text" name="endereco"> </p> -->
            <input type="submit" value="Buscar">
        </form>
        <p/><input type="button" value="Voltar" onClick="history.go(-1)">
    </center>
    </body>
</html>
