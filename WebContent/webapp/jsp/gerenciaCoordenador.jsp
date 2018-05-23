<%-- 
    Document   : gerenciaCoordenador
    Created on : 18/04/2018, 09:12:58
    Author     : Hugo
--%>

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
		<% String key = request.getParameter("trilha");
			System.out.println(key);
			Trilha trilha = (Trilha) session.getAttribute(key);
			System.out.println(trilha.getNome());
		   if(trilha.getCoordenador() != null){ %> 
		   Coordenador Atual: <%=trilha.getCoordenador().getNome()+ " "+ trilha.getCoordenador().getSobrenome() %>
		   
		<%	   
		   }
		%>   
        <p/><input type="button" value="Voltar" onClick="history.go(-1)">
    </center>
    </body>
</html>