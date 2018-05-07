package br.ufc.russas.controller;

import br.ufc.russas.dao.DAOTrilha;
import br.ufc.russas.model.Trilha;
import java.util.List;

public class TrilhaController {
    
    
    private DAOTrilha daoTrilha; 
    
    public TrilhaController() {
    	daoTrilha = new DAOTrilha();
    }
    
    public void criar(Trilha trilha){
        daoTrilha.create(trilha);
    }
    
    public List<Trilha> listar(){
       return daoTrilha.read();
    }
    
    public Trilha buscar(int idTrilha){
        return daoTrilha.getTrilha(idTrilha);
    }
    
    public void atualizar(Trilha trilha){
        daoTrilha.update(trilha);
    }
    
    public void deletar(int idTrilha){
        daoTrilha.delete(idTrilha);
    }
    
}
