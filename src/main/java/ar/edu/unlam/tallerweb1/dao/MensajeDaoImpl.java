
package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Mensaje;


@Service ("MensajeDao")

public class MensajeDaoImpl implements MensajeDao {

	@Inject
	private SessionFactory session;


	@Override
	public void guardarMensaje(Mensaje mensaje) {
		session.getCurrentSession().save(mensaje);
		
	}

}
