package br.ufc.russas.controller;

import java.util.List;
import br.ufc.russas.dao.DAOCriterio;
import br.ufc.russas.model.Criterio;

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
