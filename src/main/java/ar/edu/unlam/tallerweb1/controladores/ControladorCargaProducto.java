package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Consumidor;

@Controller
public class ControladorCargaProducto {
	
	@RequestMapping(path = "/cargarProducto", method = RequestMethod.GET)
	public ModelAndView irACargar() {
		ModelMap modelo = new ModelMap();
		Consumidor usuario = new Consumidor();
		modelo.put("usuario", usuario);
		return new ModelAndView("cargaProducto",modelo);
	
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