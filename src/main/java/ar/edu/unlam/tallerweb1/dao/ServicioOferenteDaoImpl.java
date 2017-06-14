
package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import ar.edu.unlam.tallerweb1.modelo.Oferente;


@Service ("servicioOferenteDao")

public class ServicioOferenteDaoImpl implements ServicioOferenteDao {

	@Inject
	private SessionFactory session;


	@Override
	public void guardarOferente(Oferente oferente) {
		session.getCurrentSession().save(oferente);
		
	}

}
