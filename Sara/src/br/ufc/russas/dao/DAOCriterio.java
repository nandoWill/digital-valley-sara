package br.com.n2s.sara.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.n2s.sara.controller.CriterioTrilhaController;
import br.com.n2s.sara.model.Criterio;

public class DAOCriterio {
	
	private Connection connection;

	public DAOCriterio(){}

	public void create(Criterio criterio){
		
		this.connection = new ConnectionFactory().getConnection();
		String sql = "insert into sara.Criterio"  
				+ "(descricao, peso, idCriterioTrilha)"
				+ "values (?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, criterio.getDescricao());
			stmt.setInt(2, criterio.getPeso());
			stmt.setInt(3, criterio.getCriterioTrilha().getIdCriterioTrilha());
			
			stmt.execute();
			stmt.close();
			this.connection.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Criterio> read(){
		
		this.connection = new ConnectionFactory().getConnection();
		String sql = "select * from sara.Criterio";

		try{
			List<Criterio> criterios = new ArrayList<Criterio>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			CriterioTrilhaController criterioTrilhaController = new CriterioTrilhaController();

			while(rs.next()){

				Criterio criterio = new Criterio();

				criterio.setIdCriterio(rs.getInt("idCriterio"));
				criterio.setDescricao(rs.getString("descricao"));
				criterio.setPeso(rs.getInt("peso"));
				criterio.setCriterioTrilha(criterioTrilhaController.buscar(rs.getInt("idCriterioTrilha")));
				
				criterios.add(criterio);

			}

			rs.close();
			stmt.close();
			this.connection.close();
			return criterios;

		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public Criterio getCriterio(int idCriterio){
		
		this.connection = new ConnectionFactory().getConnection();
		String sql = "select * from sara.Criterio where idCriterio = ?";

		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, idCriterio);
			ResultSet rs = stmt.executeQuery();
			CriterioTrilhaController criterioTrilhaController = new CriterioTrilhaController();

			if(rs.next()){
				
				Criterio criterio = new Criterio();

				criterio.setIdCriterio(rs.getInt("idCriterio"));
				criterio.setDescricao(rs.getString("descricao"));
				criterio.setPeso(rs.getInt("peso"));
				criterio.setCriterioTrilha(criterioTrilhaController.buscar(rs.getInt("idCriterioTrilha")));
			
				rs.close();
				stmt.close();
				this.connection.close();
				return criterio;
			}else{
				return null;
			}
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public void update(Criterio criterio){
		
		this.connection = new ConnectionFactory().getConnection();
		String sql = "update sara.Criterio set descricao = ? peso = ?, idCriterioTrilha = ?"
				+ " where idCriterio = ?";
				
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, criterio.getDescricao());
			stmt.setInt(2, criterio.getPeso());
			stmt.setInt(3, criterio.getCriterioTrilha().getIdCriterioTrilha());
			stmt.setInt(4, criterio.getIdCriterio());
			
			stmt.execute();
			stmt.close();
			this.connection.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public void delete(int idCriterio){
		
		this.connection = new ConnectionFactory().getConnection();
		String sql = "delete from sara.Criterio where idCriterio = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, idCriterio);
			stmt.execute();
			stmt.close();
			this.connection.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
