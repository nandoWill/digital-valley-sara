<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page import="br.com.n2s.sara.controller.CriterioController"%>
<%@page import="br.com.n2s.sara.model.Criterio"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gerenciar Critérios de Avaliação</title>
</head>
<body>
	
	<center>
        <%
			//PEGAR TODOS OS CRITERIOS CADASTRADOS DA TRILHA
			
			Trilha trilha = (Trilha) session.getAttribute("trilha");
        	session.setAttribute("trilha", trilha);
			
			CriterioController critCon = new CriterioController();
			
        	List<Criterio> criterios = critCon.listar();
        	
			/* ArrayList<String> criterios = new ArrayList<String>();
			criterios.add("Criterio 1");
			criterios.add("Criterio 2");
			criterios.add("Criterio 3");
			criterios.add("Criterio 4");
			criterios.add("Criterio 5"); */
        %>
        
        <table border="1">
            <tr>
                <th>Critérios</th>
            </tr>
	<% 
            for(int i=0; i < criterios.size(); i++){
                
               session.setAttribute("crit"+criterios.get(i).getIdCriterio(), criterios.get(i));
               %>
               
               <tr>
                   <td><%=criterios.get(i).getDescricao()%></td>
                   <td><form action="alterarCriterio.jsp" method="post"> 
                           <input type="hidden" value="crit<%= criterios.get(i).getIdCriterio()%>" name="criterio"> 
                           <button type="submit">Alterar</button>
                       </form> 
                   </td>
                   <td><form action="removerCriterio.jsp" method="post"> 
                           <input type="hidden" value="crit<%= criterios.get(i).getIdCriterio()%>" name="criterio"> 
                           <button type="submit">Remover</button>
                       </form> 
                   </td>
                   <td><form action="adicionarItensCriterio.jsp" method="post"> 
                           <input type="hidden" value="crit<%= criterios.get(i).getIdCriterio()%>" name="criterio"> 
                           <button type="submit">Adicionar Itens</button>
                       </form> 
                   </td>
            <%}
        %>
	</table>
    	
    	<br />
    	
       	<p>
        <form action="adicionarCriterio.jsp" method="post">
            <input type="submit" name="addCri" value="Adicionar Critério">
        </form>
        </p>
        
        <br />
        
		<input type="button" onclick="location.href='indexAutor';" value="Voltar"/>        
    </center>
	
</body>
</html>