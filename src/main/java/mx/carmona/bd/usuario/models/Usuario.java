package mx.carmona.bd.usuario.models;

public class Usuario {
	private String usuario;
	private String contasena;
	private Integer idRol;
	
	public Usuario() {
		super();
	}
	
	public Usuario(String usuario, String contasena, Integer idRol) {
		super();
		this.usuario = usuario;
		this.contasena = contasena;
		this.idRol = idRol;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
		return "Usuario: " + usuario + ", Constraseña: " + contasena + " idRol " + idRol;
	}

}
