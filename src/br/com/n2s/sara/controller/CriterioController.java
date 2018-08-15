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
	
	public List<Criterio> obterCriteriosPorTrilha(int idCriterioTrilha){
		return daoCriterio.obterCriteriosPorTrilha(idCriterioTrilha);
	}
	
	public Criterio buscar(int idCriterio) {
		return daoCriterio.getCriterio(idCriterio);
	}
	
	public int getLastID() {
		return daoCriterio.getLastId();
	}
	
	public void atualizar(Criterio criterio) {
		daoCriterio.update(criterio);
	}
	
	public void deletar(int idCriterio) {
		daoCriterio.delete(idCriterio);
	}
}
