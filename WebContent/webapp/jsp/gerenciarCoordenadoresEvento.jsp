<%@page import="br.com.n2s.sara.controller.UsuarioController"%>
<%@page import="br.com.n2s.sara.model.Evento"%>
<%@page import="java.util.List"%>
<%@page import="br.com.n2s.sara.controller.CoordenacaoEventoController"%>
<%@page import="br.com.n2s.sara.model.CoordenacaoEvento"%>
<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
    
    <table border="1" cellspacing="0" cellpadding="1">
    	<tr>
    		<th>Coordenador</th>
    		<th>CPF</th>
    	</tr>
    	
    	<% 
    	
    	Evento evento = (Evento) session.getAttribute("evento");
    	
    	CoordenacaoEventoController coordenacaoEventoController = new CoordenacaoEventoController();
    	UsuarioController usuarioController = new UsuarioController();
    	List<CoordenacaoEvento> lista = coordenacaoEventoController.listar(evento.getIdEvento());
    	
    	for (int i = 0; i < lista.size(); i++){
             
             session.setAttribute("c" + lista.get(i).getCoordenador().getCpf() + "e" + Integer.toString(lista.get(i).getEvento().getIdEvento()), lista.get(i));
        %>
           
       		<tr>
    			<td><%= usuarioController.buscar(lista.get(i).getCoordenador().getCpf()).getNome() %></td>
    			<td><%= usuarioController.buscar(lista.get(i).getCoordenador().getCpf()).getCpf() %></td>
    			 <td> <form action="removerCoordenador.jsp" method="post" onsubmit="return confirm('Deseja remover este Coordenador?');"> 
                           <input type="hidden" value="c<%=lista.get(i).getCoordenador().getCpf()%>e<%= Integer.toString(lista.get(i).getEvento().getIdEvento())%>" name="coordenacaoEvento"> 
                           <button type="submit">Remover Coordenador</button>
                      </form> 
                 </td>
                 
                 
    		</tr>
    	
    	<% } %>
    	
  </table>
  <br />
  <form action="adicionarCoordenador.jsp" method="post"> 
               <button type="submit">Adicionar Coordenador</button>
        </form> 
		
    </center>
    </body>
</html>