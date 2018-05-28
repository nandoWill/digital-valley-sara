<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page import="br.com.n2s.sara.controller.AvaliaTrilhaController"%>
<%@page import="br.com.n2s.sara.model.AvaliaTrilha"%>
<%@page import="br.com.n2s.sara.controller.UsuarioController"%>
<%@page import="br.com.n2s.sara.model.NivelUsuario"%>
<%@page import="br.com.n2s.sara.model.Usuario"%>
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
	Trilha trilha = (Trilha) session.getAttribute("trilha");
	Usuario user = new Usuario();
	user.setNome(request.getParameter("nome"));
	user.setSobrenome(request.getParameter("sobrenome"));
	user.setCpf(request.getParameter("cpf"));
	user.setEmail(request.getParameter("email"));
	user.setTipo(NivelUsuario.AVALIADOR);
	UsuarioController userCon = new UsuarioController();
	userCon.criar(user);
	AvaliaTrilhaController avTrCon = new AvaliaTrilhaController();
	AvaliaTrilha avaliadorTrilha = new AvaliaTrilha();
	avaliadorTrilha.setAvaliador(user);
	avaliadorTrilha.setTrilha(trilha);
	avTrCon.criar(avaliadorTrilha);
	response.sendRedirect("gerenciaAvaliadores.jsp");
%>

</body>
</html>