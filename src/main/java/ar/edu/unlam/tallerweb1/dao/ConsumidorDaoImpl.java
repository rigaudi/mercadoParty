
package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Consumidor;


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
		System.out.println("el mail en dao es"+ email);
		return (Consumidor) sesion.createCriteria(Consumidor.class)
				.add(Restrictions.eq("email", email))
				.uniqueResult();
	}

}
