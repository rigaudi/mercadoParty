package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Mensaje;

public interface MensajeDao {


	void guardarMensaje(Mensaje mensaje);
	List<Mensaje> ListaMensajesConId(String email);
	List<Mensaje> ListaMEnsajes();

}
