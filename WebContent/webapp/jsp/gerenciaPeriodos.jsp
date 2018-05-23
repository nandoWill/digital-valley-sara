<%-- 
    Document   : gerenciaPeriodos
    Created on : 18/04/2018, 08:57:30
    Author     : Hugo
--%>

<%@page import="br.com.n2s.sara.model.Periodo"%>
<%@page import="java.util.List"%>
<%@page import="br.com.n2s.sara.controller.PeriodoController"%>
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
    PeriodoController perCon = new PeriodoController();
    Trilha trilha = (Trilha) session.getAttribute("trilha");
    List<Periodo> periodos = perCon.listar();
    session.setAttribute("trilha", trilha);
    
    %>
        <center>
        <table border="1">
            <tr>
                <th>Periodo</th>
                <th>Data Inicio</th>
                <th>Data Fim</th>
            </tr>
            <%for(int i = 0; i < periodos.size(); i++){
            	session.setAttribute("p"+Integer.toString(periodos.get(i).getIdPeriodo()), periodos.get(i));
           	%>
            <tr>
                <td><%=periodos.get(i).getDescricao().toString() %></td>
                <td><%=periodos.get(i).getDataInicial() %></td>
                <td><%=periodos.get(i).getDataFinal() %></td>
                <td>
                    <form action="alteraPeriodo.jsp" method="post">
                    	<input type="hidden" value="p<%=Integer.toString(periodos.get(i).getIdPeriodo())%>" name="periodo">
                        <input type="submit" value="Alterar">
                    </form>
                </td>
                
                <td>
                    <form action="removerPeriodo.jsp" method="post">
                    	<input type="hidden" value="p<%=Integer.toString(periodos.get(i).getIdPeriodo())%>" name="periodo">
                        <input type="submit" value="Remover">
                    </form>
                </td>
            </tr>
            <%
            }%>
            </table>    
            <p/>
        <form action="adicionaPeriodo.jsp" method="post">
            <input type="submit" name="adcPr" value="Adicionar Período">
        </form>
        <p/>
               
        <p/><input type="button" value="Voltar" onClick="history.go(-1)">
    </center>  
    </body>
</html>
