<%@page import="br.com.n2s.sara.dao.DAOTrilha"%>
<%@page import="br.com.n2s.sara.dao.DAOCriterioTrilha"%>
<%@page import="br.com.n2s.sara.dao.DAOCriterio"%>
<%@page import="java.time.LocalDate"%>
<%@page import="br.com.n2s.sara.model.CriterioTrilha"%>
<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.n2s.sara.model.Item"%>
<%@page import="br.com.n2s.sara.model.Criterio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmar Critério</title>
</head>
<body>
	<%
		Trilha trilha = (Trilha) session.getAttribute("trilha");
	
		String descricaoCrit = request.getParameter("descricaoCriterio");
		int pesoCrit = Integer.parseInt(request.getParameter("pesoCriterio"));
		
		//ArrayList<String> itensDescricao = new ArrayList<String>();
		//ArrayList<Integer> itensPeso = new ArrayList<Integer>();
		
		//String desc = "";
		//String peso = "";
		
		Criterio criterio = new Criterio();
		criterio.setDescricao(descricaoCrit);
		criterio.setPeso(pesoCrit);
		
		if(trilha.getCriterioTrilha() != null){ //Caso a trilha já possua um CriterioTrilha, apenas associa o novo critério com este CriterioTrilha
			criterio.setCriterioTrilha(trilha.getCriterioTrilha());
		
		}else {
			
			String nomeCriterioTrilha = request.getParameter("nomeCriterioTrilha");
			
			CriterioTrilha criterioTrilha = new CriterioTrilha();
			criterioTrilha.setNome(nomeCriterioTrilha);
			criterioTrilha.setDataCriacao(LocalDate.now());
			
			DAOCriterioTrilha daoCriterioTrilha = new DAOCriterioTrilha();
			daoCriterioTrilha.create(criterioTrilha);
			
			
			criterioTrilha = daoCriterioTrilha.getCriterioTrilha(daoCriterioTrilha.getLastId());
			criterio.setCriterioTrilha(criterioTrilha);
			
			trilha.setCriterioTrilha(criterioTrilha);
			DAOTrilha daoTrilha = new DAOTrilha();
			daoTrilha.update(trilha);
		}
		
		DAOCriterio daoCriterio = new DAOCriterio();
		daoCriterio.create(criterio);		
		
		/* Item item = new Item();
		ItemController itemCont = new ItemController();
		
		for(int i = 0; i < 20; i++){
			desc = request.getParameter("descricao" + i);
			peso = request.getParameter("peso" + i);
			
			if (desc != "" && peso != "" && desc != null && peso != null) {
				//itensDescricao.add(desc);
				//itensPeso.add(Integer.parseInt(peso));
				item.setDescricao(desc);
				item.setPeso(Integer.parseInt(peso));
				item.setCriterio(crit);
				
				itemCont.criar(item);
			} 
		}
		 */
		
  		/* System.out.println("TAMANHO: " + itensDescricao.size());
		 
		for(int i = 0; i < itensPeso.size(); i++){
			System.out.println(itensDescricao.get(i));
			System.out.println(itensPeso.get(i));
		}   */
	%>
	
	<jsp:forward page="gerenciaCriterios.jsp"></jsp:forward>
	
</body>
</html>