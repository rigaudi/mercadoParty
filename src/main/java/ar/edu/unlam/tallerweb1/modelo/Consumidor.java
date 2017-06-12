package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "consumidor")
public class Consumidor {
	
	
	//Atributos con los mails
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "password", length = 20)
	private String password;
	
	
	// constuctores 
	


	public Consumidor() {
	}

	public Consumidor(String emailConsumidor, String passwordConsumidor) {
		this.email = emailConsumidor;
		this.password = passwordConsumidor;
	}
	

	
	// Getters y setters
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}


//Probando para commitiar todo arreglado