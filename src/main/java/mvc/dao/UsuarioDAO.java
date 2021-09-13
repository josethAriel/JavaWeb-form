package mvc.dao;

import java.util.List;

import mvc.entity.Usuario;

public interface UsuarioDAO {

	public List<Usuario> getUsuarios();
	
	public void insertarUsuario(Usuario elUsuario);

	public Usuario getUsuario(int id);

	public void eliminarUsuario(int id);
	
}
