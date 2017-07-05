
package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Consumidor;
import ar.edu.unlam.tallerweb1.modelo.Publicacion;


@Service ("servicioConsumidorDao")
@Transactional

public class ConsumidorDaoImpl implements ConsumidorDao {

	@Inject
	private SessionFactory session;


	@Override
	public void guardarConsumidor(Consumidor consumidor) {
		session.getCurrentSession().save(consumidor);
		
	}


	@Override
	public Consumidor consultarUsuarioPorMail (String email) {
		final Session sesion = session.getCurrentSession();
//		System.out.println("el mail en dao es"+ email);
		return (Consumidor) sesion.createCriteria(Consumidor.class)
				.add(Restrictions.eq("email", email))
				.uniqueResult();
	}


	@Override
	public List<Consumidor> ListaConsumidor(String palabraBuscada, String tipoServicio) {
		final Session sesion = session.getCurrentSession();
		return (List<Consumidor>) sesion.createCriteria(Consumidor.class).list();
}

	@Override
	public void eliminarConsumidor(Consumidor miConsumidor) {
		final Session sesion = session.getCurrentSession();
		System.out.println("id consumidor es " + miConsumidor.getId());
		Consumidor delConsumidor = (Consumidor) sesion.createCriteria(Consumidor.class)
		             .add(Restrictions.eq("id", miConsumidor.getId())).uniqueResult();
		sesion.delete(delConsumidor);

			
	}
}
