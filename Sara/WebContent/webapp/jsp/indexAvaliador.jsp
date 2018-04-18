<%@page import="br.ufc.russas.model.Trabalho"%>
<%@page import="br.ufc.russas.model.Trilha"%>
<%@page import="br.ufc.russas.model.Evento"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <style>
    table{    
        border-spacing: 10px; 
    }
    </style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sara</title>
</head>
<body>
<center> Bem Vindo!!  
    <%
        ArrayList<Trabalho> trabalhos = new ArrayList<>();
        
        trabalhos.add(new Trabalho("Trabalho1"));
        trabalhos.add(new Trabalho("Trabalho2"));
        trabalhos.add(new Trabalho("Trabalho3"));
        trabalhos.add(new Trabalho("Trabalho4"));
    %>
    
        
        <table>
            <tr>
                <th>Trabalhos a Corrigir</th>
                <th>Trabalhos Corrigidos</th>
            </tr>
<tr>
	<td>
	<table border="1">
            <tr>
                <th>Evento</th>
                <th>Data Limite</th>
            </tr>
	<% 
            for(int i=0; i < trabalhos.size(); i++){
                session.setAttribute("t"+Integer.toString(trabalhos.get(i).getIdTrabalho()), trabalhos.get(i));
               %>
               
               <tr>
                   <td><%= trabalhos.get(i).getTitulo()%> </td>
                   <td><form action="paginaEvento" method="post"> 
                           <input type="hidden" value="t<%= trabalhos.get(i).getIdTrabalho()%>" name="evento"> 
                           <button type="submit">pressione</button>
                       </form> 
                   </td>
            <%}
        %>
	</table>
	</td>
	<td>
            <table border="1">
            <tr>
                <th>Evento</th>
                
            </tr>
	<tr>
		<td>Evento2</td>
                <td>Aprovado</td>
	</tr>
	<tr>
		<td>Evento4</td>
		<td>Reprovado</td>
	</tr>
	</table>
	</td>
	
</tr>
</table>
        <input type="button" onclick="location.href='indexAutor';" value="Voltar"/>
</center>        
</body>
</html>