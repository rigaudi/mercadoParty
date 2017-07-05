
package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Consumidor;
import ar.edu.unlam.tallerweb1.modelo.Publicacion;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsumidor;


@Service ("PublicacionDao")

public class PublicacionDaoImpl implements PublicacionDao {

	@Inject
	private SessionFactory sessionFactory;
	private SessionFactory session;
	@Inject
	private ServicioConsumidor servicioconsumidor;

	@Override
	public void guardarPublicacion(Publicacion publicacion) {
		sessionFactory.getCurrentSession().save(publicacion);
		
	}


	@Override
	public Publicacion consultarPublicacion(Publicacion publicacion) {
		final Session session = sessionFactory.openSession();
		return (Publicacion) session.createCriteria(Publicacion.class)
				
				.add(Restrictions.eq("titulo", publicacion.getTitulo()))
				.add(Restrictions.eq("descripcion", publicacion.getDescripcion()))
				.uniqueResult();
	}
	
	@Override
	public Publicacion consultarPublicacionPorId(Long id) {
		final Session sesion = sessionFactory.getCurrentSession();
		//System.out.println("el id en dao es"+ id);
		return (Publicacion) sesion.createCriteria(Publicacion.class)
				.add(Restrictions.eq("id", id))
				.uniqueResult();
	}

	
	@Override

	public List<Publicacion> ListaPublicacion(String email){
		final Session sesion = sessionFactory.getCurrentSession();
 		Consumidor miConsumidor = servicioconsumidor.consultarUsuarioPorMail(email);
		 return (List<Publicacion>) sesion.createCriteria(Publicacion.class).add(Restrictions.eq("consumidor.id",miConsumidor.getId())).list();
}

	@Override

	public List<Publicacion> ListaProductos(String palabraBuscada){
		final Session sesion = sessionFactory.getCurrentSession();
		return (List<Publicacion>) sesion.createCriteria(Publicacion.class).add(Restrictions.like("descripcion", "%"+palabraBuscada+"%")).list();
}


	@Override
	public void eliminarPublicacion(Publicacion miPublicacion) {
		final Session sesion = sessionFactory.getCurrentSession();
		System.out.println("id publicacion es" + miPublicacion.getId());
		Publicacion delPublicacion = (Publicacion) sesion.createCriteria(Publicacion.class)
		             .add(Restrictions.eq("id", miPublicacion.getId())).uniqueResult();
		sesion.delete(delPublicacion);

			
	}

}
