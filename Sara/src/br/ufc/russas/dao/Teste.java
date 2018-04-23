package br.ufc.russas.dao;

import java.sql.Connection;
import java.sql.SQLException;

//import br.ufc.russas.model.NivelUsuario;
import br.ufc.russas.model.Usuario;

public class Teste {

	public static void main(String[] args) throws SQLException {

		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");

		//		Usuario usuario = new Usuario();
		//		usuario.setCpf("01002037492");
		//		usuario.setNome("joão");
		//		usuario.setSobrenome("maria");
		//		usuario.setEmail("joaomario@blabla");
		//		usuario.setTipo(NivelUsuario.AUTOR);
		//		
		DAOUsuario daoUsuario = new DAOUsuario();

		try {
			Usuario usu = daoUsuario.getUsuario("01002037492");
			usu.setNome("mateus");
			daoUsuario.delete(usu);

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		connection.close();

	}
}	