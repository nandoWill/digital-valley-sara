<%@page import="br.ufc.russas.model.Trilha"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sara</title>
    </head>
    <body>
    <center>
         <% 
            HttpSession secao = session;
            String nome = request.getParameter("trilha");
            Trilha trilha = (Trilha) secao.getAttribute(nome);
            String teste = "sedcftvgybhujnkml,.ç";
        %>
        <h2><%= trilha.getNome()%></h2>
        <p><%= trilha.getInfo()%></p>
        <p><%= trilha.getPeriodo()%></p>
        
        <form action="submterTrabalho" method="post">
            <p>Título: </p>
            <p><input type="text" name="titulo" size="80"></p>
            <p>Resumo:</p> 
            <p><textarea name="resumo" cols="80" rows="15" maxlength="1000"></textarea> </p>
            <p>Autores: (Fica pra próxima! :D)</p>
            <p>Palavras-chave: (Separe por vígula)</p>
            <p><input type="text" name="palavras_chave" size="80"></p>
            <button type="submit">Submeter</button>
            <input type="button" onclick="location.href='indexAutor';" value="Voltar"/>
            
        </form>
        
    </center>
    </body>
</html>
