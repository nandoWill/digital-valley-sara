<%-- 
    Document   : alteraPeriodo
    Created on : 18/04/2018, 11:18:43
    Author     : Hugo
--%>

<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page import="br.com.n2s.sara.controller.PeriodoController"%>
<%@page import="br.com.n2s.sara.dao.DAOPeriodo"%>
<%@page import="br.com.n2s.sara.model.Periodo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
    	<%	Trilha trilha = (Trilha) session.getAttribute("trilha");
    	session.setAttribute("trilha", trilha);
    	String key = request.getParameter("periodo");
    	Periodo p = (Periodo) session.getAttribute(key);
    	session.setAttribute("periodo", p);
    	%>
        <form action="confirmaAlteraPeriodo.jsp" method="POST">
            <p>Tipo: <select name="descricao">
					  <option value="SUBMISSAO_MANUSCRITO">Período de Submissão</option>
					  <option value="AVALIACAO">Período de Avaliaçâo</option>
					  <option value="SUBMISSAO_FINAL">Período de Submissôes Finais</option>
					  <option value="RESULTADO_FINAL">Divulgaçâo de Resultados</option>
					</select>
            <p>Data de Inicio: <input type="date" name="dataInicial" required> </p>
            <p>Data de Fim: <input type="date" name="dataFinal" required> </p>
            <input type="submit" value="Adicionar">
            <input type="button" value="Voltar" onClick="history.go(-1)">
            
        </form>
    </center>
    </body>
</html>
