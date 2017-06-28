package ar.edu.unlam.tallerweb1.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "consumidor")
public class Consumidor {
	
	
	//Atributos con los mails
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre", length = 50)
	private String nombre;	
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "telefono", length = 50)
	private Long telefono;
	
	@Column(name = "direccion", length = 20)
	private String direccion;
	
	@Column(name = "zona", length = 20)
	private String zona;
	
	@Column(name = "password", length = 20)
	private String password;

	@OneToMany(mappedBy="consumidor" )
	private List<Publicacion> listaPublicacion;
	   
	// constuctores 
	


	public Consumidor() {
		super();
		 listaPublicacion = new ArrayList<Publicacion>();
	}
	
	public List<Publicacion> getListaFacturas() {
        return listaPublicacion;
    }
 
    public void addFactura(Publicacion f) {
 
        listaPublicacion.add(f);
    }
 
    public void setListaFacturas(List<Publicacion> listaPublicacion) {
        this.listaPublicacion = listaPublicacion;
    }

	public Consumidor(String nombreConsumidor, String emailConsumidor, Long telefonoConsumidor, String direccionConsumidor, String zonaConsumidor, String passwordConsumidor) {
		super();
		this.nombre = nombreConsumidor;
		this.email = emailConsumidor;
		this.telefono = telefonoConsumidor;
		this.direccion = direccionConsumidor;
		this.zona = zonaConsumidor;
		this.password = passwordConsumidor;
	}
	

	
	// Getters y setters
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}