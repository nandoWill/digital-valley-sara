<%-- 
    Document   : manterTrilha
    Created on : 18/04/2018, 08:37:08
    Author     : Hugo
--%>

<%@ page import="br.com.n2s.sara.model.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sara</title>
    </head>
    <body>
        <%
            Usuario user = (Usuario) session.getAttribute("usuario");
            String key = request.getParameter("trilha");
            Trilha trilha = (Trilha) session.getAttribute(key);
            session.setAttribute("trilha", trilha);
        %>
    <center>
        <h1><%=trilha.getNome()%></h1>
        <h2><%=trilha.getDescricao()%></h2>
        <form action="gerenciaAvaliadores.jsp" method="post">
            <input type="submit" name="gerAv" value="Gerenciar Avaliadores">
        </form>
        
        <p/>
        <form action="gerenciaPeriodos.jsp" method="post">
            <input type="submit" name="gerPer" value="Alterar Períodos">
        </form>
        <p/>
        
        <p/>
        <form action="gerenciaCriterios.jsp" method="post">
            <input type="submit" name="gerCri" value="Gerenciar Critérios de Avaliação">
        </form>
        <p/>
        
        <input type="button" value="Voltar" onClick="history.go(-1)">
    </center>
    </body>
</html>
