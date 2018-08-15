<%@page import="br.com.n2s.sara.controller.CoordenacaoEventoController"%>
<%@page import="br.com.n2s.sara.model.CoordenacaoEvento"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Removendo Coordenador</title>
</head>
<body>

	<% 
		String chave = request.getParameter("coordenacaoEvento");
		CoordenacaoEvento coordenacaoEvento = (CoordenacaoEvento) session.getAttribute(chave);
		CoordenacaoEventoController coordEventoController = new CoordenacaoEventoController();
		coordEventoController.deletar(coordenacaoEvento.getCoordenador().getCpf());
			
	%>
		
		<jsp:forward page="gerenciarCoordenadoresEvento.jsp"></jsp:forward>
	
	
</body>
</html>