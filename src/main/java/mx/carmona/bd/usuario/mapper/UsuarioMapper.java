package mx.carmona.bd.usuario.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.carmona.bd.usuario.models.Usuario;

public class UsuarioMapper implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario usuario = new Usuario();
		usuario.setUsuario(rs.getString(1));
		usuario.setContasena(rs.getString(2));
		usuario.setIdRol(rs.getInt(3));
		return usuario;
	}
}
