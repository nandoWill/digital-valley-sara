package br.ufc.russas.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufc.russas.model.CriterioTrilha;


public class DAOCriterioTrilha {
	
	private Connection connection;

	public DAOCriterioTrilha(){

		this.connection = new ConnectionFactory().getConnection(); 
	}

	public void create(CriterioTrilha criterioTrilha){

		String sql = "insert into sara.CriterioTrilha"  
				+ "(idCriterioTrilha, dataCriacao, nome)"
				+ "values (?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, criterioTrilha.getIdCriterioTrilha());
			stmt.setDate(2, Date.valueOf(criterioTrilha.getDataCriacao()));
			stmt.setString(3, criterioTrilha.getNome());
			
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<CriterioTrilha> read(){

		String sql = "select * from sara.CriterioTriha";

		try{
			List<CriterioTrilha> criterioTrilhas = new ArrayList<CriterioTrilha>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while(rs.next()){

				CriterioTrilha criterioTrilha = new CriterioTrilha();

				criterioTrilha.setIdCriterioTrilha(rs.getInt("idCriterioTrilha"));
				criterioTrilha.setDataCriacao(rs.getDate("dataCriacao").toLocalDate());
				criterioTrilha.setNome(rs.getString("nome"));
				
				criterioTrilhas.add(criterioTrilha);

			}

			rs.close();
			stmt.close();
			return criterioTrilhas;

		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public CriterioTrilha getCriterioTrilha(int idCriterioTrilha){

		String sql = "select * from sara.CriterioTrilha where idCriterioTrilha = ?";

		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, idCriterioTrilha);
			ResultSet rs = stmt.executeQuery();

			if(rs.next()){
				
				CriterioTrilha criterioTrilha = new CriterioTrilha();

				criterioTrilha.setIdCriterioTrilha(rs.getInt("idCriterioTrilha"));
				criterioTrilha.setDataCriacao(rs.getDate("dataCriacao").toLocalDate());
				criterioTrilha.setNome(rs.getString("nome"));
			
				rs.close();
				stmt.close();
				return criterioTrilha;
			}else{
				return null;
			}
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public void update(CriterioTrilha criterioTrilha){

		String sql = "update sara.CriterioTrilha set idCriterioTrilha = ?, dataCriacao = ? nome = ?"
				+ " where idCriterioTrilha = ?";
				

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, criterioTrilha.getIdCriterioTrilha());
			stmt.setDate(2, Date.valueOf(criterioTrilha.getDataCriacao()));
			stmt.setString(3, criterioTrilha.getNome());
			stmt.setInt(4, criterioTrilha.getIdCriterioTrilha());
			
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public void delete(int idCriterioTrilha){

		String sql = "delete from sara.CriterioTrilha where idCriterioTrilha = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, idCriterioTrilha);
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
