package br.com.n2s.sara.controller;

import java.util.List;
import br.com.n2s.sara.dao.DAOCriterio;
import br.com.n2s.sara.model.Criterio;

public class CriterioController {
	
	private DAOCriterio daoCriterio;
	
	public CriterioController() {
		daoCriterio = new DAOCriterio();
	}
	
	public void criar(Criterio criterio) {
		daoCriterio.create(criterio);
	}
	
	public List<Criterio> listar(){
		return daoCriterio.read();
	}	
	
	public Criterio buscar(int idCriterio) {
		return daoCriterio.getCriterio(idCriterio);
	}
	
	public void atualizar(Criterio criterio) {
		daoCriterio.update(criterio);
	}
	
	public void deletar(int idCriterio) {
		daoCriterio.delete(idCriterio);
	}
}
