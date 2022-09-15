package mx.carmona.bd.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.carmona.bd.usuario.models.Datos;
import mx.carmona.bd.usuario.models.OtrosDatos;
import mx.carmona.bd.usuario.models.Usuario;
import mx.carmona.bd.usuario.service.UsuarioImpl;
import mx.carmona.bd.usuario.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	// @GET Obtener información - select en base de datos
	@GetMapping("/usuarios")
	public List<Usuario> getUsuarios() {

		return usuarioService.getUsuariosService();

	}

	// POST Actualizar información, y despues la puedes obtener o no.
	@PostMapping("/usuario")
	public String updateUsuario(@RequestBody Datos datos) {

		// Se fue al service
		// se fue al dao
		// Su mapper correspondiente
		// Si todo salió bien, se regresa la respuesta siugiente
		return "Se actalizó el Usuario " + datos.getNombre();

	}

	@PostMapping("/usuariox")
	public String algo(@RequestBody OtrosDatos otrosDatos) {
		//Necesitas recibir 3 párámetros
		//nombre
		//edad
		//sexo
		
		return "Se actalizó el Usuario " 
		+ otrosDatos.getNombre() + " "
		+ otrosDatos.getEdad() 
		+ " "  + otrosDatos.getSexo();

	}

}
