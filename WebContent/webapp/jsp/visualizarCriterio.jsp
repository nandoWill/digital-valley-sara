<%@page import="br.com.n2s.sara.model.Criterio"%>
<%@page import="java.util.List"%>
<%@page import="br.com.n2s.sara.controller.CriterioController"%>
<%@page import="br.com.n2s.sara.model.CriterioTrilha"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%
			String key = request.getParameter("criterioTrilha");
			CriterioTrilha criterioTrilha = (CriterioTrilha) session.getAttribute(key);
			
			CriterioController criterioController = new CriterioController();
			List<Criterio> criterios = criterioController.obterCriteriosPorTrilha(criterioTrilha.getIdCriterioTrilha());
		%>
		
        	<table border="1">
            <tr>
                <th>Descrição</th>
                <th>Peso</th>
            </tr>
	<% 
			for(int i = 0; i < criterios.size(); i++){ 
			
			session.setAttribute("criterio"+criterios.get(i).getIdCriterio(), criterios.get(i)); %>
               
               <tr>
                   <td><%=criterios.get(i).getDescricao()%></td>
                   <td><%=criterios.get(i).getPeso()%></td>
                   <td><form action="visualizarItensCriterio.jsp" method="post"> 
                           <input type="hidden" value="criterio<%= criterios.get(i).getIdCriterio()%>" name="criterio"> 
                           <button type="submit">Visualizar Itens</button>
                       </form> 
                   </td>
                   
            <%}%>
       
			</table>
	</center>
</body>
</html>