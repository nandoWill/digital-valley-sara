<%-- 
    Document   : gerencia
    Created on : 16/04/2018, 11:21:47
    Author     : Hugo
--%>

<%@ page import="br.com.n2s.sara.model.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sara</title>
    </head>
    <body>
    <center>
        <% 
            Usuario user = (Usuario) session.getAttribute("usuario");
            String chave = request.getParameter("geEvento");
            Evento evento = (Evento) session.getAttribute(chave);
            session.setAttribute("usuario", user);
            session.setAttribute("evento", evento);
        %>
        <table border="1" >
        <tr>
            <th>Trilha</th>
            <th>Descrição</th>
        </tr>
        <% 
            for(int i=0; i < evento.getTrilhas().size(); i++){
                
                session.setAttribute("gt"+Integer.toString(evento.getTrilhas().get(i).getIdTrilha()), evento.getTrilhas().get(i));
               %>
               
               <tr>
                   
                   <td><%= evento.getTrilhas().get(i).getNome() %> </td> 
                   <td><%= evento.getTrilhas().get(i).getDescricao() %></td>
                   <td> <form action="manterTrilha.jsp" method="post"> 
                           <input type="hidden" value="gt<%= evento.getTrilhas().get(i).getIdTrilha()%>" name="trilha"> 
                           <button type="submit">Alterar Dados da Trilha</button>
                       </form> 
                   </td>
                   <% 
			            if(user.getTipo().equals(NivelUsuario.COORDENADOR_EVENTO)){
        			%>
        			<td>
        				<form action="gerenciaCoordenador.jsp" method="post">
        					<input type="hidden" value="gt<%= evento.getTrilhas().get(i).getIdTrilha()%>" name="trilha">
				            <input type="submit" name="gerCord" value="Gerenciar Coordenadores dessa Trilha">
				        </form>
				    </td>
				    <% 
				        }
				    %>
                   
               </tr>
               
            <%  
            }
        %>    
    </table>
    <form action="adicionaTrilha.jsp" method="post">
        <input type="submit" value="Adicionar um Trilha">
    </form>
    <input type="button" value="Voltar" onClick="history.go(-1)">
    </center>
    </body>
</html>
