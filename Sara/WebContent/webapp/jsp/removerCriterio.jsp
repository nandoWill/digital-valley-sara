<%@page import="br.com.n2s.sara.model.Criterio"%>
<%@page import="br.com.n2s.sara.controller.CriterioController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remover Critério</title>
</head>
<body>
		<%
			String criterio = request.getParameter("criterio");
			Criterio crit = (Criterio) session.getAttribute(criterio);
			//int idCrit = Integer.parseInt(crit.split("crit")[1]);
			
			/* REMOVER O CRITERIO DO DAO */
			
			CriterioController critCont = new CriterioController();
			critCont.deletar(crit.getIdCriterio());
		%>
</body>
</html>