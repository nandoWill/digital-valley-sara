package br.com.n2s.sara.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.n2s.sara.dao.DAOCoordenacaoEvento;

/**
 * Servlet implementation class RemoverCoordenador
 */
@WebServlet("/RemoverCoordenador")
public class RemoverCoordenador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String cpf = request.getParameter("cpfCoordenador");
		DAOCoordenacaoEvento daoCoor = new DAOCoordenacaoEvento();
		daoCoor.delete(cpf);
		response.sendRedirect("gerenciaEvento.jsp");
	}

}
