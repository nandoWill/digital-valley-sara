<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page import="br.com.n2s.sara.model.NivelUsuario"%>
<%@page import="br.com.n2s.sara.controller.UsuarioController"%>
<%@page import="br.com.n2s.sara.model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
		<%
    	String cpf = request.getParameter("cpf");
		Trilha trilha = (Trilha) session.getAttribute("trilha");
    	UsuarioController usCon = new UsuarioController();
    	Usuario user = usCon.buscar(cpf);
    	if(user != null){
    		user.setTipo(NivelUsuario.AVALIADOR);
    		usCon.atualizar(user);
    		
    		
    	}else{
            %>
            <p>Nome: <input type="text" name="nome"> </p>
            <p>Email: <input type="email" name="email"> </p>
            <p>Data: <input type="date" name="testeData"></p>
            <p>Número: <input type="tel" name="telefone"> </p>
            <p>Endereço: <input type="text" name="endereco"> </p>
            <%
    	}
    	%>
</center>
</body>
</html>