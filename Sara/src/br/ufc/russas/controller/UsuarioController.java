/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufc.russas.controller;

import br.ufc.russas.dao.ConnectionFactory;
import br.ufc.russas.dao.DAOUsuario;
import br.ufc.russas.model.Usuario;
import java.util.List;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hugo
 */
@Repository
public class UsuarioController {
    
    ConnectionFactory con = new ConnectionFactory();
    DAOUsuario daoUsuario = new DAOUsuario();
    
    public void criar(Usuario usuario){
        daoUsuario.create(usuario);
    }
    
    public List<Usuario> listar(){
        return daoUsuario.read();
    }
    
    @Autowired
    public Usuario buscar(String cpf){
        return daoUsuario.getUsuario(cpf);
    }
    
    public void atualizar(Usuario usuario){
        daoUsuario.update(usuario);
    }
    
    public void deletar(Usuario usuario){
        daoUsuario.delete(usuario);
    }
}
