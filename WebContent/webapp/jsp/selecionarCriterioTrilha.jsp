<%@page import="br.com.n2s.sara.controller.TrilhaController"%>
<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page import="br.com.n2s.sara.model.CriterioTrilha"%>
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
			String key = request.getParameter("criterioTrilha");
			CriterioTrilha criterioTrilha = (CriterioTrilha) session.getAttribute(key);
			
			Trilha trilha = (Trilha) session.getAttribute("trilha");
        	session.setAttribute("trilha", trilha);
			
        	trilha.setCriterioTrilha(criterioTrilha);
			TrilhaController trilhaController = new TrilhaController();
			trilhaController.atualizar(trilha);
		%>
		
		<jsp:forward page="gerenciaCriterios.jsp"></jsp:forward>
</body>
</html>