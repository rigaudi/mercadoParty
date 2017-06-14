package ar.edu.unlam.tallerweb1.controladores;



import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Oferente;
import ar.edu.unlam.tallerweb1.servicios.ServicioOferente;



@Controller
public class ControladorAgregarOferente {
	
//	@Inject
//	private ServicioOferente serviciooferente;
	
	@RequestMapping(path ="/agregarOferente", method = RequestMethod.POST)
	public ModelAndView cargarUsuario(@ModelAttribute("oferente")Oferente usuario) {
//		serviciooferente.guardarOferente(usuario);
		return new ModelAndView("home");
		}
	
}

