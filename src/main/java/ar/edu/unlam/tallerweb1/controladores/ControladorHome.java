package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Consumidor;
import ar.edu.unlam.tallerweb1.modelo.Oferente;

@Controller
public class ControladorHome {
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView irAHome() {
		ModelMap modelo = new ModelMap();
		Consumidor usuario = new Consumidor();
		Oferente oferente = new Oferente();
		modelo.put("usuario", usuario);
		modelo.put("oferente", oferente);
		return new ModelAndView("home",modelo);
	}
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView inicio() {
		return new ModelAndView("redirect:/home");
	}
	
	
	
}

//@RequestMapping(path = "/validar-login", method = RequestMethod.POST)
//public ModelAndView validarLogin(@ModelAttribute("usuario") Oferente usuario) {
//	ModelMap model = new ModelMap();
//
//	if (servicioLogin.consultarUsuario(usuario) != null) {
//		return new ModelAndView("redirect:/home");
//	} else {
//		model.put("error", "Usuario o clave incorrecta");
//	}
//	return new ModelAndView("home", model);
//}