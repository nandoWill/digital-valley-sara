package br.com.n2s.sara.controller;

import br.com.n2s.sara.dao.DAOTrilha;
import br.com.n2s.sara.model.Trilha;
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
    
    public List<Trilha> listar(int id){
        return daoTrilha.readById(id);
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