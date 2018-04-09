/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufc.russas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Hugo
 */
@Controller
public class IndexController {
    
    @RequestMapping("/indexAutor")
    public String   getIndex(){
        return "indexAutor";
    }
    
    @RequestMapping("/indexAvaliador")
    public String getAvaliador(){
        return "indexAvaliador";
    }
    
    @RequestMapping("/indexCoordTrilha")
    public String getCT(){
        return "/indexCoordTrilha";
    }
    
    @RequestMapping("/indexCoordEvento")
    public String getCE(){
        return "indexCoordEvento";
    }
    
    @RequestMapping("/paginaEvento")
    public String getPage(){
        return "paginaEvento";
    }
    
}
