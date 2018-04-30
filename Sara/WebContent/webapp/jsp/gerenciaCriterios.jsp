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
		
		<p>
        <form action="adicionarCriterio.jsp" method="post">
            <input type="submit" name="addCri" value="Adicionar Critério">
        </form>
        </p>
        
        <p>
        <form action="alterarCriterio.jsp" method="post">
            <input type="submit" name="altCri" value="Alterar Critério">
        </form>
        </p>
        
        <p>
        <form action="removerCriterio.jsp" method="post">
            <input type="submit" name="remCri" value="Remover Critério">
        </form>
        </p>
        
    </center>
	
</body>
</html>