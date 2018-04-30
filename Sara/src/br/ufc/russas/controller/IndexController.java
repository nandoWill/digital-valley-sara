/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufc.russas.controller;

import br.ufc.russas.model.NivelUsuario;
import br.ufc.russas.model.Periodo;
import br.ufc.russas.model.Trabalho;
import br.ufc.russas.model.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    
    @RequestMapping("/paginaTrilha")
    public String getTrilha(){
        return "paginaTrilha";
    }
    
    @RequestMapping("/submeterTrabalho")
    public String submTrabalho(Trabalho trabalho){
        /*Quando o DAO estiver pronto será inserido aqui*/
        return "confirmaSubmissao";
    }
    
    @RequestMapping("/gerenciaEvento")
    public String gerTrilha(){
        return "gerenciaEvento";
    }
    
    @RequestMapping("/manterTrilha")
    public String manterTrilha(){
        return "manterTrilha";
    }
    
    @RequestMapping("/gerenciaAvaliadores")
    public String gerenciaAvaliadores(){
        return "gerenciaAvaliadores";
    }
    
    @RequestMapping("/gerenciaPeriodos")
    public String gerenciaPeriodos(){
        return "gerenciaPeriodos";
    }
    
    @RequestMapping("/gerenciaCoordenadores")
    public String gerenciaCoordTrilha(){
        return "gerenciaCoordenador";
    }
    
    @RequestMapping("/adicionaAvaliador")
    public String adcAv(){
        return "adicionaAvaliador";
    }
    
    @RequestMapping("/confirmaCadastro")
    public String confirmaCadastroAvaliador(Usuario avaliador){
        avaliador.setTipo(NivelUsuario.AVALIADOR);
        
        System.out.println(avaliador.getNome());
        System.out.println(avaliador.getCpf());
        System.out.println(avaliador.getEmail());
        return "confirmaCadastro";
    }
    
    @RequestMapping("/removeAvaliador")
    public String rmAv(){
        return "removeAvaliador";
    }
    
    @RequestMapping("/adicionaPeriodo")
    public String adcPr(){
        return "adicionaPeriodo";
    }
    
    @RequestMapping("/confirmaPeriodo")
    public String confirmaCadastroPeriodo(String descricao, String dataInicial, String dataFinal){
        Periodo periodo = new Periodo();
        String[] invData = dataInicial.split("-");
        String data = invData[2]+"/"+invData[1]+"/"+invData[0];
        LocalDate inputDate = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        periodo.setDataInicial(inputDate);
        
        invData = dataFinal.split("-");
        data = invData[2]+"/"+invData[1]+"/"+invData[0];
        inputDate = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        periodo.setDataFinal(inputDate);
        periodo.setDescricao(descricao);
        
        System.out.println(periodo.getDescricao());
        System.out.println(periodo.getDataInicial().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(periodo.getDataFinal().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        return "confirmaPeriodo";
    }
    
    @RequestMapping("/alteraPeriodo")
    public String altPr(){
        return "alteraPeriodo";
    }    
    
    @RequestMapping("/removePeriodo")
    public String rmPr(){
        return "removePeriodo";
    }
    
    @RequestMapping("/avaliarTrabalho")
    public String avaliarTrabalho(){
        return "avaliarTrabalho";
    }
}
