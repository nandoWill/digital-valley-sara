<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adicionar Critério</title>
</head>
<body>
	<center>
		
		<%
			Trilha trilha = (Trilha) session.getAttribute("trilha");
    		session.setAttribute("trilha", trilha);
		%>
		
        <form action="confirmarCriterio.jsp" method="post">
        	<%
        	if(trilha.getCriterioTrilha() == null){ %>
    			
    			<h1>Critério Trilha</h1>
    				
    			<p>Nome: <input type="text" name="nomeCriterioTrilha" required> </p>	
    				
    		<%} %>

			<h1> Critério </h1>
			    		
       		<p>Descrição: <textarea name="descricaoCrit" rows="1" cols="30" required></textarea></p>
            <p>Peso: <input type="number" name="pesoCrit" value="0" required> </p>
            
            <!-- <h2> Itens do Critério </h2>
            
            <div id="origem" align="center">
            	<p>Descrição: <textarea id="descricao0" name="descricao0" rows="1" cols="30"></textarea></p>
            	<p>Peso: <input type="number" id="peso0" name="peso0" value="0"> </p>
			</div>
			
			<div id="destino">
			</div>
            
            <input type="button" value="+" onclick="maisCampos();">
            <input type="button" value="-" onclick="removerCampos(this);"> -->
            
			<br /> <br />     
            <p><button type="submit">Adicionar Critério</button></p>
        </form>
        
    </center>
    
    <script type="text/javascript">
    	var cont = 1;
    	
	    function maisCampos(){
	    	var clone = document.getElementById('origem').cloneNode(true);
	    	var destino = document.getElementById('destino');
	    	destino.appendChild(clone);

	    	var camposClonados = clone.getElementsByTagName('input');
	    	for(i=0; i<camposClonados.length;i++){
	    		camposClonados[i].value = '';
	    		camposClonados[i].name = "peso" + cont;
	    	}
	    	
	    	camposClonados = clone.getElementsByTagName('textarea');
	    	for(i=0; i<camposClonados.length;i++){
	    		camposClonados[i].value = '';
	    		camposClonados[i].name = "descricao" + cont;
	    	}
	    	
	    	cont = cont + 1;
	    }
	    
 	    function removerCampos(id){
 	    	cont = cont - 1;
	   	    var node1 = document.getElementById('destino');
	    	node1.removeChild(node1.childNodes[cont]);
	    } 
    </script>
</body>
</html>