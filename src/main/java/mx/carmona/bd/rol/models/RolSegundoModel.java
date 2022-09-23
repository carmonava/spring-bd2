package mx.carmona.bd.rol.models;

public class RolSegundoModel {

	private Integer idRol;
	private String rol;
	private Integer idStatus;
	
	
	public RolSegundoModel() {
		super();
	}
	
		
	public RolSegundoModel(Integer idRol, String rol, Integer idStatus) {
		super();
		this.idRol = idRol;
		this.rol = rol;
		this.idStatus = idStatus;
	}


	public Integer getIdRol() {
		return idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public Integer getIdStatus() {
		return idStatus;
	}
	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}
	
	
	
}
