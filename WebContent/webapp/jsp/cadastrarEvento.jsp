<%@page import="br.com.n2s.sara.controller.CoordenacaoEventoController"%>
<%@page import="br.com.n2s.sara.controller.EventoController"%>
<%@page import="br.com.n2s.sara.controller.UsuarioController" %>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
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
	UsuarioController usuarioController = new UsuarioController();
	String nome = request.getParameter("nome");
	String cpfCoordenador = request.getParameter("cpfCoordenador");
	Usuario usuario = usuarioController.buscar(cpfCoordenador);
	if (usuario == null){ %>
		<jsp:forward page="formCadastroEvento.jsp" />
	<%}
	
	String site = request.getParameter("site");
	String descricao = request.getParameter("descricao");
	String localizacao = request.getParameter("localizacao");
	LocalDate dataInicial = LocalDate.parse(request.getParameter("dataInicial"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	LocalDate dataFinal = LocalDate.parse(request.getParameter("dataFinal"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	
	Evento evento = new Evento();
	evento.setNome(nome);
	evento.setDescricao(descricao);
	evento.setLocalizacao(localizacao);
	evento.setSite(site);
	evento.setDataInicial(dataInicial);
	evento.setDataFinal(dataFinal);
	
	EventoController eventoController = new EventoController();
	eventoController.criar(evento);
	
	
	
	
	if(!usuario.getTipo().equals("COORDENADOR_EVENTO")){
		
		usuario.setTipo(NivelUsuario.COORDENADOR_EVENTO);
		usuarioController.atualizar(usuario);
	}
	
	CoordenacaoEvento coordenacaoEvento = new CoordenacaoEvento();
	coordenacaoEvento.setCoordenador(usuario);
	coordenacaoEvento.setEvento(eventoController.buscar(eventoController.obterUltimoId()));
	
	CoordenacaoEventoController coordenacaoEventoController = new CoordenacaoEventoController();
	coordenacaoEventoController.criar(coordenacaoEvento);
	
%>

	<jsp:forward page="eventoCadastradoSucesso.jsp" />
	
</body>
</html>