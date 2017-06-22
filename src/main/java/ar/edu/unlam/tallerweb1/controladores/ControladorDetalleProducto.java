package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Consumidor;

@Controller
public class ControladorDetalleProducto {
	
	@RequestMapping(path = "/detalleProducto", method = RequestMethod.GET)
	public ModelAndView iraDetalleProducto() {
		ModelMap modelo = new ModelMap();
		Consumidor usuario = new Consumidor();
		modelo.put("usuario", usuario);
		return new ModelAndView("detalleProducto",modelo);
	}
	
	
}