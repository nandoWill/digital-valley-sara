<%@page import="br.com.n2s.sara.model.Item"%>
<%@page import="br.com.n2s.sara.controller.ItemController"%>
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
			
			String keyCriterio = request.getParameter("criterio");
			Criterio criterio = (Criterio) session.getAttribute(keyCriterio);
			
			ItemController itemController = new ItemController();
			List<Item> itens = itemController.listar(criterio.getIdCriterio());
		%>
		
        	<table border="1">
            <tr>
                <th>Descrição</th>
                <th>Peso</th>
            </tr>
	<% 
			for(int i = 0; i < itens.size(); i++){ %>
                
               <tr>
                   <td><%=itens.get(i).getDescricao()%></td>
                   <td><%=itens.get(i).getPeso()%></td>
               </tr>    
                   
            <%}%>
       
			</table>
	</center>
</body>
</html>