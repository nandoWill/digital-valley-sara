<%@page import="br.com.n2s.sara.model.Evento"%>
<%@page import="br.com.n2s.sara.model.Usuario"%>
<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page import="br.com.n2s.sara.controller.TrilhaController"%>
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
	Usuario usuario = (Usuario) session.getAttribute("usuario");
	Evento evento = (Evento) session.getAttribute("evento");
	TrilhaController trilhaCon = new TrilhaController();
	String key = request.getParameter("trilha");
	Trilha trilha = (Trilha) session.getAttribute(key);
	trilhaCon.deletar(trilha.getIdTrilha());
	for(int i = 0; i < evento.getTrilhas().size(); i++){
		if(evento.getTrilhas().get(i).equals(trilha)){
			evento.getTrilhas().remove(i);
			break;
		}
	}
	session.setAttribute("usuario", usuario);
	session.setAttribute("evento", evento);
	response.sendRedirect("gerenciaEvento.jsp");
%>

</body>
</html>