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
import ar.edu.unlam.tallerweb1.servicios.ServicioPublicacion;

@Controller
public class ControladorCargaProducto {
	
	@Inject
	private ServicioPublicacion serviciopublicacion;
	
	@RequestMapping(path ="/agregarPublicacion", method = RequestMethod.POST)
	public ModelAndView cargarPublicacion(@ModelAttribute("publicacion")Publicacion publicacion, HttpServletRequest request){
 		ModelMap modelo = new ModelMap();
 		ModelMap modelo1 = new ModelMap();
  		Consumidor usuario = new Consumidor();
  		modelo.put("usuario", usuario);
  		modelo.put("direccion", usuario.getDireccion());
 		modelo1.put("id", publicacion.getId());
 		modelo1.put("titulo", publicacion.getTitulo());
 		modelo1.put("descripcion", publicacion.getDescripcion());
 		modelo1.put("imagen1", publicacion.getImagen1());
  		serviciopublicacion.guardarPublicacion(publicacion);
 		request.getSession().setAttribute("session", usuario);
 		return new ModelAndView("detalleProducto",modelo1);
		}
	
	@RequestMapping(path = "/agregarPubli", method = RequestMethod.GET)
	public ModelAndView iraPubli(HttpServletRequest request) {
		
		if(request.getSession().getAttribute("session") != null){
			ModelMap modelo = new ModelMap();
			Consumidor usuario = new Consumidor();
			modelo.put("usuario", usuario);
			return new ModelAndView("cargaProducto",modelo);
		}
		ModelMap modelo = new ModelMap();
		Consumidor usuario = new Consumidor();
		modelo.put("usuario", usuario);
		return new ModelAndView("home",modelo);
	}
}

