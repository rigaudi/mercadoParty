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
 		ModelMap modelo1 = new ModelMap();
 		modelo1.put("id", publicacion.getId());
 		modelo1.put("titulo", publicacion.getTitulo());
 		modelo1.put("descripcion", publicacion.getDescripcion());
 		modelo1.put("imagen1", publicacion.getImagen1());
 		modelo1.put("imagen2", publicacion.getImagen2());
 		modelo1.put("imagen3", publicacion.getImagen3());
 		System.out.println(publicacion.getImagen1());
 		String email = (String) request.getSession().getAttribute("session");
 		Consumidor miConsumidor = servicioconsumidor.consultarUsuarioPorMail(email);
 		publicacion.setConsumidor(miConsumidor);
 		System.out.println("el id de usuario es"+ miConsumidor.getId());
  		serviciopublicacion.guardarPublicacion(publicacion);
 		return new ModelAndView("detalleProducto",modelo1);
		}
	

}

