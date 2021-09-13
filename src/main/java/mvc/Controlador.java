package mvc;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.dao.UsuarioDAO;
import mvc.entity.Usuario;

@Controller
@RequestMapping("/cliente") //URL QUE NOS PERMITE INGRESAR A MI ARCHIVO JSP
public class Controlador {
	
	// CREAMOS UN METODO QUE NOS ELIMINE LOS ESPACIOS EN BLANCO
	@InitBinder
	public void miBinder(WebDataBinder birder) {
		StringTrimmerEditor recortarEspaciosBlanco = new StringTrimmerEditor(true);
		birder.registerCustomEditor(String.class, recortarEspaciosBlanco);
	}
	
	//PAGINA PRINCIPAL
	@RequestMapping("/inicio") 
	public String muestraPagina(Model elModelo) {
		return "paginaPrincipal";
	}
	
	//Pagina de Base de Datos
	@RequestMapping("/lista") 
	public String listaClientes(Model elModelo) {
		//Obtenemos los datos desde el cliente DAO
		List<Usuario>losUsuarios=usuarioDAO.getUsuarios();		
		elModelo.addAttribute("usuarios",losUsuarios);
		
		return "lista-usuario";
	}
	
	//Se crea un enlace al formulario
	@RequestMapping("/mostrarFormularioAgregar")
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
			
			usuarioDAO.insertarUsuario(elUsuario);
			//return "mostrarInformacion";
			return "redirect:/cliente/lista";
		}
		}
		
	//Actualizar
		@GetMapping("/muestraFormularioActualizar")
		public String muestraFormularioActualizar(@RequestParam("usuarioId") int Id,Model elModelo){
			//Obtener Usuario
			Usuario elUsuario=usuarioDAO.getUsuario(Id);
			elModelo.addAttribute("elUsuario",elUsuario);
			return "formulario";
		}
		
	//Eliminar
		@GetMapping("/eliminar")
		public String eliminarUsuario(@RequestParam("usuarioId") int Id){
			//Eliminar Usuario
			usuarioDAO.eliminarUsuario(Id);
			return "redirect:/cliente/lista";
		}
		
	//Mirar
		@GetMapping("/mirar")
		public String mirarUsuario(@RequestParam("usuarioId") int Id,Model elModelo){
			// Usuario
			Usuario elUsuario=usuarioDAO.getUsuario(Id);
			elModelo.addAttribute("elUsuario",elUsuario);
			return "mostrarInformacion";
		}	
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
}
