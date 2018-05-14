<%-- 
    Document   : gerenciaPeriodos
    Created on : 18/04/2018, 08:57:30
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
    <%
    Trilha trilha = (Trilha) session.getAttribute("trilha");
    session.setAttribute("trilha", trilha);
    %>
        <center>
        <table border="1">
            <tr>
                <th>Periodo</th>
                <th>Data Inicio</th>
                <th>Data Fim</th>
            </tr>
            <tr>
                <td>Periodo1</td>
                <td>13-10-2069</td>
                <td>15-12-2069</td>
                <td>
                    <form action="alteraPeriodo.jsp" method="post">
                        <input type="submit" value="Alterar">
                    </form>
                </td>
                
                <td>
                    <form action="removePeriodo.jsp" method="post">
                        <input type="submit" value="Remover">
                    </form>
                </td>
            </tr>
            </table>    
            <p/>
        <form action="adicionaPeriodo.jsp" method="post">
            <input type="submit" name="adcPr" value="Adicionar Período">
        </form>
        <p/>
               
        <p/><input type="button" value="Voltar" onClick="history.go(-1)">
    </center>  
    </body>
</html>
