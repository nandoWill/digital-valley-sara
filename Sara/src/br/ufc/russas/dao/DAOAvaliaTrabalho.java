package br.com.n2s.sara.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.n2s.sara.model.AvaliaTrabalho;

public class DAOAvaliaTrabalho {
	
	private Connection connection;

	public DAOAvaliaTrabalho(){

		this.connection = new ConnectionFactory().getConnection(); 
	}

	public void create(AvaliaTrabalho avalia){

		String sql = "insert into sara.avaliatrabalho"  
				+ "(idavaliador, idtrabalho)"
				+ "values (?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, avalia.getIdAvaliador());
			stmt.setInt(2, avalia.getIdTrabalho());
			
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<AvaliaTrabalho> read(){

		String sql = "select * from sara.Avaliatrabalho";

		try{
			List<AvaliaTrabalho> avaliacoes = new ArrayList<AvaliaTrabalho>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while(rs.next()){

				AvaliaTrabalho avalia = new AvaliaTrabalho();
				avalia.setIdAvaliador(rs.getString("idavaliador"));
				avalia.setIdTrabalho(rs.getInt("idtrabalho"));
				
				avaliacoes.add(avalia);
			}

			rs.close();
			stmt.close();
			return avaliacoes;

		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public AvaliaTrabalho getAvaliaTrabalho(String idavaliador){

		String sql = "select * from sara.Avaliatrabalho where idavaliador = ?";

		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, idavaliador);
			ResultSet rs = stmt.executeQuery();

			if(rs.next()){
				AvaliaTrabalho avalia = new AvaliaTrabalho();
				avalia.setIdAvaliador(rs.getString("idavaliador"));
				avalia.setIdTrabalho(rs.getInt("idtrabalho"));
				
				rs.close();
				stmt.close();
				return avalia;
			}else{
				return null;
			}
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public void update(AvaliaTrabalho avalia){

		String sql = "update sara.AvaliaTrabalho set idavaliador = ?, idtrabalho = ?" 
				+ " where idavaliador = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, avalia.getIdAvaliador());
			stmt.setInt(2, avalia.getIdTrabalho());
						
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	
	public void delete(AvaliaTrabalho avalia){

		String sql = "delete from sara.Usuario where idtrabalho = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, avalia.getIdTrabalho());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	

	
}