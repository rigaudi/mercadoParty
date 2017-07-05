package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.PublicacionDao;
import ar.edu.unlam.tallerweb1.modelo.Publicacion;

@Service ("servicioPublicacion")
@Transactional
public class ServicioPublicacionImpl implements ServicioPublicacion{

	@Inject
	private PublicacionDao servicioPublicacionDao;

	@Override
	public void guardarPublicacion(Publicacion publicacion) {
		
		servicioPublicacionDao.guardarPublicacion(publicacion);
		
	}

	@Override
	public Publicacion consultarPublicacion(Publicacion publicacion) {
		return servicioPublicacionDao.consultarPublicacion (publicacion);
	}

	@Override
	public Publicacion consultarPublicacionPorId(Long id) {
		// TODO Auto-generated method stub
		return servicioPublicacionDao.consultarPublicacionPorId(id);
	}
	
	@Override
	public List<Publicacion> ListaPublicacion(String email) {
		// TODO Auto-generated method stub
		return servicioPublicacionDao.ListaPublicacion(email);
	}

	@Override
	public List<Publicacion> ListaProducto(String palabraBuscada) {
		// TODO Auto-generated method stub
		return servicioPublicacionDao.ListaProductos(palabraBuscada);
	}

	@Override
	public void eliminarPublicacion(Publicacion miPublicacion) {
		// TODO Auto-generated method stub
		 servicioPublicacionDao.eliminarPublicacion(miPublicacion);

	}



	
}