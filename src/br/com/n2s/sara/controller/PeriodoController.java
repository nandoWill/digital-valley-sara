package br.com.n2s.sara.controller;

import java.util.List;
import br.com.n2s.sara.dao.DAOPeriodo;
import br.com.n2s.sara.model.Periodo;

public class PeriodoController {

	private DAOPeriodo daoPeriodo;
	
	public PeriodoController() {
		this.daoPeriodo = new DAOPeriodo();
	}

	public void criar(Periodo periodo){
		daoPeriodo.create(periodo);
	}

	public List<Periodo> listar(){
		return daoPeriodo.read();
	}
	
	public List<Periodo> listar(int id){
		return daoPeriodo.readById(id);
	}

	public Periodo buscar(int idPeriodo){
		return daoPeriodo.getPeriodo(idPeriodo);
	}

	public void atualizar(Periodo periodo){
		daoPeriodo.update(periodo);
	}

	public void deletar(int idPeriodo){
		daoPeriodo.delete(idPeriodo);
	}

}