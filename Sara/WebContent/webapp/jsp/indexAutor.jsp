<%@page import="br.ufc.russas.model.Trilha"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.ufc.russas.model.Evento"%>
<%@page import="br.ufc.russas.model.NivelUsuario"%>
<%@page import="br.ufc.russas.model.Usuario"%>
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
    <% 	
        Usuario usuario = new Usuario();
	usuario.setTipo(NivelUsuario.COORDENADOR_EVENTO);
        usuario.setCpf("0");
        usuario.setNome("Hugo");
        session.setAttribute("usuario", usuario);
        
	%>
    

<center> Bem Vindo!!  
    <% 
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<Trilha> trilhas = new ArrayList<>();
        
        trilhas.add(new Trilha("Trilha 1", 1, "Esta é a trilha 1", "0")); 
        trilhas.add(new Trilha("Trilha 2", 2, "Esta é a trilha 2", "0")); 
        trilhas.add(new Trilha("Trilha 3", 3, "Esta é a trilha 3", "0")); 
        trilhas.add(new Trilha("Trilha 4", 4, "Esta é a trilha 4", "0"));
        
        eventos.add(new Evento(1, "Evento1", "Este é o evento 1", "UFC - Russas", trilhas, "0")); 
        eventos.add(new Evento(2, "Evento2", "alahuaahusdh2", "Castelo", trilhas, "0")); 
        eventos.add(new Evento(3, "Evento3", "alahuaahusdh3", "UFC - Quixadá", trilhas, "0")); 
        eventos.add(new Evento(4, "Evento4", "alahuaahusdh4", "Casa da marelia", trilhas, "0")); 
        eventos.add(new Evento(5, "Evento5", "alahuaahusdh5", "Santiago 2", trilhas, "0"));
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
                   <td><%= eventos.get(i).getDataEvento() %> </td>
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
                <input type="button" onclick="location.href='indexCoordTrilha';" value="Gerenciar"/>
<%          case AVALIADOR: %>
                <input type="button" onclick="location.href='indexAvaliador';" value="Avaliar Trabalhos"/>
<%	} %> 
</p></center> 

</body>
</html>