package br.com.n2s.sara.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.n2s.sara.model.Periodo;

public class DAOPeriodo {

	private Connection connection;

	public DAOPeriodo() {}	

	public void create(Periodo periodo){
		
		this.connection = new ConnectionFactory().getConnection();
		
		String sql = "insert into sara.Periodo"  
				+ "(dataInicial, dataFinal, descricao)"
				+ "values (?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setDate(1, Date.valueOf(periodo.getDataInicial()));
			stmt.setDate(2, Date.valueOf(periodo.getDataFinal())); // transforma Date para valor 
			stmt.setString(3, periodo.getDescricao());
			
			stmt.execute();
			stmt.close();
			this.connection.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Periodo> read(){ //read()
		
		this.connection = new ConnectionFactory().getConnection();
		String sql = "select * from sara.Periodo";

		try{
			List<Periodo> periodos = new ArrayList<Periodo>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while(rs.next()){// anda o array

				Periodo periodo = new Periodo();
				periodo.setIdPeriodo(rs.getInt("idPeriodo"));
				periodo.setDataFinal((rs.getDate("dataInicial").toLocalDate())); //toLocalDate()
				periodo.setDataInicial((rs.getDate("dataFinal").toLocalDate()));
				periodo.setDescricao(rs.getString("descricao"));
				

				periodos.add(periodo);
			}

			rs.close();
			stmt.close();
			this.connection.close();
			return periodos;

		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public Periodo getPeriodo(int idPeriodo){
		
		this.connection = new ConnectionFactory().getConnection();
		String sql = "select * from sara.Periodo where idPeriodo = ?";

		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, idPeriodo);
			ResultSet rs = stmt.executeQuery();

			if(rs.next()){

				Periodo periodo = new Periodo();
				periodo.setIdPeriodo(rs.getInt("idPeriodo"));
				periodo.setDataFinal((rs.getDate("dataInicial").toLocalDate())); //toLocalDate()
				periodo.setDataInicial((rs.getDate("dataFinal").toLocalDate()));
				periodo.setDescricao(rs.getString("descricao"));
				
				rs.close();
				stmt.close();
				this.connection.close();
				return periodo;
				
			}else{
				return null;
			}
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public void update(Periodo periodo){
		
		this.connection = new ConnectionFactory().getConnection();
		String sql = "update sara.Periodo dataInicial = ?, dataFinal = ?, descricao = ?" 
				+ " where idPeriodo = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setDate(1, Date.valueOf(periodo.getDataInicial()));
			stmt.setDate(2, Date.valueOf(periodo.getDataFinal()));
			stmt.setString(3, periodo.getDescricao());
			stmt.setInt(4, periodo.getIdPeriodo());

			stmt.execute();
			stmt.close();
			this.connection.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public void delete(int idPeriodo){
		
		this.connection = new ConnectionFactory().getConnection();
		String sql = "delete from sara.Periodo where idPeriodo = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, idPeriodo);
			stmt.execute();
			stmt.close();
			this.connection.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
