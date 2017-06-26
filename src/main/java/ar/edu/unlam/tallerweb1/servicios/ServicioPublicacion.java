package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Publicacion;

public interface ServicioPublicacion {


	void guardarPublicacion(Publicacion publicacion);

	Publicacion consultarPublicacion(Publicacion publicacion);
	
	

}
