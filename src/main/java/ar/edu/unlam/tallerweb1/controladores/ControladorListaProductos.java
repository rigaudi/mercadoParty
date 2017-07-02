package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Consumidor;
import ar.edu.unlam.tallerweb1.modelo.Publicacion;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsumidor;
import ar.edu.unlam.tallerweb1.servicios.ServicioPublicacion;

@Controller
public class ControladorListaProductos {
	
	@Inject
	private ServicioConsumidor servicioConsumidor;
	private ServicioPublicacion servicioPublicacion;
	

	@RequestMapping(path = "/listaProductos", method = RequestMethod.GET)
	public ModelAndView iraListaProductos(HttpServletRequest request) {
		
		if(request.getSession().getAttribute("session") != null){
			ModelMap modelo = new ModelMap();
			Consumidor usuario = new Consumidor();
			modelo.put("usuario", usuario);
	 		String email = (String) request.getSession().getAttribute("session");
			Consumidor usuario1 = servicioConsumidor.consultarUsuarioPorMail(email);
			Long idConsumidor = usuario1.getId();
			System.out.println("el id de usuario es"+ idConsumidor);
	 		String descripcion = usuario1.getDireccion();
			String titulo = usuario1.getZona();	
			modelo.put("usuario", usuario1);
			modelo.put("titulo",titulo);
			modelo.put("descripcion",descripcion);
	 		
			
			return new ModelAndView("listaProductos",modelo);
		}
			ModelMap modelo = new ModelMap();
			Consumidor usuario = new Consumidor();
			modelo.put("usuario", usuario);
			return new ModelAndView("home",modelo);


		
		
		}
		
	}