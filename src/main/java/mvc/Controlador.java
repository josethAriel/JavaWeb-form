package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

	// METODO ENCARGADO DE MAPEAR CUAL ES EL ARCHIVO JASP O VISTA QUE DESEO VER
		@RequestMapping
		public String muestraPagina() {
			return "paginaPrincipal";// JSP
		}
	
}
