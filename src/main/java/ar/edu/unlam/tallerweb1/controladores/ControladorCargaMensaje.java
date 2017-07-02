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

import ar.edu.unlam.tallerweb1.servicios.ServicioMensaje;
import ar.edu.unlam.tallerweb1.servicios.ServicioPublicacion;

@Controller
public class ControladorCargaMensaje {
	
	@Inject
	private ServicioMensaje serviciomensaje;
	
	@Inject
	private ServicioPublicacion servicioPublicacion;
	


	@RequestMapping(path ="/cargarMensaje", method = RequestMethod.POST)
	public ModelAndView cargarMensaje(@ModelAttribute("mensaje")Mensaje mensaje,@ModelAttribute("publicacion")Publicacion publicacion, @ModelAttribute("usuario")Consumidor usuario, HttpServletRequest request){
		//ModelMap modelo1 = new ModelMap();
 		//Publicacion publicacion = new Publicacion();
		//modelo1.put("idMensaje", mensaje.getIdMensaje());
 		//modelo1.put("texto", mensaje.getTexto());
 

 		Long id = (Long) request.getSession().getAttribute("session");
// 		Consumidor miConsumidor = servicioconsumidor.consultarUsuarioPorMail(email);
// 		publicacion.setConsumidor(miConsumidor);
// 		System.out.println("el id de usuario es"+ miConsumidor.getId());
 		System.out.println("EL ID DE LONG"+ id);
		Publicacion miPublicacion = servicioPublicacion.consultarPublicacionPorId(id);
		mensaje.setPublicacion(miPublicacion);

		System.out.println("la publicacion tiene este id"+ miPublicacion.getId());
		serviciomensaje.guardarMensaje(mensaje);
		

		
 		return new ModelAndView("detalleProducto");
		}
	

}

