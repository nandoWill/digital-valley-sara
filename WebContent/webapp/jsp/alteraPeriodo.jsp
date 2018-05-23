<%-- 
    Document   : alteraPeriodo
    Created on : 18/04/2018, 11:18:43
    Author     : Hugo
--%>

<%@page import="br.com.n2s.sara.model.Periodo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    	<%	String key = request.getParameter("periodo");
    	System.out.println(key);
    		Periodo p = (Periodo) session.getAttribute(key);
    	%>
        <h1><%=p.getDescricao() %></h1>
    </body>
</html>
