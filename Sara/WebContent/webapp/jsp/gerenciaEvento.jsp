<%-- 
    Document   : gerencia
    Created on : 16/04/2018, 11:21:47
    Author     : Hugo
--%>

<%@ page import="br.ufc.russas.model.*" %>
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
        %>
        <table border="1" >
        <tr>
            <th>Trilha</th>
            <th>Descrição</th>
            <th>Data</th>
        </tr>
        <% 
            for(int i=0; i < evento.getTrilhas().size(); i++){ 
                if(evento.getTrilhas().get(i).getCoordenadorTrilha().equals(user.getCpf()) || evento.getCoordenadorEvento().equals(user.getCpf())){
                
                session.setAttribute("gt"+Integer.toString(evento.getTrilhas().get(i).getIdTrilha()), evento.getTrilhas().get(i));
               %>
               
               <tr>
                   
                   <td><%= evento.getTrilhas().get(i).getNome() %> </td> 
                   <td>Descrição</td> 
                   <td>Data</td>
                   <td> <form action="manterTrilha" method="post"> 
                           <input type="hidden" value="gt<%= evento.getTrilhas().get(i).getIdTrilha()%>" name="trilha"> 
                           <button type="submit">Gerenciar Trilha</button>
                       </form> 
                   
                   </td>
                   <td>
                       <form action="gerenciaCoordenadores" method="post">
                        <% 
                               if(user.getTipo().equals(NivelUsuario.COORDENADOR_EVENTO) && user.getCpf().equals(evento.getCoordenadorEvento())){
                        %>
        
                                <input type="submit" name="gerCord" value="Coordenador dessa Trilha">
                        <% 
                                }
                        %>
                        </form>
                   </td>
                   
               </tr>
               
            <%  }
            }
        %>    
        
    </table>
        <p/>
        
        <input type="button" value="Voltar" onClick="history.go(-1)">
    </center>
    </body>
</html>
