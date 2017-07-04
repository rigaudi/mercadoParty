package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Publicacion;

public interface ServicioPublicacion {

	void guardarPublicacion(Publicacion publicacion);
	Publicacion consultarPublicacion(Publicacion publicacion);
	Publicacion consultarPublicacionPorId (Long id);
	List<Publicacion> ListaPublicacion(String email);

}