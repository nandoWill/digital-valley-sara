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
        List<Evento> eventos = new EventoController().listar();
        for(int i =0; i < eventos.size(); i++){
        	eventos.get(i).setTrilhas(new TrilhaController().listar(eventos.get(i).getIdEvento()));
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
                System.out.println(ev.getCoordenador().getCpf());
                for(int j = 0; j < ev.getTrilhas().size(); j++){
                   if(ev.getTrilhas().get(j).getCoordenador().getCpf().equals(user.getCpf()) || ev.getCoordenador().getCpf().equals(user.getCpf())){
                
                	session.setAttribute("ce"+Integer.toString(ev.getIdEvento()), ev);
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
            <%     }
                    break;
                }
            }
        %>
	</table>
        
        <input type="button" value="Voltar" onClick="history.go(-1)">
    </center>
    
</body>
</html>