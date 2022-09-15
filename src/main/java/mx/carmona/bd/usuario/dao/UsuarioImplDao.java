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
	
	
	public List<Usuario> jdbcTemplateQuery(){
		
		Usuario u1 = new Usuario("lcarmonan", "1103", 2);
		Usuario u2 = new Usuario("diana", "1234", 1);
		Usuario u3 = new Usuario("daniela", "1234", 1);
		Usuario u4 = new Usuario("yessenia", "1234", 1);
		Usuario u5 = new Usuario("jaqueline", "1234", 1);
		
		List<Usuario> listaUsuarios = new ArrayList<>();
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
		listaUsuarios.add(u3);
		listaUsuarios.add(u4);
		listaUsuarios.add(u5);
		
		
		return listaUsuarios;
	}
	
}
