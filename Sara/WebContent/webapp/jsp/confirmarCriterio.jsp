<%@page import="br.com.n2s.sara.controller.ItemController"%>
<%@page import="br.com.n2s.sara.controller.CriterioTrilhaController"%>
<%@page import="br.com.n2s.sara.model.Trilha"%>
<%@page import="br.com.n2s.sara.controller.CriterioController"%>
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
	
		String descricaoCrit = request.getParameter("descricaoCrit");
		int pesoCrit = Integer.parseInt(request.getParameter("pesoCrit"));
		ArrayList<String> itensDescricao = new ArrayList<String>();
		ArrayList<Integer> itensPeso = new ArrayList<Integer>();
		
		String desc = "";
		String peso = "";
		
		Criterio crit = new Criterio();
		crit.setDescricao(descricaoCrit);
		crit.setPeso(pesoCrit);
		crit.setCriterioTrilha(trilha.getCriterioTrilha());
		CriterioController critCon = new CriterioController();
		critCon.criar(crit);
		
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