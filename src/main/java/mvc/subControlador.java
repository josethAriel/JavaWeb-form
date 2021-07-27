package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/formulario")
public class subControlador {

	@RequestMapping("/mostrar")
	public String muestraFormulario() {
		return "formulario"; // JSP
	}
	
}
