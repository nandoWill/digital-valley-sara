package br.ufc.russas.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufc.russas.model.Evento;
import br.ufc.russas.model.NivelUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hugo
 */
@Repository
public class DAOEvento {

	private Connection connection;

    /**
     *
     */
    public DAOEvento(){

		this.connection = new ConnectionFactory().getConnection(); 
	}

    /**
     *
     * @param evento
     */
    @Autowired
    public void create(Evento evento){

		String sql = "insert into sara.Evento"  
				+ "(idEvento, coordenador, idEventoPai, nome, descricao, site, localizacao, dataInicial, dataFinal)"
				+ "values (?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, evento.getIdEvento());
			stmt.setString(2, evento.getCoordenador());
			stmt.setInt(3, evento.getIdEventoPai());
			stmt.setString(4, evento.getNome());
			stmt.setString(5, evento.getDescricao());
			stmt.setString(6, evento.getSite());
			stmt.setString(7, evento.getLocalizacao());
			stmt.setDate(8, Date.valueOf(evento.getDataInicial()));
			stmt.setDate(9, Date.valueOf(evento.getDataFinal()));

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
    public List<Evento> read(){

		String sql = "select * from sara.Evento";

		try{
			List<Evento> eventos = new ArrayList<Evento>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while(rs.next()){

				Evento evento = new Evento();

				evento.setIdEvento(rs.getInt("idEvento"));
				evento.setCoordenador(rs.getString("coordenador"));
				evento.setIdEventoPai(rs.getInt("idEventoPai"));
				evento.setNome(rs.getString("nome"));
				evento.setDescricao(rs.getString("descricao"));
				evento.setSite(rs.getString("site"));
				evento.setLocalizacao(rs.getString("localizacao"));
				evento.setDataInicial(rs.getDate("dataInicial").toLocalDate());
				evento.setDataFinal(rs.getDate("dataFinal").toLocalDate());
				eventos.add(evento);

			}

			rs.close();
			stmt.close();
			return eventos;

		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

    /**
     *
     * @param idEvento
     * @return
     */
    @Autowired
    public Evento getEvento(int idEvento){

		String sql = "select * from sara.Evento where idEvento = ?";

		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, idEvento);
			ResultSet rs = stmt.executeQuery();

			if(rs.next()){
				Evento evento = new Evento();
				evento.setIdEvento(rs.getInt("idEvento"));
				evento.setCoordenador(rs.getString("coordenador"));
				evento.setIdEventoPai(rs.getInt("idEventoPai"));
				evento.setNome(rs.getString("nome"));
				evento.setDescricao(rs.getString("descricao"));
				evento.setSite(rs.getString("site"));
				evento.setLocalizacao(rs.getString("localizacao"));
				evento.setDataInicial(rs.getDate("dataInicial").toLocalDate());
				evento.setDataFinal(rs.getDate("dataFinal").toLocalDate());

				rs.close();
				stmt.close();

				return evento;
			}else{
				return null;
			}
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

    /**
     *
     * @param evento
     */
    @Autowired
    public void update(Evento evento){

		String sql = "update sara.Evento set idEvento = ?, coordenador = ?, idEventoPai = ?, nome = ?, descricao = ?, " 
				+ "site = ?, localizacao = ?, dataInicial = ?, dataFinal = ? where idEvento = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, evento.getIdEvento());
			stmt.setString(2, evento.getCoordenador());
			stmt.setInt(3, evento.getIdEventoPai());
			stmt.setString(4, evento.getNome());
			stmt.setString(5, evento.getDescricao());
			stmt.setString(6, evento.getSite());
			stmt.setString(7, evento.getLocalizacao());
			stmt.setDate(8, Date.valueOf(evento.getDataInicial()));
			stmt.setDate(9, Date.valueOf(evento.getDataFinal()));
			stmt.setInt(10, evento.getIdEvento());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

    /**
     *
     * @param evento
     */
    @Autowired
    public void delete(Evento evento){

		String sql = "delete from sara.Evento where idEvento = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, evento.getIdEvento());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
