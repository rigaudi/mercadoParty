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
import ar.edu.unlam.tallerweb1.servicios.ServicioPublicacion;

@Controller
public class ControladorListaProductos {
	
	@Inject
	private ServicioPublicacion servicioPublicacion;
	

	@RequestMapping(path = "/listaProductos", method = RequestMethod.GET)
	public ModelAndView iraListaProductos(HttpServletRequest request) {
		
		if(request.getSession().getAttribute("session") != null){
			ModelMap modelo = new ModelMap();
			Consumidor usuario = new Consumidor();
			modelo.put("usuario", usuario);
			
			Publicacion publicacion = new Publicacion();
			publicacion.setDescripcion("asdadsadad");
			publicacion.setTitulo("eeeeeeeeerere");
			String descripcion = publicacion.getDescripcion();
			String titulo = publicacion.getTitulo();
			
			servicioPublicacion.guardarPublicacion(publicacion);
			
			modelo.put("titulo",titulo);
			modelo.put("descripcion",descripcion);
			System.out.println(publicacion.getDescripcion());
			System.out.println(publicacion.getTitulo());
//			Publicacion publicacionImportada = servicioPublicacion.consultarPublicacion (publicacion);
//			modelo.put("titulo",publicacionImportada.getTitulo());
//			System.out.println(publicacionImportada.getDescripcion());
			
			return new ModelAndView("listaProductos",modelo);
		}
			ModelMap modelo = new ModelMap();
			Consumidor usuario = new Consumidor();
			modelo.put("usuario", usuario);
			return new ModelAndView("home",modelo);


		
		
		}
		
	}