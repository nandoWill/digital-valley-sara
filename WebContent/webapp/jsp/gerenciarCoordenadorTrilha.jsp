<%-- <%@page import="br.com.n2s.sara.controller.EventoController"%> --%>
<%@page import="java.util.List"%>
<%-- <%@page import="br.com.n2s.sara.controller.TrilhaController"%> --%>
<%@page import="br.com.n2s.sara.dao.*"%>
<%@page import="br.com.n2s.sara.controller.*"%>
<%@page import="br.com.n2s.sara.model.*" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    
<head>
    <style>
    table{    
        border-spacing: 10px; 
    }
    </style>
    
    <!-- http-equiv meta tag metadados que caracterizam o objeto 
     HTTP-Equiv são equivalentes aos cabeçalhos http. Normalmente 
     elas controlam as ações dos browsers e podem ser usadas para melhor especificar as informações.
	 Tags usadas desta forma têm um efeito equivalente quando sendo usadas como um cabeçalho HTTP.-->
    
    
    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sara</title>
</head>
<body>
     <% 	
    
    
    	UsuarioController userCon = new UsuarioController();
    	Usuario usuario = (usuario) session.getAttribute("usuario");  //recebe o cpf
    	
    	
    	
    	//o CPF cria um usuario usuario. 
    	//o usuario cria uma sessão
    	//consegue a autenticação
    	
    	
	%>
    

<center> Bem Vindo!  
    <% 
    
    	
    	EventoController evCon = new EventoController();
		CoordenacaoTrilhaController coordtrCon = new CoordenacaoTrilhaController();
		int idTrilha = (INTEGER)request.getAttribute("trilha");
		DAOTrilha recebeTrilha = new DAOTrilha();
		Trilha trilha = new Trilha();
		trilha = recebeTrilha.getTrilha(idTrilha);
        List<CoordenacaoTrilha> listCoordTrilha = trilha.getCoordenadores;
        Evento ev = (Evento)session.getAttribute("evento");
        //cria um evCon que traz info do banco
        //cria lista de eventos que vem do banco pelo controller
       
    %>
    
        
        <table>
            <tr>
                <th>Coordenadores Trilha</th>
                
            </tr>
<tr>
	<td>
	<table border="1">
            <tr>
                <th>Nome</th>
                <th>Sobrenome</th>
                <th>E-mail</th>
            </tr>
	<% 
            for(int i=0; i <listCoordTrilha.size(); i++){
                
                
               %>
               
               <tr>
                   <td><%= listCoordTrilha.get(i).getCoordenador().getNome() %></td>
                   <td><%= listCoordTrilha.get(i).getCoordenador().getSobrenome() %> </td>
                   <td><%= listCoordTrilha.get(i).getCoordenador().getEmail() %> </td>
                   
                   <!-- carrega os atributos no evento criado -->
                   <td><form action="delete" method="post"> 
                   
                   <% switch(usuario.getTipo()){
                   
                   case ADMINITRADOR: %>
                   
                  <!--  criar um botao para adicionar -->
                     
                   <%case COORDENADOR_EVENTO: %>
                    <td><form action="removerCoordenadorTrilha.jsp" method="post" class = "formRemover"> 
                           <input type="hidden" value="crit<%= listCoodTrilha.get(i).getCoordenador().getTipo()%>" name="criterio"> 
                           <button type="submit">Remover</button>
                       </form> 
                   </td>
                   <%case COORDENADOR_TRILHA: %>
                   <input type="button" onclick=""; value="del">
                   <td><form action="removerCoordenadorTrilha.jsp" method="post" class = "formRemover"> 
                           <input type="hidden" value="crit<%= listCoodTrilha.get(i).getCoordenador().getTipo()%>" name="criterio"> 
                           <button type="submit">Remover</button>
                       </form> 
                   </td>
                   <%case AVALIADOR: %>
                   <td><form action="removerCoordenadorTrilha.jsp" method="post" > 
                           <input type="hidden" value="crit<%= listCoodTrilha.get(i).getCoordenador().getTipo()%>" name="criterio"> 
                           <button type="submit" class = "formRemover">Remover</button>
                   		</form>
                   	</td>
                   	
                   
                   }
                   
                	
       	<tr> <p>
        <!-- <form action="adicionarCoodenaforTrilha.jsp" method="post"> -->
        
        <a href="adicionarCoodenaforTrilha.jsp"> <button value="Adicionar Coordenador a Trilha"></button> </a> 
        
            
        </p>
            
	       
    </center>
	
	<script>
        $("#formRemover").onClick(function(){    	
        this.addEventListener('submit', function(e) {   
        var form = this;
         e.preventDefault();
          swal({
                title: "Deseja Remover?",
                text: "Este critério será excluído.",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#4cd964",
                confirmButtonText: "Sim, quero remover.", 
                cancelButtonText: "Não",       
                closeOnConfirm: false
            },
            function(isConfirm) {
                if (isConfirm) {
                    swal({
                        title: "Critério Removido!",			  
				        timer: 1000,
				        type: "success",
				        showConfirmButton: false
                    }, function() {
                        form.submit();
                    });
                    
                } 
                   
                   <!-- cria um formulario oculto que recebe no oculto=hidden a cada ciclo uma string evento --> 
                           <%--NAO PRECISA ENVIAR PARA OUTRA PAGINA
                           
                           <input type="hidden" value="<%= listCoordTrilha.get(i) %>" name="listCoodTrilha"> 
                           <button type="submit">Visualizar</button> --%>
                       </form> 
                   </td>
            <%}
        %>
	
    
    
    <p>
<%       <form action="addCoordenadorTrilha.jsp" method="post"> 
<input type="hidden" value="adicionar" name="criterio"> 
<button type="submit">Remover</button>
</form> 

               
<%	} 
		
%> 
</p></center> 




</table>
</body>
</html>