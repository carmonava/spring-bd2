package mx.carmona.bd.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.carmona.bd.usuario.dao.UsuarioDao;
import mx.carmona.bd.usuario.models.Usuario;

@Service
public class UsuarioImpl implements UsuarioService {
	
	@Autowired
	UsuarioDao usuarioDao;
	
	@Override
	public List<Usuario> getUsuariosService() {
		return usuarioDao.getUsuariosDao();
	}

}
