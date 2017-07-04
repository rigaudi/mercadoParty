package ar.edu.unlam.tallerweb1.modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "mensaje")
public class Mensaje {
	
	
	//Atributos con los mails
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMensaje")
	private Long idMensaje;
	
	@Column(name = "texto", length = 500)
	private String texto;
	
	
	@ManyToOne
	@JoinColumn(name = "idPublicacion", nullable = true)
	private Publicacion publicacion;
	
	@ManyToOne
	@JoinColumn(name = "id", nullable = true)
	private Consumidor consumidorEmisor;
	
	@ManyToOne
	@JoinColumn(name = "idConsumidor", nullable = true)
	private Consumidor consumidorReceptor;
	
	
	


	public Mensaje() {
		super();
	}

	public Mensaje(String texto,  Publicacion publicacion, Consumidor consumidor, Consumidor consumidorReceptor) {
			super();
			this.texto=texto;
			this.consumidorEmisor = consumidor;		
			this.publicacion=publicacion;
			this.consumidorReceptor = consumidorReceptor;
		}

	// Getters y setters

	
	
		public Long getIdMensaje() {
			return idMensaje;
		}

		public void setIdMensaje(Long idMensaje) {
			this.idMensaje = idMensaje;
		}

		public String getTexto() {
			return texto;
		}

		public void setTexto(String texto) {
			this.texto = texto;
		}

				
		public Publicacion getPublicacion(){
			return publicacion;
		}
		
		public void setPublicacion(Publicacion publicacion){
			this.publicacion = publicacion;
		}



		public Consumidor getConsumidorEmisor() {
			return consumidorEmisor;
		}

		public void setConsumidorEmisor(Consumidor consumidorEmisor) {
			this.consumidorEmisor = consumidorEmisor;
		}

		public Consumidor getConsumidorReceptor() {
			return consumidorReceptor;
		}

		public void setConsumidorReceptor(Consumidor consumidorReceptor) {
			this.consumidorReceptor = consumidorReceptor;
		}
		
		
		
		
	}	