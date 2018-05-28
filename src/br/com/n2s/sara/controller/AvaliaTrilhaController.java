package br.com.n2s.sara.controller;

import java.util.List;

import br.com.n2s.sara.dao.DAOAvaliaTrilha;
import br.com.n2s.sara.model.AvaliaTrilha;
import br.com.n2s.sara.model.Trilha;
import br.com.n2s.sara.model.Usuario;

public class AvaliaTrilhaController {
	
	private DAOAvaliaTrilha daoAvaliaTrilha;
	
	public AvaliaTrilhaController() {
		daoAvaliaTrilha = new DAOAvaliaTrilha();
	}
	
	public void criar(AvaliaTrilha avaliaTrilha){
		daoAvaliaTrilha.create(avaliaTrilha);
	}

	public List<AvaliaTrilha> listar(){
		return daoAvaliaTrilha.read();
	}

	public List<Usuario> listarAvaliadores(int idTrilha){
		return daoAvaliaTrilha.getAvaliadores(idTrilha);
	}
	
	public List<Trilha> listarTrilhas(String cpf){
		return daoAvaliaTrilha.getTrilhasAvaliadas(cpf);
	}
	
	public void atualizar(AvaliaTrilha usuario){
		daoAvaliaTrilha.update(usuario);
	}

	public void deletar(AvaliaTrilha avalia){
		daoAvaliaTrilha.delete(avalia);
	}

}
