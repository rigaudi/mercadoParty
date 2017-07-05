package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
public class ControladorPanelUsuario {
	
	@Inject
	private ServicioMensaje servicioMensaje;
	
	@Inject
	private ServicioPublicacion servicioPublicacion;
	@Inject
	private ServicioConsumidor servicioConsumidor;
	
	
	@RequestMapping(path = "/panelUsuario", method = RequestMethod.GET)
	public ModelAndView irALogin( HttpServletRequest request) {

		if(request.getSession().getAttribute("session") != null){
			ModelMap modelo = new ModelMap();
			Consumidor usuario = new Consumidor();
			modelo.put("usuario", usuario);
			return new ModelAndView("panelUsuario", modelo);
		}
		ModelMap modelo = new ModelMap();
		Consumidor usuario = new Consumidor();
		modelo.put("usuario", usuario);
		return new ModelAndView("home", modelo);
	}
	
	@RequestMapping("/verDetalle")
	public ModelAndView verDetallePublicacion(@ModelAttribute("publicacion")Publicacion publicacion) {
		ModelMap modelo = new ModelMap();
		Consumidor usuario = new Consumidor();
		modelo.put("usuario", usuario);
		ModelMap modelo1 = new ModelMap();
//		System.out.println("id" + publicacion.getId());
 		modelo1.put("id", publicacion.getId());
 		modelo1.put("titulo", publicacion.getTitulo());
 		modelo1.put("descripcion", publicacion.getDescripcion());
 		modelo1.put("imagen1", publicacion.getImagen1());
 		modelo1.put("imagen2", publicacion.getImagen2());
 		modelo1.put("imagen3", publicacion.getImagen3());
 		modelo1.put("tipoServicio", publicacion.getTipoServicio());
		return new ModelAndView("detalleProducto",modelo1);
	}

	

	@RequestMapping ("/listarMensajes")
	public ModelAndView listarMensajes(@ModelAttribute("mensaje")Mensaje mensaje,@ModelAttribute("usuario") Consumidor usuario, HttpServletRequest request){
		
		ModelMap modelo = new ModelMap();
		String email = (String) request.getSession().getAttribute("session");
		System.out.println("El email de la session es " + email);
 		Consumidor miConsumidor = servicioConsumidor.consultarUsuarioPorMail(email);
 		mensaje.setConsumidorReceptor(miConsumidor);
 		System.out.println("el id de usuario es"+ miConsumidor.getId());
		List<Mensaje> listaMensajes= servicioMensaje.ListaMensajesConId(email);
		modelo.put("mensaje", listaMensajes);
		return new ModelAndView ("listaMensajes", modelo);
	}
		
//		List<Mensaje> listaMensajes= servicioMensaje.ListaMEnsajes();
//		ModelMap modelo = new ModelMap();
//		modelo.put("mensaje", listaMensajes);
//		return new ModelAndView ("listaMensajes", modelo);
//	}

}