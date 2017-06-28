package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Consumidor;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

@Controller
public class ControladorValidarLogin {

	@Inject
	private ServicioLogin servicioLogin;

@RequestMapping(path = "/validar-login", method = RequestMethod.POST)
public ModelAndView validarLogin(@ModelAttribute("usuario")Consumidor usuario) {
	ModelMap model = new ModelMap();

	if (servicioLogin.consultarUsuario(usuario) != null) {
		return new ModelAndView("redirect:/listaProductos");
	} else {
		model.put("error", "Usuario o clave incorrecta");
		System.out.println("Usuario o clave incorrecta\n");
	}
	return new ModelAndView("home", model);
}

}