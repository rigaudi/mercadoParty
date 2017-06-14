package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oferente")
public class Oferente {
	
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long idOferente;
	
	@Column(name = "nombre", length = 45)
	private String nombreOferente;
	
	@Column(name = "email", length = 100)
	private String emailOferente;
	
	@Column(name = "telefono")
	private Float telefonoOferente;
	
	@Column(name = "direccion", length = 45)
	private String direccionOferente;

	
	@Column(name = "zona", length = 15)
	private String zonaOferente;
	
	@Column(name = "password", length = 35)
	private String passwordOferente;
	
	
	// constuctores 
	


	public Oferente() {
	}

	public Oferente(String nombreOferente, String emailOferente, Float telefonoOferente, String direccionOferente,String zonaOferente, String passwordOferente) {
		this.nombreOferente = nombreOferente;
		this.emailOferente = emailOferente;
		this.telefonoOferente = telefonoOferente;
		this.direccionOferente = direccionOferente;
		this.zonaOferente = zonaOferente;
		this.passwordOferente = passwordOferente ;	
	}

	public Long getIdOferente() {
		return idOferente;
	}

	public void setIdOferente(Long idOferente) {
		this.idOferente = idOferente;
	}

	public String getEmailOferente() {
		return emailOferente;
	}

	public void setEmailOferente(String emailOferente) {
		this.emailOferente = emailOferente;
	}

	public Float getTelefonoOferente() {
		return telefonoOferente;
	}

	public void setTelefonoOferente(Float telefonoOferente) {
		this.telefonoOferente = telefonoOferente;
	}

	public String getDireccionOferente() {
		return direccionOferente;
	}

	public void setDireccionOferente(String direccionOferente) {
		this.direccionOferente = direccionOferente;
	}

	public String getZonaOferente() {
		return zonaOferente;
	}

	public void setZonaOferente(String zonaOferente) {
		this.zonaOferente = zonaOferente;
	}

	public String getPasswordOferente() {
		return passwordOferente;
	}

	public void setPasswordOferente(String passwordOferente) {
		this.passwordOferente = passwordOferente;
	}

	public String getNombreOferente() {
		return nombreOferente;
	}

	public void setNombreOferente(String nombreOferente) {
		this.nombreOferente = nombreOferente;
	}

	
	
}