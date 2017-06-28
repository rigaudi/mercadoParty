package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.unlam.tallerweb1.modelo.Publicacion;

@Service ("servicioPublicacion")
@Transactional
public class ServicioPublicacionImpl implements ServicioPublicacion{
	
	@Inject
	private SessionFactory session;

	@Override
	public void guardarPublicacion(Publicacion publicacion) {
		// TODO Auto-generated method stub

		session.getCurrentSession().save(publicacion);
	}
	
	@Override
	public Publicacion consultarPublicacion(Publicacion publicacion) {
		// TODO Auto-generated method stub
		
		final Session session = this.session.getCurrentSession();
		
		return (Publicacion) session.createCriteria(Publicacion.class)
				.add(Restrictions.eq("id",1L)).uniqueResult();
		
	}

}
