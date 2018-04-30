/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufc.russas.controller;

import br.ufc.russas.dao.ConnectionFactory;
import br.ufc.russas.dao.DAOTrilha;
import br.ufc.russas.model.Trilha;
import java.util.List;

/**
 *
 * @author Hugo
 */
public class TrilhaController {
    
    ConnectionFactory con = new ConnectionFactory();
    DAOTrilha daoTrilha = new DAOTrilha();
    
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
    
    public void deletar(Trilha trilha){
        daoTrilha.delete(trilha);
    }
    
}
