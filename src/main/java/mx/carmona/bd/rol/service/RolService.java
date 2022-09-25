package mx.carmona.bd.rol.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.carmona.bd.rol.models.RolModel;
import mx.carmona.bd.rol.models.RolSegundoModel;

@Service
public class RolService {

	public List<RolSegundoModel> getRolesService() {
		RolSegundoModel modelito = new RolSegundoModel();
		modelito.setIdRol(9);
		modelito.setRol("principal");
		modelito.setIdStatus(32);
		
		List<RolSegundoModel> mode = new ArrayList<>();
		mode.add(modelito);
		return mode;
	}

	public RolModel getRolService(String rol) {
	    RolModel modelo = new RolModel();	
	    modelo.setIdRol(12);
	    modelo.setRol("secundario");
		return modelo;
	}

	
	
	
	
	

}
