package ar.edu.unlam.tallerweb1.controladores;



import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Consumidor;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsumidor;



@Controller
public class ControladorAgregarConsumidor {
	
	@Inject
	private ServicioConsumidor servicioconsumidor;
	
	@RequestMapping(path ="/agregarConsumidor", method = RequestMethod.POST)
	public ModelAndView cargarUsuario(@ModelAttribute("usuario")Consumidor usuario) {
		servicioconsumidor.guardarConsumidor(usuario);
		return new ModelAndView("cargaProducto");
		}
}

