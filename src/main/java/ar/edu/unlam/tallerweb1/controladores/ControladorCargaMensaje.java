package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Consumidor;
import ar.edu.unlam.tallerweb1.modelo.Mensaje;
import ar.edu.unlam.tallerweb1.modelo.Publicacion;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsumidor;
import ar.edu.unlam.tallerweb1.servicios.ServicioMensaje;
import ar.edu.unlam.tallerweb1.servicios.ServicioPublicacion;

@Controller
public class ControladorCargaMensaje {
	
	@Inject
	private ServicioMensaje serviciomensaje;
	
	@Inject
	private ServicioPublicacion servicioPublicacion;
	@Inject
	private ServicioConsumidor servicioConsumidor;
	


	@RequestMapping(path ="/cargarMensaje", method = RequestMethod.POST)
	public ModelAndView cargarMensaje(@ModelAttribute("mensaje")Mensaje mensaje,@ModelAttribute("publicacion")Publicacion publicacion, @ModelAttribute("usuario")Consumidor usuario, HttpServletRequest request){
		//ModelMap modelo1 = new ModelMap();
 		//Publicacion publicacion = new Publicacion();
		//modelo1.put("idMensaje", mensaje.getIdMensaje());
 		//modelo1.put("texto", mensaje.getTexto());
 

 		Long idPublicacion = (Long) request.getSession().getAttribute("publicacionId");
 		Long idConsumidorReceptor = (Long) request.getSession().getAttribute("logueadoId");
 		System.out.println("controler mensaje el ID DEL CONSUMIDOR RECEPTOR ES"+ idConsumidorReceptor);
 		System.out.println("El id de la publicacion es "  + idPublicacion);
		Publicacion miPublicacion = servicioPublicacion.consultarPublicacionPorId(idPublicacion);
		Consumidor consumidorPublicacion = miPublicacion.getConsumidor();
		mensaje.setConsumidorReceptor(consumidorPublicacion);
		mensaje.setPublicacion(miPublicacion);
		String email = (String) request.getSession().getAttribute("session");
 		Consumidor miConsumidor = servicioConsumidor.consultarUsuarioPorMail(email);
 		mensaje.setConsumidorEmisor(miConsumidor);
 		System.out.println("el ID DEL CONSUMIDOR RECEPTOR ES"+ miPublicacion.getId());
 		System.out.println("el ID DEL CONSUMIDOR RECEPTOR ES"+ miConsumidor.getId());
		

		serviciomensaje.guardarMensaje(mensaje);
		

		
 		return new ModelAndView("detalleProducto");
		}
	

}