package ar.edu.unlam.tallerweb1.servicios;

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



	
}
