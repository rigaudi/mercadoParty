package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Consumidor;
import ar.edu.unlam.tallerweb1.modelo.Oferente;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

@Controller
public class ControladorLogin {

	@Inject
	private ServicioLogin servicioLogin;
	
	@RequestMapping("/login")
	public ModelAndView irALogin() {

		ModelMap modelo = new ModelMap();
		Oferente usuario2 = new Oferente();
		modelo.put("usuario", usuario2);
		return new ModelAndView("login", modelo);
	}
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView irAHome() {
		ModelMap modelo = new ModelMap();
		Oferente usuario = new Oferente();
		modelo.put("usuario", usuario);
		return new ModelAndView("home",modelo);
	}
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView inicio() {
		return new ModelAndView("redirect:/home");
	}
	
	@RequestMapping(path = "/registro", method = RequestMethod.GET)
	public ModelAndView iraRegistro() {
		ModelMap modelo = new ModelMap();
		Oferente usuario = new Oferente();
		modelo.put("usuario", usuario);
		return new ModelAndView("registro",modelo);
	}
	
	@RequestMapping(path = "/olvidopass", method = RequestMethod.GET)
	public ModelAndView iraOlvidopass() {
		ModelMap modelo = new ModelMap();
		Oferente usuario = new Oferente();
		modelo.put("usuario", usuario);
		return new ModelAndView("olvidopass",modelo);
	}
	
	@RequestMapping(path="/validar-login", method = RequestMethod.POST)	
	public ModelAndView addContact(@ModelAttribute("usuario") Consumidor persona ) {
		ModelMap model = new ModelMap();
		System.out.println(persona.getEmail());
		System.out.println(persona.getPassword());
		model.put("persona", persona);
		return new ModelAndView("home");
	}
	
	@RequestMapping(path = "/detalleProducto", method = RequestMethod.GET)
	public ModelAndView iraDetalleProducto() {
		ModelMap modelo = new ModelMap();
		Oferente usuario = new Oferente();
		modelo.put("usuario", usuario);
		return new ModelAndView("detalleProducto",modelo);
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