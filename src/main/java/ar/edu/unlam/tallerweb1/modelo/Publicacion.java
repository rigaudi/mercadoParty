package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "publicacion")
public class Publicacion {
	
	
	//Atributos con los mails
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "tipoServicio", length = 50)
	private String tipoServicio;
	
	@Column(name = "titulo", length = 50)
	private String titulo;

	@Column(name = "imagen1")
	private byte[] imagen1;

	@Column(name = "imagen2")
	private byte[] imagen2;

	@Column(name = "imagen3")
	private byte[] imagen3;
	
	@Column(name = "descripcion", length = 1000)
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "idPublicacion", nullable = true)
	private Consumidor consumidor;
	
	// constuctores 
	


	public Publicacion() {
	super();
	}

	public Publicacion(String tiposervicio, String titulo, byte[] imagen1,byte[] imagen2, byte[] imagen3, String descripcion, Consumidor consumidor) {
		super();
		this.tipoServicio=tiposervicio;
		this.titulo=titulo;
		this.imagen1 = imagen1;
		this.imagen2=imagen2;
		this.imagen3=imagen3;
		this.descripcion=descripcion;
		this.consumidor=consumidor;
	}

	
	// Getters y setters

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public byte[] getImagen1() {
		return imagen1;
	}

	public void setImagen1(byte[] imagen1) {
		this.imagen1 = imagen1;
	}


	public byte[] getImagen2() {
		return imagen2;
	}

	public void setImagen2(byte[] imagen2) {
		this.imagen2 = imagen2;
	}


	public byte[] getImagen3() {
		return imagen3;
	}

	public void setImagen3(byte[] imagen3) {
		this.imagen3 = imagen3;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descipcion) {
		this.descripcion = descipcion;
	}
	
	public Consumidor getConsumidor(){
		return consumidor;
	}
	
	public void setConsumidor(Consumidor consumidor){
		this.consumidor = consumidor;
	}
}	
	