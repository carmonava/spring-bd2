package mx.carmona.bd.usuario.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.carmona.bd.usuario.mapper.UsuarioMapper;
import mx.carmona.bd.usuario.models.Usuario;

@Repository
public class UsuarioImplDao implements UsuarioDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Usuario> getUsuariosDao() {
		String query = "select usuario, contrasena, idRol from usuarios";
		return jdbcTemplate.query(query, new UsuarioMapper());
		//return jdbcTemplateQuery();
	}
	
}
