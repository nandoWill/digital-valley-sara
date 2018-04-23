<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.n2s.sara.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Evento</title>
</head>
<body>
	
<%
	String nome = request.getParameter("nome");
	String cpfCoord = request.getParameter("cpfCoord");
	String site = request.getParameter("site");
	String descricao = request.getParameter("descricao");
	
	Evento e = new Evento();
	e.setNome(nome);
	e.setCoordenadorEvento(cpfCoord);
	e.setDescricao(descricao);
	
	//COLOCAR EVENTO NO BANCO
	
%>

	<jsp:forward page="eventoCadastradoSucesso.jsp" />
	
</body>
</html>