package br.ufc.russas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufc.russas.model.NivelUsuario;
import br.ufc.russas.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hugo
 */
@Repository
public class DAOUsuario {

	private Connection connection;

    /**
     *
     */
    public DAOUsuario(){

		this.connection = new ConnectionFactory().getConnection(); 
	}

    /**
     *
     * @param usuario
     */
    @Autowired
    public void create(Usuario usuario){

		String sql = "insert into sara.Usuario"  
				+ "(cpf, nome, sobrenome, email, tipo)"
				+ "values (?,?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, usuario.getCpf());
			stmt.setString(2, usuario.getNome());
			stmt.setString(3, usuario.getSobrenome());
			stmt.setString(4, usuario.getEmail());
			stmt.setString(5, usuario.getTipo().toString());

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
    public List<Usuario> read(){

		String sql = "select * from sara.Usuario";

		try{
			List<Usuario> usuarios = new ArrayList<Usuario>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while(rs.next()){

				Usuario usuario = new Usuario();
				usuario.setCpf(rs.getString("cpf"));
				usuario.setNome(rs.getString("nome"));
				usuario.setSobrenome(rs.getString("sobrenome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setTipo(NivelUsuario.valueOf(rs.getString("tipo")));
				usuarios.add(usuario);
			}

			rs.close();
			stmt.close();
			return usuarios;

		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

    /**
     *
     * @param cpf
     * @return
     */
    @Autowired
    public Usuario getUsuario(String cpf){

		String sql = "select * from sara.Usuario where cpf = ?";

		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, cpf);
			ResultSet rs = stmt.executeQuery();

			if(rs.next()){
				Usuario usuario = new Usuario();
				usuario.setCpf(rs.getString("cpf"));
				usuario.setNome(rs.getString("nome"));
				usuario.setSobrenome(rs.getString("sobrenome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setTipo(NivelUsuario.valueOf(rs.getString("tipo")));

				rs.close();
				stmt.close();
				return usuario;
			}else{
				return null;
			}
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

    /**
     *
     * @param usuario
     */
    @Autowired
    public void update(Usuario usuario){

		String sql = "update sara.Usuario set cpf = ?, nome = ?, sobrenome = ?, email = ?, tipo = ? " 
				+ " where cpf = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, usuario.getCpf());
			stmt.setString(2, usuario.getNome());
			stmt.setString(3, usuario.getSobrenome());
			stmt.setString(4, usuario.getEmail());
			stmt.setString(5, usuario.getTipo().toString());
			stmt.setString(6, usuario.getCpf());
			
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

    /**
     *
     * @param usuario
     */
    @Autowired
    public void delete(Usuario usuario){

		String sql = "delete from sara.Usuario where cpf = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, usuario.getCpf());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
