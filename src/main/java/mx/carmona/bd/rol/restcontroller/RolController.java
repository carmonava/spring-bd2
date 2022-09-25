package mx.carmona.bd.rol.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.carmona.bd.rol.service.RolService;
import mx.carmona.bd.rol.models.*;

@RestController
@RequestMapping("/rol")

public class RolController {
	
	@Autowired
	RolService rolService;

	@GetMapping("/rolesprin")
	public List<RolSegundoModel> getRol(){
	   return rolService.getRolesService();
	}

	
	@GetMapping("/rolprin")
	public RolModel getRol(@RequestParam String rol){
	    return rolService.getRolService(rol);
	    
	}

	
	

}
