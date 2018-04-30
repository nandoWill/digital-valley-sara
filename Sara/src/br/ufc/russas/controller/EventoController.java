/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufc.russas.controller;

import br.ufc.russas.dao.ConnectionFactory;
import br.ufc.russas.dao.DAOEvento;
import br.ufc.russas.model.Evento;
import java.util.List;

/**
 *
 * @author Hugo
 */
public class EventoController {
    ConnectionFactory con = new ConnectionFactory();
    DAOEvento daoEvento = new DAOEvento();
    
    public void criar(Evento evento){
        daoEvento.create(evento);
    }
    
    public List<Evento> listar(){
        return daoEvento.read();
    }
    
    public Evento buscar(int idEvento){
        return daoEvento.getEvento(idEvento);
    }
    
    public void atualizar(Evento evento){
        daoEvento.update(evento);
    }
    
    public void deletar(Evento evento){
        daoEvento.delete(evento);
    }
    
}
