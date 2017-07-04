package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Publicacion;

public interface PublicacionDao {


	void guardarPublicacion(Publicacion publicacion);

	Publicacion consultarPublicacion(Publicacion publicacion);


	Publicacion consultarPublicacionPorId(Long id);

	List<Publicacion> ListaPublicacion(String email);
	
	List<Publicacion> ListaProductos();

}
