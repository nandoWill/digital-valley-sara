package br.com.n2s.sara.dao;

import java.io.File;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.n2s.sara.controller.EventoController;
import br.com.n2s.sara.controller.FileManipulation;
import br.com.n2s.sara.controller.TrilhaController;
import br.com.n2s.sara.controller.UsuarioController;
import br.com.n2s.sara.model.CriterioTrilha;
import br.com.n2s.sara.model.Evento;
import br.com.n2s.sara.model.NivelUsuario;
import br.com.n2s.sara.model.Periodo;
import br.com.n2s.sara.model.StatusTrabalho;
import br.com.n2s.sara.model.Trabalho;
import br.com.n2s.sara.model.Trilha;
import br.com.n2s.sara.model.Usuario;


public class Teste {

	public static void main(String[] args) throws SQLException {

		try {

			EventoController eventoController = new EventoController();
			UsuarioController usuarioController = new UsuarioController();
			TrilhaController trilhaController = new TrilhaController();

//			Usuario u1 = new Usuario();
//			u1.setCpf("123");
//			u1.setNome("Vinicius");
//			u1.setSobrenome("Almeida");
//			u1.setEmail("vini@gmail.com");
//			u1.setTipo(NivelUsuario.ADMINISTRADOR);
//
//			Usuario u2 = new Usuario();
//			u2.setCpf("456");
//			u2.setNome("Marilia");
//			u2.setSobrenome("Cristina");
//			u2.setEmail("marilia@gmail.com");
//			u2.setTipo(NivelUsuario.AUTOR);
//
//			Usuario u3 = new Usuario();
//			u3.setCpf("789");
//			u3.setNome("Hugo");
//			u3.setSobrenome("Demoley");
//			u3.setEmail("huhgo@gmail.com");
//			u3.setTipo(NivelUsuario.AVALIADOR);
//
//			Usuario u4 = new Usuario();
//			u4.setCpf("100");
//			u4.setNome("Davidson");
//			u4.setSobrenome("Nunes");
//			u4.setEmail("davidson@gmail.com");
//			u4.setTipo(NivelUsuario.COORDENADOR_EVENTO);
//
//			Usuario u5 = new Usuario();
//			u5.setCpf("111");
//			u5.setNome("João");
//			u5.setSobrenome("Maria");
//			u5.setEmail("joao@gmail.com");
//			u5.setTipo(NivelUsuario.COORDENADOR_TRILHA);
//			
//			usuarioController.criar(u1);
//			usuarioController.criar(u2);
//			usuarioController.criar(u3);
//			usuarioController.criar(u4);
//			usuarioController.criar(u5);
			
//			LocalDate data = LocalDate.of(2018, 10, 10);
//			
//			Evento e1 = new Evento();
//			e1.setNome("Encontros Universitarios");
//			e1.setDescricao("Evento para apresentação de trabalhos desenvolvidos pelos alunos");
//			e1.setSite("www.eu.ufc.br");
//			e1.setLocalizacao("Campus da UFC em Russas");
//			e1.setDataInicial(data);
//			e1.setDataFinal(data.plusDays(10));
//			
//			eventoController.criar(e1);
			
//			Trilha t1 = new Trilha();
//			t1.setNome("Trabalhos de Pesquisa");
//			t1.setDescricao("Trilha para submissão de trabalhos de pesquisa");
//			t1.setEvento(eventoController.buscar(1));
//			
//			Trilha t2 = new Trilha();
//			t2.setNome("Trabalhos de Extensão");
//			t2.setDescricao("Trilha para submissão de trabalhos de extensão");
//			t2.setEvento(eventoController.buscar(1));
//			
//			trilhaController.criar(t1);
//			trilhaController.criar(t2);
			
			Criterio 
			
			
			System.out.println("Ok");
			
		} catch (RuntimeException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
}	