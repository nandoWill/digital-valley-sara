/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufc.russas.controller;

import br.ufc.russas.dao.ConnectionFactory;
import br.ufc.russas.dao.DAOUsuario;
import br.ufc.russas.model.NivelUsuario;
import br.ufc.russas.model.Usuario;

/**
 *
 * @author Hugo
 */
public class Teste {
    
    
    public static void main(String[] args) {
        UsuarioController daoUser = new UsuarioController();
        
        Usuario u = daoUser.buscar("777");
        System.out.println(u.getNome());
    }
    
}
