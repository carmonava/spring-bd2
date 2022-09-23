package mx.carmona.bd.usuario.service;

import java.util.List;

import mx.carmona.bd.usuario.models.Usuario;
import mx.carmona.bd.usuario.models.ContrasenaBean;

public interface UsuarioService {
	List<Usuario> getUsuariosService();
	Usuario getUsuarioService(String nombre);
	String setUsuarioService(ContrasenaBean datos);
}
