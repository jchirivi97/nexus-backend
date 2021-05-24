package nexus.prueba.backend.controller;

import java.util.List;

import nexus.prueba.backend.model.Usuario;
import nexus.prueba.backend.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UsuarioController {

	@Autowired
	UsuarioService userServ;
	
	/**
	 * Controlador que retorna los usuario registrados
	 * @return List<Usuarios> lista de tipo usuarios
	 */
	@CrossOrigin(origins={"http://localhost:8081"})
	@RequestMapping(method=RequestMethod.GET,path="/all")
	public ResponseEntity<List<Usuario>> getAllUsers(){
		try{
			return ResponseEntity.ok(userServ.getAllUser());
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);			
		}
	}
	
	/**
	 * Controlador para crear un usuario
	 * @param user, objeto tipo Usuario
	 * @return user objeto tipo Usuario del usuario creado
	 */
	@CrossOrigin(origins={"http://localhost:8081"})
	@RequestMapping(method=RequestMethod.POST,path="/new")
	public ResponseEntity<Usuario> saveUser(@RequestBody Usuario user){
		try{
			return ResponseEntity.ok(userServ.saveUser(user));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);			
		}
	}
	
	@CrossOrigin(origins={"http://localhost:8081"})
	@RequestMapping(method=RequestMethod.PUT,path="/update")
	public ResponseEntity<Usuario> updateUser(@RequestBody Usuario user){
		try{
			System.out.print("dfsdfdsfsd-");
			return ResponseEntity.ok(userServ.updateUser(user));
		}catch(Exception ex){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
}
