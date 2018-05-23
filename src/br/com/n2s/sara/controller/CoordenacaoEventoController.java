package br.com.n2s.sara.controller;

import java.util.List;
import br.com.n2s.sara.dao.DAOCoordenacaoEvento;
import br.com.n2s.sara.model.CoordenacaoEvento;


public class CoordenacaoEventoController {

	private DAOCoordenacaoEvento daoCoordenaEvento;
	
	public CoordenacaoEventoController() {
		daoCoordenaEvento = new DAOCoordenacaoEvento();
	}
	
	public void criar(CoordenacaoEvento coordEv){
		daoCoordenaEvento.create(coordEv);
	}

	public List<CoordenacaoEvento> listar(){
		return daoCoordenaEvento.read();
	}
	
	public List<CoordenacaoEvento> listar(String id){
		return daoCoordenaEvento.readById(id);
	}

	public CoordenacaoEvento buscar(String cpf){
		return daoCoordenaEvento.getCoordenacaoEvento(cpf);
	}

	public void atualizar(CoordenacaoEvento coordEv){
		daoCoordenaEvento.update(coordEv);
	}

	public void deletar(String cpf){
		daoCoordenaEvento.delete(cpf);
	}
}
