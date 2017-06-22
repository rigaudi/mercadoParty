
package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Publicacion;


@Service ("PublicacionDao")

public class PublicacionDaoImpl implements PublicacionDao {

	@Inject
	private SessionFactory session;


	@Override
	public void guardarPublicacion(Publicacion publicacion) {
		session.getCurrentSession().save(publicacion);
		
	}

}
