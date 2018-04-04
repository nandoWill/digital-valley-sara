<%@page import="br.ufc.russas.model.NivelUsuario"%>
<%@page import="br.ufc.russas.model.Usuario"%>
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
	//Usuario usuario = (Usuario) session.getAttribute("usuario");
	
	Usuario usuario = new Usuario();
	usuario.setTipo(NivelUsuario.COORDENADOR_TRILHA);

	if(usuario.getTipo().equals(NivelUsuario.AVALIADOR)){ %>
		<jsp:forward page="indexAvaliador.jsp" />
<%	}else if(usuario.getTipo().equals(NivelUsuario.COORDENADOR_EVENTO)){ %>
		<jsp:forward page="indexCoordEvento.jsp" />
<%	}else if(usuario.getTipo().equals(NivelUsuario.COORDENADOR_TRILHA)){ %>
		<jsp:forward page="indexCoordTrilha.jsp" />
<%	} %> 

</body>
</html>