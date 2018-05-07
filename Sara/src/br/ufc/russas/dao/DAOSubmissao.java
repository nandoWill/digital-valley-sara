package br.ufc.russas.dao;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufc.russas.controller.UsuarioController;
import br.ufc.russas.model.NivelUsuario;
import br.ufc.russas.model.Periodo;
import br.ufc.russas.model.Submissao;
import br.ufc.russas.model.Trabalho;
import br.ufc.russas.model.Usuario;

public class DAOSubmissao {

	private Connection connection;

	public DAOSubmissao(){

		this.connection = new ConnectionFactory().getConnection(); 
	}

	public void create(Submissao submissao){

		String sql = "insert into sara.Submissao"  
				+ "(cpfautor, idtrabalho)"
				+ "values (?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, submissao.getAutor().getCpf());
			stmt.setInt(2, submissao.getTrabalho().getIdTrabalho());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Submissao> read(){

		String sql = "select * from sara.Submissao";

		try{
			List<Submissao> submissoes = new ArrayList<Submissao>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			UsuarioController usuarioController = new UsuarioController();

			while(rs.next()){

				Submissao submissao= new Submissao();
				submissao.setAutor(usuarioController.buscar(rs.getString("cpfautor")));
				submissao.setTrabalho(rs.getInt("idtrabalho"));
				submissoes.add(submissao);
			}

			rs.close();
			stmt.close();
			return submissoes;

		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public Submissao getSubmissao(int idtrabalho){

		String sql = "select * from sara.Submissao where idtrabalho = ?";

		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, idtrabalho);			
			ResultSet rs = stmt.executeQuery();

			if(rs.next()){
				Submissao submissao = new Submissao();
				submissao.setIdAutor(rs.getString("cpfautor"));
				submissao.setIdTrabalho(rs.getInt("idtrabalho"));

				rs.close();
				stmt.close();
				return submissao;
			}else{
				return null;
			}
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public void update(Submissao submissao){

		String sql = "update sara.Submissao set cpfautor = ?, idtrabalho = ? " 
				+ " where idtrabalho = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, submissao.getIdAutor());
			stmt.setInt(2, submissao.getIdTrabalho());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public void delete(Submissao submissao){

		String sql = "delete from sara.Usuario where idtrabalho = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, submissao.getIdTrabalho());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}

