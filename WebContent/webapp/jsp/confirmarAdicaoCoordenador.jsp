<%@page import="br.com.n2s.sara.model.NivelUsuario"%>
<%@page import="br.com.n2s.sara.model.Usuario"%>
<%@page import="br.com.n2s.sara.controller.CoordenacaoEventoController"%>
<%@page import="br.com.n2s.sara.model.CoordenacaoEvento"%>
<%@page import="br.com.n2s.sara.controller.UsuarioController"%>
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
		String cpfCoordenador = request.getParameter("cpfCoordenador");
		
		UsuarioController usuarioController = new  UsuarioController();
		Usuario usuario = usuarioController.buscar(cpfCoordenador);
	
		if (usuario != null){
			
			if(!usuario.getTipo().equals("COORDENADOR_EVENTO")){
				usuario.setTipo(NivelUsuario.COORDENADOR_EVENTO);
				usuarioController.atualizar(usuario);
			}
			
			CoordenacaoEvento coordenacaoEvento = new CoordenacaoEvento();
			coordenacaoEvento.setCoordenador(usuario);
			coordenacaoEvento.setEvento(evento);
			CoordenacaoEventoController coordEventoController = new CoordenacaoEventoController();
			coordEventoController.criar(coordenacaoEvento);
			
		}
		
	%>
	
	<jsp:forward page="gerenciarCoordenadoresEvento.jsp"></jsp:forward>
	
</body>
</html>