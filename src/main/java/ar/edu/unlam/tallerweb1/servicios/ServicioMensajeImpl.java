package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.MensajeDao;
import ar.edu.unlam.tallerweb1.modelo.Mensaje;

@Service ("servicioMensaje")
@Transactional
public class ServicioMensajeImpl implements ServicioMensaje{

	@Inject
	private MensajeDao mensajeDao;

	@Override
	public void guardarMensaje(Mensaje mensaje) {
		
		mensajeDao.guardarMensaje(mensaje);
	}



	
}
