<%@ page import="br.com.n2s.sara.model.*" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sara</title>
</head>
<body>
    <% 
        Usuario user = (Usuario) session.getAttribute("usuario");
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<Trilha> trilhas1 = new ArrayList<>();
        ArrayList<Trilha> trilhas2 = new ArrayList<>();
        ArrayList<Trilha> trilhas3 = new ArrayList<>();
        ArrayList<Trilha> trilhas4 = new ArrayList<>();
        ArrayList<Trilha> trilhas5 = new ArrayList<>();
        
        trilhas1.add(new Trilha("Trilha 1", 1, "Esta é a trilha 1", "0"));
        trilhas1.add(new Trilha("Trilha 2", 2, "Esta é a trilha 2", "1")); 
        trilhas1.add(new Trilha("Trilha 3", 3, "Esta é a trilha 3", "0")); 
        trilhas1.add(new Trilha("Trilha 4", 4, "Esta é a trilha 4", "1"));
        
        eventos.add(new Evento(1, "Evento1", "Este é o evento 1", "UFC - Russas", trilhas1, "2")); 
        
        trilhas2.add(new Trilha("Trilha 1", 1, "Esta é a trilha 1", "0")); 
        trilhas2.add(new Trilha("Trilha 2", 2, "Esta é a trilha 2", "0")); 
        trilhas2.add(new Trilha("Trilha 3", 3, "Esta é a trilha 3", "0")); 
        trilhas2.add(new Trilha("Trilha 4", 4, "Esta é a trilha 4", "0"));
        
        eventos.add(new Evento(2, "Evento2", "alahuaahusdh2", "Castelo", trilhas2, "1")); 
        
        trilhas3.add(new Trilha("Trilha 1", 1, "Esta é a trilha 1", "1")); 
        trilhas3.add(new Trilha("Trilha 2", 2, "Esta é a trilha 2", "0")); 
        trilhas3.add(new Trilha("Trilha 3", 3, "Esta é a trilha 3", "1")); 
        trilhas3.add(new Trilha("Trilha 4", 4, "Esta é a trilha 4", "0"));
        
        eventos.add(new Evento(3, "Evento3", "alahuaahusdh3", "UFC - Quixadá", trilhas3, "2")); 
        
        trilhas4.add(new Trilha("Trilha 1", 1, "Esta é a trilha 1", "1")); 
        trilhas4.add(new Trilha("Trilha 2", 2, "Esta é a trilha 2", "1")); 
        trilhas4.add(new Trilha("Trilha 3", 3, "Esta é a trilha 3", "1")); 
        trilhas4.add(new Trilha("Trilha 4", 4, "Esta é a trilha 4", "1"));
        
        eventos.add(new Evento(4, "Evento4", "alahuaahusdh4", "Casa da marelia", trilhas4, "1")); 
        
        trilhas5.add(new Trilha("Trilha 1", 1, "Esta é a trilha 1", "0")); 
        trilhas5.add(new Trilha("Trilha 2", 2, "Esta é a trilha 2", "1")); 
        trilhas5.add(new Trilha("Trilha 3", 3, "Esta é a trilha 3", "1")); 
        trilhas5.add(new Trilha("Trilha 4", 4, "Esta é a trilha 4", "1"));
        
        eventos.add(new Evento(5, "Evento5", "alahuaahusdh5", "Santiago 2", trilhas5, "2"));
    %>
    <center>
        <table border="1">
            <tr>
                <th>Evento</th>
                <th>Local</th>
                <th>Data</th>
            </tr>
	<% 
            for(int i=0; i < eventos.size(); i++){
                Evento ev = eventos.get(i);
                for(int j = 0; j < ev.getTrilhas().size(); j++){
                   if(ev.getTrilhas().get(j).getCoordenadorTrilha().equals(user.getCpf()) || ev.getCoordenadorEvento().equals(user.getCpf())){
                
                session.setAttribute("ce"+Integer.toString(eventos.get(i).getIdEvento()), eventos.get(i));
               %>
               
                <tr>
                   <td><%= eventos.get(i).getNome() %> </td>
                   <td><%= eventos.get(i).getLocalizacao()%> </td>
                   <td><%= eventos.get(i).getDataInicial() %> </td>
                   <td><form action="gerenciaEvento.jsp" method="post"> 
                           <input type="hidden" value="ce<%= eventos.get(i).getIdEvento()%>" name="geEvento"> 
                           <button type="submit">pressione</button>
                       </form> 
                   </td>
                </tr>
            <%     }
                    break;
                }
            }
        %>
	</table>
        
        <input type="button" onclick="location.href='indexAutor';" value="Voltar"/>
    </center>
    
</body>
</html>