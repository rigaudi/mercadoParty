
package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Consumidor;


@Service ("servicioConsumidorDao")

public class ServicioConsumidorDaoImpl implements ServicioConsumidorDao {

	@Inject
	private SessionFactory session;


	@Override
	public void guardarConsumidor(Consumidor consumidor) {
		session.getCurrentSession().save(consumidor);
		
	}

}
