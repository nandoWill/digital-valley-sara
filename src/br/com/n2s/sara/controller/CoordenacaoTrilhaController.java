package br.com.n2s.sara.controller;

import java.util.List;

import br.com.n2s.sara.dao.DAOCoordenacaoTrilha;
import br.com.n2s.sara.model.CoordenacaoTrilha;


public class CoordenacaoTrilhaController {

	private DAOCoordenacaoTrilha daoCoordenaEvento;
	
	public CoordenacaoTrilhaController() {
		daoCoordenaEvento = new DAOCoordenacaoTrilha();
	}
	
	public void criar(CoordenacaoTrilha coordTr){
		daoCoordenaEvento.create(coordTr);
	}

	public List<CoordenacaoTrilha> listar(){
		return daoCoordenaEvento.read();
	}
	
	public List<CoordenacaoTrilha> listar(String id){
		return daoCoordenaEvento.readById(id);
	}

	public CoordenacaoTrilha buscar(String cpf){
		return daoCoordenaEvento.getCoordenacaoTrilha(cpf);
	}

	public void atualizar(CoordenacaoTrilha coordTr){
		daoCoordenaEvento.update(coordTr);
	}

	public void deletar(String cpf){
		daoCoordenaEvento.delete(cpf);
	}
}
