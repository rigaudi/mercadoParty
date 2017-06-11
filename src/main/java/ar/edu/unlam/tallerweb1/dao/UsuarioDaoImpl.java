package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import ar.edu.unlam.tallerweb1.modelo.Consumidor;

@Service("usuarioDao")
public class UsuarioDaoImpl implements UsuarioDao {

	@Inject
    private SessionFactory sessionFactory;
	@Override
	public Consumidor consultarUsuario(Consumidor persona) {

		final Session session = sessionFactory.openSession();
		return (Consumidor) session.createCriteria(Consumidor.class)
				.add(Restrictions.eq("email", persona.getEmail()))
				.add(Restrictions.eq("password", persona.getPassword()))
				.uniqueResult();
	}

}
