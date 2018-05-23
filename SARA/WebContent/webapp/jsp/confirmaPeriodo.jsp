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
		PeriodoController perCon = new PeriodoController();
		Periodo periodo = new Periodo();
		periodo.setDescricao((String)request.getParameter("descricao"));
		periodo.setDataInicial(LocalDate.parse((String)request.getParameter("dataInicial"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		periodo.setDataFinal(LocalDate.parse((String)request.getParameter("dataFinal"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		System.out.println(periodo.getDescricao());
		System.out.println(periodo.getDataInicial());
		System.out.println(periodo.getDataFinal());
		perCon.criar(periodo);
	%>
	<h1>Período Inserido com sucesso</h1>
	<input type="button" value="Voltar" onClick="history.go(-2)">
</center>
</body>
</html>