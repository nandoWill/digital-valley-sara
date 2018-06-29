<%@page import="br.com.n2s.sara.controller.ItemController"%>
<%@page import="br.com.n2s.sara.model.Item"%>
<%@page import="java.util.List"%>
<%@page import="br.com.n2s.sara.model.Criterio"%>
<%@page import="br.com.n2s.sara.controller.CriterioController"%>
<%@page import="br.com.n2s.sara.controller.CriterioTrilhaController"%>
<%@page import="java.time.LocalDate"%>
<%@page import="br.com.n2s.sara.controller.TrilhaController"%>
<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page import="br.com.n2s.sara.model.CriterioTrilha"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
			String key = request.getParameter("criterioTrilha");
			CriterioTrilha criterioTrilha = (CriterioTrilha) session.getAttribute(key);
			
			/*Criando cópia do Critério Trilha*/
			
			CriterioTrilha criterioTrilhaCopia = new CriterioTrilha();
			criterioTrilhaCopia.setNome(criterioTrilha.getNome());
			criterioTrilhaCopia.setDataCriacao(LocalDate.now());
			
			CriterioTrilhaController criterioTrilhaController = new CriterioTrilhaController();
			criterioTrilhaController.criar(criterioTrilhaCopia);
			criterioTrilhaCopia.setIdCriterioTrilha(criterioTrilhaController.obterUltimoID());
			
			/*Copiando os critérios e os itens*/
			
			CriterioController criterioController = new CriterioController();
			List<Criterio> criterios = criterioController.obterCriteriosPorTrilha(criterioTrilha.getIdCriterioTrilha());
			ItemController itemController = new ItemController();
			
			for(Criterio c : criterios){
				Criterio criterio = new Criterio();
				criterio.setCriterioTrilha(criterioTrilhaCopia);
				criterio.setDescricao(c.getDescricao());
				criterio.setPeso(c.getPeso());
				criterioController.criar(criterio);
				
				criterio.setIdCriterio(criterioController.getLastID());
				
				List<Item> itens = itemController.listar(c.getIdCriterio());
				
				for(Item i : itens){
					i.setCriterio(criterio);
					itemController.criar(i);
				}
			}
			
			Trilha trilha = (Trilha) session.getAttribute("trilha");
        	session.setAttribute("trilha", trilha);
			
        	trilha.setCriterioTrilha(criterioTrilhaCopia);
			TrilhaController trilhaController = new TrilhaController();
			trilhaController.atualizar(trilha);
		%>
		
		<jsp:forward page="gerenciaCriterios.jsp"></jsp:forward>
</body>
</html>