package mvc;

/*import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
*/
//@Controller
//@RequestMapping("/usuario")
public class UsuarioControlador {
	
	/*// CREAMOS UN METODO QUE NOS ELIMINE LOS ESPACIOS EN BLANCO
	@InitBinder
	public void miBinder(WebDataBinder birder) {
		StringTrimmerEditor recortarEspaciosBlanco = new StringTrimmerEditor(true);
		birder.registerCustomEditor(String.class, recortarEspaciosBlanco);
	}
	
	//Se crea un enlace al formulario
	@RequestMapping("/mostrar")
	public String muestraFormulario(Model modelo) {
		Usuario elUsuario = new Usuario();
		modelo.addAttribute("elUsuario",elUsuario);
		return "formulario"; // JSP
	}
	
	//Se comunica con el formulario
	@RequestMapping("/conectarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("elUsuario")Usuario elUsuario,
			BindingResult resultadoValidacion){
		if(resultadoValidacion.hasErrors()) {
			return "formulario";
		}else {
		return "mostrarInformacion";
	}
	}
	*/
}
