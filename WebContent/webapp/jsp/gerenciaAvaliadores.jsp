<%-- 
    Document   : gerenciaAvaliadores
    Created on : 18/04/2018, 08:57:12
    Author     : Hugo
--%>

<%@page import="br.com.n2s.sara.model.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="br.com.n2s.sara.controller.AvaliaTrilhaController"%>
<%@page import="br.com.n2s.sara.model.AvaliaTrilha"%>
<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sara</title>
    </head>
    <body>
    <%
    	Trilha trilha = (Trilha) session.getAttribute("trilha");
    	session.setAttribute("trilha", trilha);
    	List<Usuario> avaliadores = new AvaliaTrilhaController().listarAvaliadores(trilha.getIdTrilha());
    %>

    <center>
    <table border="1">
    		<tr>
                <th>Nome</th>
                <th>Sobrenome</th>
                <th>E-mail</th>
                <th>CPF</th>
            </tr>
		<% 
            for(int i=0; i < avaliadores.size(); i++){
                
                session.setAttribute(avaliadores.get(i).getCpf(), avaliadores.get(i));
               %>
               
               <tr>
                   <td><%= avaliadores.get(i).getNome() %> </td>
                   <td><%= avaliadores.get(i).getSobrenome()%> </td>
                   <td><%= avaliadores.get(i).getEmail()%> </td>
                   <td><%= avaliadores.get(i).getCpf() %> </td>
                   
                   <td><form action="removeAvaliador.jsp" method="post" onsubmit="return confirm('Deseja remover este critério?');"> 
                           <input type="hidden" value="<%= avaliadores.get(i).getCpf() %>" name="avaliador"> 
                           <button type="submit">Remover</button>
                       </form> 
                   </td>
               </tr>    
            <%}
        %>
    </table>

        <form action="adicionaAvaliador.jsp" method="post">
            <input type="submit" name="adcAv" value="Adicionar Avaliadores">
        </form>
        <p/>
        
        <p/><input type="button" value="Voltar" onClick="history.go(-1)">
    </center>    
    </body>
</html>
