package br.ufc.russas.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufc.russas.model.Periodo;

public class DAOPeriodo {

	private Connection connection;

	public DAOPeriodo() {
		this.connection = new ConnectionFactory().getConnection(); 

	}	

	public void create(Periodo periodo){

		String sql = "insert into sara.Periodo"  
				+ "(dataFinal, dataInicial, descricao,idPeriodo)"
				+ "values (?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setDate(1, Date.valueOf(periodo.getDataFinal())); // transforma Date para valor 
			stmt.setDate(2, Date.valueOf(periodo.getDataInicial()));
			stmt.setString(3, periodo.getDescricao());
			stmt.setInt(4, periodo.getIdPeriodo());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Periodo> read(){ //read()

		String sql = "select * from sara.Periodo";

		try{
			List<Periodo> periodos = new ArrayList<Periodo>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while(rs.next()){// anda o array

				Periodo periodo = new Periodo();
				periodo.setDataFinal((rs.getDate("datainicial").toLocalDate())); //toLocalDate()
				periodo.setDataInicial((rs.getDate("datafinal").toLocalDate()));
				periodo.setDescricao(rs.getString("descricao"));
				periodo.setIdPeriodo(rs.getInt("idPeriodo"));

				periodos.add(periodo);
			}

			rs.close();
			stmt.close();
			return periodos;

		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public Periodo getPeriodo(int idPeriodo){

		String sql = "select * from sara.Periodo where idperiodo = ?";

		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, idPeriodo);
			ResultSet rs = stmt.executeQuery();

			if(rs.next()){

				Periodo periodo = new Periodo();
				periodo.setDataFinal((rs.getDate("datainicial").toLocalDate())); //toLocalDate()
				periodo.setDataInicial((rs.getDate("datafinal").toLocalDate()));
				periodo.setDescricao(rs.getString("descricao"));
				periodo.setIdPeriodo(rs.getInt("idPeriodo"));

				rs.close();
				stmt.close();
				return periodo;
				
			}else{
				return null;
			}
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public void update(Periodo periodo){

		String sql = "update sara.Periodo set dataFinal = ?, set dataInicial=?, set descricao=? ,set idPeriodo=?" 
				+ " where idperiodo = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setDate(1, Date.valueOf(periodo.getDataFinal()));
			stmt.setDate(2, Date.valueOf(periodo.getDataInicial()));
			stmt.setString(3, periodo.getDescricao());
			stmt.setInt(4, periodo.getIdPeriodo());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public void delete(int idPeriodo){

		String sql = "delete from sara.Periodo where idperiodo = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, idPeriodo);
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
