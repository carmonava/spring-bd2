package mx.carmona.bd.usuario.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import mx.carmona.bd.usuario.mapper.UsuarioMapper;
import mx.carmona.bd.usuario.models.Usuario;
import mx.carmona.bd.usuario.models.ContrasenaBean;

@Repository
public class UsuarioImplDao implements UsuarioDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Usuario> getUsuariosDao() {
		String query = "select nombre, contrasena, idRol from usuarios";
		return jdbcTemplate.query(query, new UsuarioMapper());
	}
	
	@Override
	public List<Usuario> getUsuarioDao(String nombre) {
		//signo de ? significa que se ocultara una variable de la query
		String query = "select nombre, contrasena, idRol from usuarios where nombre = ?";
		
		//un PreparedStatementSetter es un objeto que nos ayuda a establecer parametros a una consulta
		PreparedStatementSetter pst = new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, nombre);
			}
		};
		
		return jdbcTemplate.query(query, pst, new UsuarioMapper());
	}
	
	@Override
	public int setUsuarioDao(ContrasenaBean datos){
		String query = "update usuarios set contrasena = ? where nombre = ?";
		return jdbcTemplate.update(query, datos.getContrasena(), datos.getNombre() );
	}
	
}
