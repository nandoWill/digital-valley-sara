<%-- 
    Document   : adicionaAvaliador
    Created on : 18/04/2018, 09:18:49
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
        <form action="confirmaCadastro" method="POST">
            <p>Busca por CPF:</p>
            <p>CPF: <input type="text" name="cpf" required></p>
            <!-- Verificar o cpf no banco do Guardião, caso exista preencher todos os dados, caso contrário           -->
            <p>Nome: <input type="text" name="nome"> </p>
            <p>Email: <input type="email" name="email"> </p>
            <p>Data: <input type="date" name="testeData"></p>
            <p>Número: <input type="tel" name="telefone"> </p>
            <p>Endereço: <input type="text" name="endereco"> </p>
            <button>Submit</button>
        </form>
    </center>
    </body>
</html>
