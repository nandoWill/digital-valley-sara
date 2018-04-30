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
		String descricaoCrit = request.getParameter("descricaoCrit");
		int pesoCrit = Integer.parseInt(request.getParameter("pesoCrit"));
		ArrayList<String> itensDescricao = new ArrayList<String>();
		ArrayList<Integer> itensPeso = new ArrayList<Integer>();

		String desc = "";
		String peso = "";
		
		for(int i = 0; i < 10; i++){
			desc = request.getParameter("descricao" + (i + 1));
			peso = request.getParameter("peso" + (i + 1));
			
			if (desc != "" && peso != "") {
				itensDescricao.add(desc);
				itensPeso.add(Integer.parseInt(peso));
			}
		}
		
  		System.out.println("TAMANHO: " + itensDescricao.size());
		 
		for(int i = 0; i < itensPeso.size(); i++){
			System.out.println(itensDescricao.get(i));
			System.out.println(itensPeso.get(i));
		}  
	%>
</body>
</html>