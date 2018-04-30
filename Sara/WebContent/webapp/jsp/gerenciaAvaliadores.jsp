<%-- 
    Document   : gerenciaAvaliadores
    Created on : 18/04/2018, 08:57:12
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
        <table border="1">
            <tr>
                <th>Avaliador</th>
                <th>CPF</th>
                <th>Email</th>
            </tr>
            <tr>
                <td>Avaliador1</td>
                <td>123.456.789-00</td>
                <td>fulano@teste.com</td>
                <td>
                    <form action="removeAvaliador" method="post">
                        <input type="submit" value="Remover">
                    </form>
                </td>
            </tr>
            </table> 
        <p/>
        <form action="adicionaAvaliador" method="post">
            <input type="submit" name="adcAv" value="Adicionar Avaliadores">
            <input type="button" value="Voltar" onClick="history.go(-1)">
        </form>

    </center>    
    </body>
</html>
