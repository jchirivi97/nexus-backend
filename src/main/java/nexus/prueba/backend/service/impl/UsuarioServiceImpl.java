package nexus.prueba.backend.service.impl;

import java.util.List;

import nexus.prueba.backend.model.Usuario;
import nexus.prueba.backend.persistence.UsuarioPersistence;
import nexus.prueba.backend.service.NexusException;
import nexus.prueba.backend.service.UsuarioService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioPersistence userP;

	/**
	 * Metodo para almacenar un usuario
	 * @param Usuario user objeto de tipo usuario ha registrar
	 * @return Usuario, usuario registrado
	 */
	@Override
	public Usuario saveUser(Usuario user) throws NexusException {	
		try{
			userP.save(user);
			return user;
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);
		}
	}

	/**
	 * Función que retorna todos los usuarios registrados
	 * @return List<Usuario>, lista con los usuarios registrados
	 */
	@Override
	public List<Usuario> getAllUser() throws NexusException {
		try{
			return userP.findAll();
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);
		}	
	}

	/**
	 * Funcion para actualizar un usuario registrado
	 *@param Usuario, un objeto tipo usuario
	 *@return Usuario, un objeto tipo usuario actualizado
	 */
	@Override
	public Usuario updateUser(Usuario user) throws NexusException {
		try{
			//userP.setUpdate(user.getId(), user.getCargo(), user.getEdad(), user.getFechaIngreso(), user.getNombre());
			userP.save(user);
			return user;
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);
		}
	}

	

}
