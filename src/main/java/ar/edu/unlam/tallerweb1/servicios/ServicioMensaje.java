package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Mensaje;


public interface ServicioMensaje {

	void guardarMensaje(Mensaje mensaje);
	List<Mensaje> ListaMensajesConId(String email);
	List<Mensaje> ListaMEnsajes();

}
