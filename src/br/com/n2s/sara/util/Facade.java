package br.com.n2s.sara.util;

import br.com.n2s.sara.dao.DAOUsuario;
import br.com.n2s.sara.model.Usuario;

public class Facade {
	private Facade() {
		//
	}
	
	public static Usuario buscarUsuarioPorCPF(String cpf) {
		Usuario user = new Usuario();
		DAOUsuario daoUser = new DAOUsuario();
		user = daoUser.getUsuario(cpf);
		return user;
	}
	
	
}
