<%-- 
    Document   : removeAvaliador
    Created on : 18/04/2018, 11:05:52
    Author     : Hugo
--%>

<%@page import="br.com.n2s.sara.model.AvaliaTrilha"%>
<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page import="br.com.n2s.sara.controller.AvaliaTrilhaController"%>
<%@page import="br.com.n2s.sara.controller.UsuarioController"%>
<%@page import="br.com.n2s.sara.model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sara</title>
    </head>
    <body>
    <center>
        <%
        	Trilha trilha = (Trilha) session.getAttribute("trilha");
        	String cpf = request.getParameter("avaliador");
        	UsuarioController userCon = new UsuarioController();
        	Usuario user = userCon.buscar(cpf);
        	AvaliaTrilhaController avCon = new AvaliaTrilhaController();
        	AvaliaTrilha avalia = new AvaliaTrilha();
        	avCon.deletar(avalia);
        	response.sendRedirect("gerenciaAvaliadores.jsp");
        %>
        
    </center>
    </body>
</html>
