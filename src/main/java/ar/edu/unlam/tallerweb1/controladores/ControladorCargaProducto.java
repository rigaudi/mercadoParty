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
	

	@RequestMapping(path ="/agregarPublicacion", method = RequestMethod.POST)
	public ModelAndView cargarPublicacion(@ModelAttribute("publicacion")Publicacion publicacion, HttpServletRequest request){
 		ModelMap modelo1 = new ModelMap();
 		modelo1.put("id", publicacion.getId());
 		modelo1.put("titulo", publicacion.getTitulo());
 		modelo1.put("descripcion", publicacion.getDescripcion());
 		modelo1.put("imagen1", publicacion.getImagen1());
 		String email = (String) request.getSession().getAttribute("session");
 		System.out.println(email);
 		Consumidor miConsumidor = servicioconsumidor.consultarUsuarioPorMail(email);
 		System.out.println("el id de usuario es"+ miConsumidor.getId());
		modelo1.put("idConsumidor",miConsumidor.getId());
  		serviciopublicacion.guardarPublicacion(publicacion);
 		return new ModelAndView("detalleProducto",modelo1);
		}
	
//	@RequestMapping(path = "/agregarPubli", method = RequestMethod.GET)
//	public ModelAndView iraPubli(HttpServletRequest request) {
//		
//		if(request.getSession().getAttribute("session") != null){
//			
//			ModelMap modelo = new ModelMap();
//			Consumidor usuario = new Consumidor();
//			modelo.put("usuario", usuario);
//			return new ModelAndView("cargaProducto",modelo);
//		}
//		ModelMap modelo = new ModelMap();
//		Consumidor usuario = new Consumidor();
//		modelo.put("usuario", usuario);
//		return new ModelAndView("home",modelo);
//	}
}

