<%@page import="br.com.n2s.sara.controller.CoordenacaoTrilhaController"%>
<%@page import="br.com.n2s.sara.controller.CoordenacaoEventoController"%>
<%@page import="br.com.n2s.sara.controller.TrilhaController"%>
<%@page import="java.util.List"%>
<%@page import="br.com.n2s.sara.controller.EventoController"%>
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
        List<CoordenacaoEvento> idEventos = new CoordenacaoEventoController().listar(user.getCpf());
        List<CoordenacaoTrilha> idTrilhas = new CoordenacaoTrilhaController().listar(user.getCpf());
        List<Evento> eventos = new ArrayList<Evento>();
        List<Trilha> trilhas = new ArrayList<Trilha>();
        EventoController evCon = new EventoController();
        for(int i =0; i < idEventos.size(); i++){
        	Evento ev = idEventos.get(i).getEvento();
        	ev.setTrilhas(new TrilhaController().listar(ev.getIdEvento()));
        	eventos.add(ev);
        }
        for(int i =0; i < idTrilhas.size(); i++){
        	Evento ev = idTrilhas.get(i).getTrilha().getEvento();
        	Boolean achou = false;
        	for(int j = 0; j < eventos.size(); i++){
        		if(eventos.get(j).getIdEvento() == ev.getIdEvento()){
        			eventos.get(j).getTrilhas().add(idTrilhas.get(i).getTrilha());
        			achou = true;
        			break;
        		}
        	}
        	if(!achou){
            	ev.setTrilhas(new ArrayList<Trilha>());
            	ev.getTrilhas().add(idTrilhas.get(i).getTrilha());
            	eventos.add(ev);	
        	}
        }
        
       	
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
                session.setAttribute("ce"+eventos.get(i).getIdEvento(), ev);
               %>
               
                <tr>
                   <td><%= ev.getNome() %> </td>
                   <td><%= ev.getLocalizacao()%> </td>
                   <td><%= ev.getDataInicial() %> </td>
                   <td><form action="gerenciaEvento.jsp" method="post"> 
                           <input type="hidden" value="ce<%= eventos.get(i).getIdEvento()%>" name="geEvento"> 
                           <button type="submit">Alterar Dados do Evento</button>
                       </form> 
                   </td>
                </tr>
            <%  	
            }
        %>
	</table>
        
        <input type="button" value="Voltar" onClick="history.go(-1)">
    </center>
    
</body>
</html>