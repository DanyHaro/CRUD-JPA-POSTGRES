package pe.edu.upeu.apirest.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpersona;
	private String nombres;
	private String correo;
	private int telefono;
	
	public Usuario(){
		
	}

	public Usuario(String nombres, String correo, int telefono) {
		super();
		this.nombres = nombres;
		this.correo = correo;
		this.telefono = telefono;
	}

	public Long getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(Long idpersona) {
		this.idpersona = idpersona;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Usuario [idpersona=" + idpersona + ", nombres=" + nombres + ", correo=" + correo + ", telefono= " + telefono + "]";
	}
	
}
