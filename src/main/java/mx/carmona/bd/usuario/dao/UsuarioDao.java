package mx.carmona.bd.usuario.dao;

import java.util.List;

import mx.carmona.bd.usuario.models.Usuario;
import mx.carmona.bd.usuario.models.ContrasenaBean;

public interface UsuarioDao {
	List<Usuario> getUsuariosDao();

	List<Usuario> getUsuarioDao(String nombre);

	int setUsuarioDao(ContrasenaBean datos);
	
}
