<%-- 
    Document   : removerPeriodo
    Created on : 18/04/2018, 11:18:54
    Author     : Hugo
--%>

<%@page import="br.com.n2s.sara.controller.PeriodoController"%>
<%@page import="br.com.n2s.sara.model.Periodo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%
    String key = request.getParameter("periodo");
	Periodo p = (Periodo) session.getAttribute(key);
	PeriodoController perCon = new PeriodoController();
	perCon.deletar(p.getIdPeriodo());
	response.sendRedirect("gerenciaPeriodos.jsp");
	%>
    </body>
</html>
