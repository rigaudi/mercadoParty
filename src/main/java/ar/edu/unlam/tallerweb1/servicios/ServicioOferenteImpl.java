package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.ServicioOferenteDao;
import ar.edu.unlam.tallerweb1.modelo.Oferente;


@Transactional
public class ServicioOferenteImpl implements ServicioOferente{

	@Inject
	private ServicioOferenteDao servicioOferenteDao;



	@Override
	public void guardarOferente(Oferente oferente) {
		servicioOferenteDao.guardarOferente(oferente);
		
	}



	
}
