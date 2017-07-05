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

@Controller
public class ControladorDetalleProducto {
	@Inject
	private ServicioConsumidor servicioconsumidor;
  	

 	@RequestMapping(path = "/detalleProducto", method = RequestMethod.POST)
 
 	
 	public ModelAndView addPublicacion (@ModelAttribute("publicacion")Publicacion publicacion,@ModelAttribute("usuario") Consumidor usuario, HttpServletRequest request){
 	
 		if(request.getSession().getAttribute("session") != null){
 		ModelMap modelo1 = new ModelMap();
 		modelo1.put("id", publicacion.getId());
 		modelo1.put("titulo", publicacion.getTitulo());
 		modelo1.put("descripcion", publicacion.getDescripcion());
 		modelo1.put("imagen1", publicacion.getImagen1());
 		modelo1.put("imagen2", publicacion.getImagen2());
 		modelo1.put("imagen3", publicacion.getImagen3());
 		modelo1.put("tipoServicio", publicacion.getTipoServicio());
 		String email = (String) request.getSession().getAttribute("session");
 		Consumidor miConsumidor = servicioconsumidor.consultarUsuarioPorMail(email);
 		publicacion.setConsumidor(miConsumidor);
 		modelo1.put("email", miConsumidor.getEmail());
 		modelo1.put("direccion", miConsumidor.getDireccion());
 		modelo1.put("telefono", miConsumidor.getTelefono());
  		request.getSession().setAttribute("publicacionId", publicacion.getId());
 		return new ModelAndView ("detalleProducto", modelo1);
 	}
 		ModelMap modelo = new ModelMap();
		Consumidor usuario1 = new Consumidor();
		modelo.put("usuario", usuario1);
		return new ModelAndView("registroNuevo");
	
 }
 	
}