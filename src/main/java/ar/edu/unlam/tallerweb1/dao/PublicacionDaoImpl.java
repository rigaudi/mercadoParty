
package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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


	@Override
	public Publicacion consultarPublicacion(Publicacion publicacion) {
		final Session session = this.session.getCurrentSession();
		
		return (Publicacion) session.createCriteria(Publicacion.class)
				.add(Restrictions.eq("id",16)).uniqueResult();
	}




}
