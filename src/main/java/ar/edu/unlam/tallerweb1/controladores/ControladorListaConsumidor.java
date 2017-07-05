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
import ar.edu.unlam.tallerweb1.servicios.ServicioConsumidor;
import ar.edu.unlam.tallerweb1.servicios.ServicioPublicacion;

@Controller
public class ControladorListaConsumidor {
	
	@Inject

	private ServicioConsumidor servicioConsumidor;
	

	@RequestMapping (path="listaConsumidores", method = RequestMethod.GET)
	public ModelAndView listarConsumidor(@ModelAttribute("publicacion")Publicacion publicacion, @ModelAttribute("usuario") Consumidor usuario,@ModelAttribute("palabraBuscada") String palabraBuscada, @ModelAttribute("tipoServicio") String tipoServicio, HttpServletRequest request){
		
		if(request.getSession().getAttribute("session").equals("pepito@gmail.com")){

		List<Consumidor> listaConsumidor= servicioConsumidor.ListaConsumidor(palabraBuscada, tipoServicio);
		ModelMap modelo = new ModelMap();
		modelo.put("consumidor", listaConsumidor);
		return new ModelAndView ("listaConsumidores", modelo);
		}
		
		List<Consumidor> listaConsumidor= servicioConsumidor.ListaConsumidor(palabraBuscada, tipoServicio);
		ModelMap modelo = new ModelMap();
		modelo.put("consumidor", listaConsumidor);
		return new ModelAndView ("home", modelo);
	}
	
	@RequestMapping ("eliminaConsumidor")
	public ModelAndView eliminarConsumidor(@ModelAttribute("publicacion")Publicacion publicacion,@ModelAttribute("consumidor") Consumidor usuario, HttpServletRequest request){
		ModelMap modelo = new ModelMap();
		String email = usuario.getEmail();
		Consumidor miConsumidor = servicioConsumidor.consultarUsuarioPorMail(email);
		servicioConsumidor.eliminarConsumidor(miConsumidor);
	

		return new ModelAndView ("redirect:/listaConsumidores");
		
	}
	}