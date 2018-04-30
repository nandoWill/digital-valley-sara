<%@page import="br.ufc.russas.controller.UsuarioController"%>
<%@page import="br.ufc.russas.dao.ConnectionFactory"%>
<%@page import="br.ufc.russas.dao.DAOUsuario"%>
<%@page import="br.ufc.russas.model.*" %>
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
    <% 	UsuarioController conUsuario = new UsuarioController();
        
        Usuario usuario = conUsuario.buscar("777");
        usuario.setTipo(NivelUsuario.AUTOR);
	%>

<center> Bem Vindo!!  
    <% 
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<Trilha> trilhas = new ArrayList<>();
       
    %>
    
        
        <table>
            <tr>
                <th>Eventos</th>
                <th>Trabalhos Submetidos</th>
            </tr>
<tr>
	<td>
	<table border="1">
            <tr>
                <th>Evento</th>
                <th>Local</th>
                <th>Data</th>
            </tr>
	<% 
            for(int i=0; i < eventos.size(); i++){
                
                session.setAttribute("e"+Integer.toString(eventos.get(i).getIdEvento()), eventos.get(i));
               %>
               
               <tr>
                   <td><%= eventos.get(i).getNome() %> </td>
                   <td><%= eventos.get(i).getLocalizacao()%> </td>
                   <td><%= eventos.get(i).getSite()%> </td>
                   <td><form action="paginaEvento" method="post"> 
                           <input type="hidden" value="e<%= eventos.get(i).getIdEvento()%>" name="evento"> 
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
                <th>Status</th>
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
    
    
    <p>
<%      switch(usuario.getTipo()){

            case COORDENADOR_EVENTO: %>

<%	    case COORDENADOR_TRILHA: %>
                <input type="button" onclick="location.href='indexCoordTrilha';" value="Gerenciar"  />
<%          case AVALIADOR: %>
                <input type="button" onclick="location.href='indexAvaliador';" value="Avaliar Trabalhos"/>
<%	} %> 
</p></center> 

</body>
</html>