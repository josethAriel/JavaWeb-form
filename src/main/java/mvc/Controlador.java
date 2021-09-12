package mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.dao.UsuarioDAO;
import mvc.entity.Usuario;

@Controller
@RequestMapping("/cliente") //URL QUE NOS PERMITE INGRESAR A MI ARCHIVO JSP
public class Controlador {

	// METODO ENCARGADO DE MAPEAR CUAL ES EL ARCHIVO JASP O VISTA QUE DESEO VER
	/*@RequestMapping
		public String muestraPagina() {
			return "paginaPrincipal";// JSP
		}*/
	
	@RequestMapping("/lista") 
	public String listaClientes(Model elModelo) {
		//Obtenemos los datos desde el cliente DAO
		List<Usuario>losUsuarios=usuarioDAO.getUsuarios();
		
		elModelo.addAttribute("usuarios",losUsuarios);
		
		return "lista-usuario";
		//return "paginaPrincipal";
	}
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
}
