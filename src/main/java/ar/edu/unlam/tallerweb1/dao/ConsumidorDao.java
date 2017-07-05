package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Consumidor;

public interface ConsumidorDao {


	void guardarConsumidor(Consumidor consumidor);
	
	Consumidor consultarUsuarioPorMail (String email);

	List<Consumidor> ListaConsumidor(String palabraBuscada, String tipoServicio);

	void eliminarConsumidor(Consumidor miConsumidor);

}
