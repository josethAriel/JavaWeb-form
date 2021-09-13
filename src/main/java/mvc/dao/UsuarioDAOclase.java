package mvc.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mvc.entity.Usuario;

@Repository
public class UsuarioDAOclase implements UsuarioDAO{

	@Override
	@Transactional //Permite sustituir al commin y begin
	public List<Usuario> getUsuarios() {
		// TODO Auto-generated method stub
		Session miSession = sessionFactory.getCurrentSession();
		
		//Consulta QUERY
		Query<Usuario> miQuery= miSession.createQuery("From Usuario",Usuario.class);
		
		List<Usuario> usuarios=miQuery.getResultList();
		
		return usuarios;
	}

	//Inyeccion de dependencias cuando se necesite
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void insertarUsuario(Usuario elUsuario) {
		// TODO Auto-generated method stub
		//Obtenemos la session
		Session miSession = sessionFactory.getCurrentSession();
		//Ingresamos el usuario
		miSession.save(elUsuario);
		
	}
	
}
