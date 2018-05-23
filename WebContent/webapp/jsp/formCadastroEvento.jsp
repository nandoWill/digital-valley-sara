<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Eventos</title>
<center><h1>Cadastrar Evento</h1></center>
</head>
<body>

	<center>
	<form action = "cadastrarEvento.jsp" method = "post">
		<p>Nome:</p>
		<p><input type="text" name="nome" required/></p>
		<p>Coordenador:</p>
		<p><input type="text" name="cpfCoord" id="cpf" required pattern="^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}$"/></p>
		<p>Site:</p>
		<p><input type="text" name="site" /></p>
		<p>Localização:</p>
		<p><input type="text" name="localizacao" /></p>
		<p>Data de Início:</p>
		<p><input type="date" name="dataInicial" /></p>
		<p>Data de Fim:</p>
		<p><input type="date" name="dataFinal" /></p>
		<p>Descrição:</p>
		<p><textarea cols="60" rows="10" maxlength="500" name="descricao" > </textarea></p>
		<button type="submit">Cadastrar</button>
		<input type="button" value="Voltar" onClick="history.go(-1)">
	</form>
	
	</center>
	
	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script type="text/javascript" src = "../js/jquery.mask.min.js"/></script>
	<script type="text/javascript">$("#cpf").mask("000.000.000-09");</script>
</body>
</html>