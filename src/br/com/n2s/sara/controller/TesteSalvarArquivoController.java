package br.com.n2s.sara.controller;

import br.com.n2s.sara.model.NivelUsuario;
import br.com.n2s.sara.model.Usuario;

public class Teste {
	
	public static void main(String[] args) {
		UsuarioController userCon = new UsuarioController();
		Usuario user = userCon.buscar("100");
		user.setTipo(NivelUsuario.COORDENADOR_EVENTO);
		userCon.atualizar(user);
	}

}
