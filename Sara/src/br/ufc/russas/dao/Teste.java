package br.com.n2s.sara.dao;

import java.io.File;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.n2s.sara.controller.EventoController;
import br.com.n2s.sara.controller.FileManipulation;
import br.com.n2s.sara.controller.TrilhaController;
import br.com.n2s.sara.controller.UsuarioController;
import br.com.n2s.sara.model.Evento;
import br.com.n2s.sara.model.StatusTrabalho;
import br.com.n2s.sara.model.Trabalho;


public class Teste {

	public static void main(String[] args) throws SQLException {

		try {

			EventoController eventoController = new EventoController();
			UsuarioController usuarioController = new UsuarioController();
			TrilhaController trilhaController = new TrilhaController();

//			LocalDate dataExemplo = LocalDate.of(2018, 12, 13);
//
//			Evento evento = new Evento();
//			evento.setIdEvento(44);
//			evento.setCoordenador(usuarioController.buscar("777"));
//			evento.setNome("Workshop de IA");
//			evento.setDescricao("........");
//			evento.setSite("www.wia.com.br");
//			evento.setLocalizacao("Campus UFC - Quixadá");
//			evento.setDataInicial(dataExemplo);
//			evento.setDataFinal(dataExemplo.plusDays(10));		
//			
//			eventoController.criar(evento);
//			System.out.println("Ok");
			
			

//			DAOTrilha d = new DAOTrilha();
//			d.read();
			
			File file = new File("C:\\Users\\Vinicius\\Downloads\\Exemplo.pdf");
			
			Trabalho t = new Trabalho();
			t.setIdTrabalho(85);
			t.setTitulo("Testando");
			t.setPalavrasChaves("sdlufhdf");
			t.setResumo("resumo");
			t.setStatus(StatusTrabalho.ACEITO);
			t.setManuscrito(file);
			t.setTrilha(trilhaController.buscar(0));
			
			DAOTrabalho dt = new DAOTrabalho();
			dt.create(t);
			
			

		} catch (RuntimeException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
}	