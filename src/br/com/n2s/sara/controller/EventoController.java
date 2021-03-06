package br.com.n2s.sara.controller;

import br.com.n2s.sara.dao.DAOEvento;
import br.com.n2s.sara.model.Evento;
import java.util.List;

public class EventoController {
    
    private DAOEvento daoEvento;
    
    public EventoController() {
    	daoEvento  = new DAOEvento();
    }
    
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
    
    public void deletar(int idEvento){
        daoEvento.delete(idEvento);
    }
    
    public int obterUltimoId() {
    	return daoEvento.getLastId();
    }
    
}
