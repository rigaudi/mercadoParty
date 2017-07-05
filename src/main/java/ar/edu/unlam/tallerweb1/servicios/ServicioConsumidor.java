package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Consumidor;

public interface ServicioConsumidor {


	void guardarConsumidor(Consumidor consumidor);
	
	Consumidor consultarUsuarioPorMail (String email);

	List<Consumidor> ListaConsumidor(String palabraBuscada, String tipoServicio);

	Consumidor consultarConsumidorPorId(Long idConsumidor);

	void eliminarConsumidor(Consumidor miConsumidor);


}
