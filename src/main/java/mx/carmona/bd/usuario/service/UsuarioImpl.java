package mx.carmona.bd.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.carmona.bd.usuario.dao.UsuarioDao;
import mx.carmona.bd.usuario.models.Usuario;
import mx.carmona.bd.usuario.models.ContrasenaBean;

@Service
public class UsuarioImpl implements UsuarioService {
	
	@Autowired
	UsuarioDao usuarioDao;
	
	@Override
	public List<Usuario> getUsuariosService() {
		return usuarioDao.getUsuariosDao();
	}

	@Override
	public Usuario getUsuarioService(String nombre) {
		Usuario usuario = null;
		
		List<Usuario> resultado = usuarioDao.getUsuarioDao(nombre);
		
		if(resultado.isEmpty()) {
			usuario = new Usuario();
			usuario.setNombre("Inexistente");
			usuario.setContasena("--");
			usuario.setIdRol(0);
		}else {
			usuario = resultado.get(0);
		}
		
		return usuario;
	}

	@Override
	public String setUsuarioService(ContrasenaBean datos){
		
		int resultado = usuarioDao.setUsuarioDao(datos);
		String mensaje = "";
		if(resultado == 1) {
			mensaje = "Se cambio la contraseña";
		}else {
			mensaje = "No se cambio la contraseña";
			//throw new RuntimeException("trono el programa");
		}
		
		return mensaje;
	}
}
