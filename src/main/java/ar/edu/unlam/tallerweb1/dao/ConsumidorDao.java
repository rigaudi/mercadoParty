package ar.edu.unlam.tallerweb1.dao;

import ar.edu.unlam.tallerweb1.modelo.Consumidor;

public interface ConsumidorDao {


	void guardarConsumidor(Consumidor consumidor);
	
	Consumidor consultarUsuarioPorMail (String email);

}
