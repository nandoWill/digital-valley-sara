package br.ufc.russas.dao;

import java.sql.SQLException;
import java.time.LocalDate;

import br.ufc.russas.controller.EventoController;
import br.ufc.russas.controller.UsuarioController;
import br.ufc.russas.model.Evento;


public class Teste {

	public static void main(String[] args) throws SQLException {

		try {

			EventoController eventoController = new EventoController();
			UsuarioController usuarioController = new UsuarioController();

//			LocalDate dataExemplo = LocalDate.of(2018, 12, 13);
//
//			Evento evento = new Evento();
//			evento.setIdEvento(44);
//			evento.setCoordenador(usuarioController.buscar("777"));
//			evento.setIdEventoPai(20);
//			evento.setNome("Workshop de IA");
//			evento.setDescricao("........");
//			evento.setSite("www.wia.com.br");
//			evento.setLocalizacao("Campus UFC - Quixadá");
//			evento.setDataInicial(dataExemplo);
//			evento.setDataFinal(dataExemplo.plusDays(10));		
			

			DAOTrilha d = new DAOTrilha();
			d.read();

		} catch (RuntimeException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
}	