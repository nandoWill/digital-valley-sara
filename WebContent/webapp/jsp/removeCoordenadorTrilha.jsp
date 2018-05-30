<%@page import="br.com.n2s.sara.dao.DAOUsuario"%>
<%@page import="br.com.n2s.sara.model.Usuario"%>
<%@page import="br.com.n2s.sara.dao.DAOCoordenacaoTrilha"%>
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
String cpf = (String) request.getAttribute("delCood");  //recebe o cpf, vai na sessao e procura o usuário
DAOCoordenacaoTrilha daoCoordenacaoTrilha = new DAOCoordenacaoTrilha();
daoCoordenacaoTrilha.delete(cpf);
%>

<h1>Coordenador de Trilha deletado com Sucesso. </h1>
<a href="gerenciarCoordenadorTrilha.jpg"> <button value="Deletado com sucesso."></a>


</body>
</html>