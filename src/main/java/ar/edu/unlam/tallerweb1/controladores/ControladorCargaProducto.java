package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Consumidor;
import ar.edu.unlam.tallerweb1.modelo.Publicacion;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsumidor;
import ar.edu.unlam.tallerweb1.servicios.ServicioPublicacion;

@Controller
public class ControladorCargaProducto {
	
	@Inject
	private ServicioPublicacion serviciopublicacion;
	@Inject
	private ServicioConsumidor servicioconsumidor;
	

	@RequestMapping(path ="/cargarProducto", method = RequestMethod.POST)
	public ModelAndView cargarPublicacion(@ModelAttribute("publicacion")Publicacion publicacion,@ModelAttribute("usuario") Consumidor usuario, HttpServletRequest request){
 	
 		String email = (String) request.getSession().getAttribute("session");
 		Consumidor miConsumidor = servicioconsumidor.consultarUsuarioPorMail(email);
 		publicacion.setConsumidor(miConsumidor);
 		System.out.println("el id de usuario es"+ miConsumidor.getId());
 	
  		serviciopublicacion.guardarPublicacion(publicacion);
  		request.getSession().setAttribute("session", publicacion.getId());
  		System.out.println("el id de PUBLICACION es"+ publicacion.getId());
 		return new ModelAndView("detalleProducto");
		}
	

}

