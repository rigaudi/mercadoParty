
package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Consumidor;
import ar.edu.unlam.tallerweb1.modelo.Mensaje;
import ar.edu.unlam.tallerweb1.modelo.Publicacion;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsumidor;


@Service ("MensajeDao")

public class MensajeDaoImpl implements MensajeDao {

	@Inject
	private SessionFactory sessionFactory;
	@Inject
	private SessionFactory session;
	@Inject
	private ServicioConsumidor servicioconsumidor;


	@Override
	public void guardarMensaje(Mensaje mensaje) {
		session.getCurrentSession().save(mensaje);
		
	}


	@Override
	public List<Mensaje> ListaMensajesConId(String email) {
		final Session sesion = sessionFactory.getCurrentSession();
 		Consumidor miConsumidor = servicioconsumidor.consultarUsuarioPorMail(email);
// 		System.out.println("email en lista es "+ email);
		 return (List<Mensaje>) sesion.createCriteria(Mensaje.class).add(Restrictions.eq("consumidorReceptor.id",miConsumidor.getId())).list();
}


	@Override
	public List<Mensaje> ListaMEnsajes() {
		final Session sesion = sessionFactory.getCurrentSession();
		return (List<Mensaje>) sesion.createCriteria(Mensaje.class).setFetchMode("Consumidor", FetchMode.JOIN).addOrder(Order.desc("id")).list();
}

}
