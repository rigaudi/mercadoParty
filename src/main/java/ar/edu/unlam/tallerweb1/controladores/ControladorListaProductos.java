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
import ar.edu.unlam.tallerweb1.modelo.Publicacion;
import ar.edu.unlam.tallerweb1.servicios.ServicioPublicacion;

@Controller
public class ControladorListaProductos {
	
	@Inject

	private ServicioPublicacion servicioPublicacion;
	

	@RequestMapping (path="listaProductos", method = RequestMethod.POST)
	public ModelAndView listarProducto(@ModelAttribute("publicacion")Publicacion publicacion, @ModelAttribute("usuario") Consumidor usuario,@ModelAttribute("palabraBuscada") String palabraBuscada, @ModelAttribute("tipoServicio") String tipoServicio, HttpServletRequest request){
		System.out.println("la zona buscada es "+ tipoServicio);
		List<Publicacion> listaProducto= servicioPublicacion.ListaProducto(palabraBuscada, tipoServicio);
		ModelMap modelo = new ModelMap();
		modelo.put("publicacion", listaProducto);
		return new ModelAndView ("listaProductos", modelo);
		}
		
	}