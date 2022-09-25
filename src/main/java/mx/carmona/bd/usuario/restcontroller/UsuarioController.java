package mx.carmona.bd.usuario.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.carmona.bd.usuario.models.ContrasenaBean;
import mx.carmona.bd.usuario.models.Usuario;
import mx.carmona.bd.usuario.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	// @GET Obtener información - select en base de datos
	// Obtiene todos los Uusuarios
	@GetMapping("/usuarios")
	public List<Usuario> getUsuarios() {
		return usuarioService.getUsuariosService();
	}
	
	// Obtener un solo Usuario a traves de su nombre
	@GetMapping("/usuario")
	public Usuario getUsuario(@RequestParam String nombre) {
		return usuarioService.getUsuarioService(nombre);
	}
	
	
	// POST Actualizar información, y despues la puedes obtener o no.
	@PostMapping("/agrega")
	public String updateUsuario(@RequestBody ContrasenaBean datos) {
		return usuarioService.setUsuarioService(datos);
	}

}