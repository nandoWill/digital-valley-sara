<%@page import="br.com.n2s.sara.controller.TrilhaController"%>
<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page import="br.com.n2s.sara.model.Evento"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		Evento evento = (Evento) session.getAttribute("evento");
		TrilhaController trilhaCon = new TrilhaController();
		Trilha trilha = new Trilha();
		trilha.setNome(request.getParameter("nome"));
		trilha.setDescricao(request.getParameter("descricao"));
		trilha.setEvento(evento);
		trilhaCon.criar(trilha);
		response.sendRedirect("indexCoordTrilha.jsp");
	%>
	
</body>
</html>