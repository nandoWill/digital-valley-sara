package br.ufc.russas.controller;

import java.util.List;

import br.ufc.russas.dao.DAOPeriodo;
import br.ufc.russas.model.Periodo;

public class PeriodoController {

	private DAOPeriodo daoPeriodo;


	public void criar(Periodo periodo){
		daoPeriodo.create(periodo);
	}

	public List<Periodo> listar(){
		return daoPeriodo.read();
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
