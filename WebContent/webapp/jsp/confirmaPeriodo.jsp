<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page import="br.com.n2s.sara.model.DescricaoPeriodo"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
<%@page import="br.com.n2s.sara.model.Periodo"%>
<%@page import="br.com.n2s.sara.controller.PeriodoController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<%
		Trilha trilha = (Trilha) session.getAttribute("trilha");
		PeriodoController perCon = new PeriodoController();
		Periodo periodo = new Periodo();
		periodo.setDescricao(DescricaoPeriodo.valueOf((String)request.getParameter("descricao")));
		periodo.setDataInicial(LocalDate.parse((String)request.getParameter("dataInicial"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		periodo.setDataFinal(LocalDate.parse((String)request.getParameter("dataFinal"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		periodo.setTrilha(trilha);
		System.out.println(periodo.getDescricao());
		System.out.println(periodo.getDataInicial());
		System.out.println(periodo.getDataFinal());
		perCon.criar(periodo);
	%>
	<h1>Período Inserido com sucesso</h1>
	<%response.sendRedirect("gerenciaPeriodos.jsp"); %>
<!-- 	<a href="gerenciaPeriodos.jsp"><input type="button" value="Voltar"></a> -->
</center>
</body>
</html>