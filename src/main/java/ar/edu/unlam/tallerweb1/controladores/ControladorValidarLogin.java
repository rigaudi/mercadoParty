package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Consumidor;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsumidor;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

@Controller
public class ControladorValidarLogin {

	@Inject
	private ServicioLogin servicioLogin;
	@Inject
	private ServicioConsumidor servicioConsumidor;

@RequestMapping(path = "/validar-login", method = RequestMethod.POST)
public ModelAndView validarLogin(@ModelAttribute("usuario")Consumidor usuario,  HttpServletRequest request) {
	ModelMap model = new ModelMap();

	if (servicioLogin.consultarUsuario(usuario) != null) {
		request.getSession().setAttribute("session", usuario.getEmail());
		String email = (String) request.getSession().getAttribute("session");
 		Consumidor miConsumidor = servicioConsumidor.consultarUsuarioPorMail(email);
		request.getSession().setAttribute("logueadoId", miConsumidor.getId());
		request.getSession().setAttribute("publicacionId", miConsumidor.getId());
		

		
		return new ModelAndView("redirect:/panelUsuario");
	} else {
		model.put("error", "Usuario o clave incorrecta");
		System.out.println("Usuario o clave incorrecta\n");
	}
	return new ModelAndView("home", model);
}

@RequestMapping(path = "/logout")
public ModelAndView logout(HttpServletRequest request) {
		request.getSession().invalidate();
	return new ModelAndView("redirect:/");
}


}