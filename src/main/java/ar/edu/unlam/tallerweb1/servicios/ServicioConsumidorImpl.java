package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.ConsumidorDao;
import ar.edu.unlam.tallerweb1.modelo.Consumidor;

@Service ("servicioConsumidor")
@Transactional
public class ServicioConsumidorImpl implements ServicioConsumidor{

	@Inject
	private ConsumidorDao servicioConsumidorDao;

	@Override
	public void guardarConsumidor(Consumidor consumidor) {
		
		servicioConsumidorDao.guardarConsumidor(consumidor);
		
	}

	@Override
	public Consumidor consultarUsuarioPorMail(String email) {
		
		return servicioConsumidorDao.consultarUsuarioPorMail(email);
	}
	
	



	
}