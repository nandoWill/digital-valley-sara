package br.ufc.russas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.ufc.russas.controller.CriterioTrilhaController;
import br.ufc.russas.controller.EventoController;
import br.ufc.russas.controller.UsuarioController;
import br.ufc.russas.model.Trilha;

public class DAOTrilha {

	private Connection connection;

	public DAOTrilha(){

		this.connection = new ConnectionFactory().getConnection(); 
	}

	public void create(Trilha trilha){

		String sql = "insert into sara.Trilha"  
				+ "(idTrilha, nome, descricao, coordenador, idEvento, idCriterioTrilha)"
				+ "values (?,?,?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, trilha.getIdTrilha());
			stmt.setString(2, trilha.getNome());
			stmt.setString(3, trilha.getDescricao());
			stmt.setString(4, trilha.getCoordenador().getCpf());
			stmt.setInt(5, trilha.getEvento().getIdEvento());
			stmt.setInt(6, trilha.getCriterioTrilha().getIdCriterioTrilha());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Trilha> read(){

		String sql = "select * from sara.Trilha";

		try{
			List<Trilha> trilhas = new ArrayList<Trilha>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			EventoController eventoController = new EventoController();
			UsuarioController usuarioController = new UsuarioController();
			CriterioTrilhaController criterioTrilhaController = new CriterioTrilhaController();

			while(rs.next()){

				Trilha trilha = new Trilha();

				trilha.setIdTrilha(rs.getInt("idTrilha"));
				trilha.setNome(rs.getString("nome"));
				trilha.setDescricao(rs.getString("descricao"));
				trilha.setCoordenador(usuarioController.buscar(rs.getString("coordenador")));
				trilha.setEvento(eventoController.buscar(rs.getInt("idEvento")));
				trilha.setCriterioTrilha(criterioTrilhaController.buscar(rs.getInt("idCriterioTrilha")));

				trilhas.add(trilha);

			}

			rs.close();
			stmt.close();
			return trilhas;

		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public Trilha getTrilha(int idTrilha){

		String sql = "select * from sara.Trilha where idTrilha = ?";

		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, idTrilha);
			ResultSet rs = stmt.executeQuery();
			EventoController eventoController = new EventoController();
			UsuarioController usuarioController = new UsuarioController();
			CriterioTrilhaController criterioTrilhaController = new CriterioTrilhaController();

			if(rs.next()){

				Trilha trilha = new Trilha();

				trilha.setIdTrilha(rs.getInt("idTrilha"));
				trilha.setNome(rs.getString("nome"));
				trilha.setDescricao(rs.getString("descricao"));
				trilha.setCoordenador(usuarioController.buscar(rs.getString("coordenador")));
				trilha.setEvento(eventoController.buscar(rs.getInt("idEvento")));
				trilha.setCriterioTrilha(criterioTrilhaController.buscar(rs.getInt("idCriterioTrilha")));

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

	public void update(Trilha trilha){

		String sql = "update sara.Trilha set idTrilha = ?, nome = ?, descricao = ?, coordenador = ?, idEvento = ?, "
				+ "idCriterioTrilha = ? where idTrilha = ?";


		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, trilha.getIdTrilha());
			stmt.setString(2, trilha.getNome());
			stmt.setString(3, trilha.getDescricao());
			stmt.setString(4, trilha.getCoordenador().getCpf());
			stmt.setInt(5, trilha.getEvento().getIdEvento());
			stmt.setInt(6, trilha.getCriterioTrilha().getIdCriterioTrilha());
			stmt.setInt(7, trilha.getIdTrilha());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public void delete(int idTrilha){

		String sql = "delete from sara.Trilha where idTrilha = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, idTrilha);
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
