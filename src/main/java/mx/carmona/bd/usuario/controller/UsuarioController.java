package mx.carmona.bd.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.carmona.bd.usuario.models.Usuario;
import mx.carmona.bd.usuario.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/usuario")
	public List<Usuario> getUsuarios() {
		
		return usuarioService.getUsuariosService();
		
	}
}
