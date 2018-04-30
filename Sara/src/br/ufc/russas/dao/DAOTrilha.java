package br.ufc.russas.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.ufc.russas.model.Trilha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hugo
 */
@Repository
public class DAOTrilha {
	
	private Connection connection;

    /**
     *
     */
    public DAOTrilha(){

		this.connection = new ConnectionFactory().getConnection(); 
	}

    /**
     *
     * @param trilha
     */
    @Autowired
    public void create(Trilha trilha){

		String sql = "insert into sara.Trilha"  
				+ "(idTrilha, nome, descricao, coordenador, idEvento, idCriterioTrilha)"
				+ "values (?,?,?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, trilha.getIdTrilha());
			stmt.setString(2, trilha.getNome());
			stmt.setString(3, trilha.getDescricao());
			stmt.setString(4, trilha.getCoordenador());
			stmt.setInt(5, trilha.getIdEvento());
			stmt.setInt(6, trilha.getIdCriterioTrilha());
			
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

    /**
     *
     * @return
     */
    @Autowired
    public List<Trilha> read(){

		String sql = "select * from sara.Trilha";

		try{
			List<Trilha> trilhas = new ArrayList<Trilha>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while(rs.next()){

				Trilha trilha = new Trilha();

				trilha.setIdTrilha(rs.getInt("idTrilha"));
				trilha.setNome(rs.getString("nome"));
				trilha.setDescricao(rs.getString("descricao"));
				trilha.setCoordenador(rs.getString("coordenador"));
				trilha.setIdEvento(rs.getInt("idEvento"));
				trilha.setIdCriterioTrilha(rs.getInt("idCriterioTrilha"));
				
				trilhas.add(trilha);

			}

			rs.close();
			stmt.close();
			return trilhas;

		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

    /**
     *
     * @param idTrilha
     * @return
     */
    @Autowired
    public Trilha getTrilha(int idTrilha){

		String sql = "select * from sara.Trilha where idTrilha = ?";

		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, idTrilha);
			ResultSet rs = stmt.executeQuery();

			if(rs.next()){
				
				Trilha trilha = new Trilha();
				trilha.setIdTrilha(rs.getInt("idTrilha"));
				trilha.setNome(rs.getString("nome"));
				trilha.setDescricao(rs.getString("descricao"));
				trilha.setCoordenador(rs.getString("coordenador"));
				trilha.setIdEvento(rs.getInt("idEvento"));
				trilha.setIdCriterioTrilha(rs.getInt("idCriterioTrilha"));
				rs.close();
				stmt.close();

				return trilha;
			}else{
				return null;
			}
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

    /**
     *
     * @param trilha
     */
    @Autowired
    public void update(Trilha trilha){

		String sql = "update sara.Trilha set idTrilha = ?, nome = ?, descricao = ?, coordenador = ?, idEvento = ?, "
				+ "idCriterioTrilha = ? where idTrilha = ?";
				

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, trilha.getIdTrilha());
			stmt.setString(2, trilha.getNome());
			stmt.setString(3, trilha.getDescricao());
			stmt.setString(4, trilha.getCoordenador());
			stmt.setInt(5, trilha.getIdEvento());
			stmt.setInt(6, trilha.getIdCriterioTrilha());
			stmt.setInt(7, trilha.getIdTrilha());
			
			stmt.execute();
			stmt.close();

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

    /**
     *
     * @param trilha
     */
    @Autowired
    public void delete(Trilha trilha){

		String sql = "delete from sara.Trilha where idTrilha = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, trilha.getIdTrilha());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
