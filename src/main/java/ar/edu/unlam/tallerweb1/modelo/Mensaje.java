package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mensaje")
public class Mensaje {
	
	
	//Atributos con los mails
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "emisorMensaje", length = 50)
	private String emisorMensaje;
	
	@Column(name = "receptorMensaje", length = 50)
	private String receptorMensaje;
	
	@Column(name = "texto", length = 500)
	private String texto;
	
	
	// constuctores 
	


	public Mensaje() {
	}


	
	// Getters y setters
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmisorMensaje() {
		return emisorMensaje;
	}


	public void setEmisorMensaje(String idCreadorMensaje) {
		this.emisorMensaje = idCreadorMensaje;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}



	public String getReceptorMensaje() {
		return receptorMensaje;
	}



	public void setReceptorMensaje(String idReceptorMensaje) {
		this.receptorMensaje = idReceptorMensaje;
	}
	
	
}

	
