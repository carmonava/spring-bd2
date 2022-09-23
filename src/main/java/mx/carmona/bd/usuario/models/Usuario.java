package mx.carmona.bd.usuario.models;

public class Usuario {
	private String nombre;
	private String contasena;
	private Integer idRol;
	
	public Usuario() {
		super();
	}
	
	public Usuario(String nombre, String contasena, Integer idRol) {
		super();
		this.nombre = nombre;
		this.contasena = contasena;
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContasena() {
		return contasena;
	}

	public void setContasena(String contasena) {
		this.contasena = contasena;
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Constraseña: " + contasena + " idRol " + idRol;
	}

}
