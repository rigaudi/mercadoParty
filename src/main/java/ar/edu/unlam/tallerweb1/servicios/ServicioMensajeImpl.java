package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.MensajeDao;
import ar.edu.unlam.tallerweb1.dao.PublicacionDao;
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

	@Override
	public List<Mensaje> ListaMensajesConId(String email) {
		// TODO Auto-generated method stub
			return mensajeDao.ListaMensajesConId(email);
	}

	@Override
	public List<Mensaje> ListaMEnsajes() {
		// TODO Auto-generated method stub
			return mensajeDao.ListaMEnsajes();
	}



	
}
