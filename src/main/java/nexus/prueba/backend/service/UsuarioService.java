package nexus.prueba.backend.service;

import java.util.List;

import nexus.prueba.backend.model.Usuario;

public interface UsuarioService {
	
	Usuario saveUser(Usuario user) throws NexusException;
	
	List<Usuario> getAllUser() throws NexusException;
	
	Usuario updateUser(Usuario user) throws NexusException;
		
}
