package br.com.n2s.sara.controller;

import br.ufc.russas.dao.DAOUsuario;
import br.ufc.russas.model.Usuario;
import java.util.List;

public class UsuarioController {

	private DAOUsuario daoUsuario; 

	public UsuarioController() {
		daoUsuario = new DAOUsuario();
	}
	
	public void criar(Usuario usuario){
		daoUsuario.create(usuario);
	}

	public List<Usuario> listar(){
		return daoUsuario.read();
	}

	public Usuario buscar(String cpf){
		return daoUsuario.getUsuario(cpf);
	}

	public void atualizar(Usuario usuario){
		daoUsuario.update(usuario);
	}

	public void deletar(String cpf){
		daoUsuario.delete(cpf);
	}
}
