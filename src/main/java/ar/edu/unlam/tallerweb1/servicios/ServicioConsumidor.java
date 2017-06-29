package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Consumidor;

public interface ServicioConsumidor {


	void guardarConsumidor(Consumidor consumidor);
	
	Consumidor consultarUsuarioPorMail (String email);


}
