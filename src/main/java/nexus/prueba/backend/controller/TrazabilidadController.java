package nexus.prueba.backend.controller;

import java.util.List;

import nexus.prueba.backend.model.Trazabilidad;
import nexus.prueba.backend.service.TrazabilidadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/traza")
public class TrazabilidadController {

	@Autowired
	TrazabilidadService trazaServ;
	
	@CrossOrigin(origins={"http://localhost:4200"})
	@RequestMapping(method=RequestMethod.POST,path="/new")
	public ResponseEntity<Trazabilidad> saveTrazabilidad(@RequestBody Trazabilidad traza){
		try{
			System.out.print("sdsd: "+traza.getUsuario());
			return ResponseEntity.ok(trazaServ.saveTrazabilidad(traza));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:4200"})
	@RequestMapping(method=RequestMethod.PUT,path="/update")
	public ResponseEntity<Trazabilidad> updateTrazabilidad(@RequestBody Trazabilidad traza){
		try{
			return ResponseEntity.ok(trazaServ.updateTrazabilidad(traza));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:4200"})
	@RequestMapping(method=RequestMethod.GET,path="/all")
	public ResponseEntity<List<Trazabilidad>> getAllTrazabilidad(){
		try{
			return ResponseEntity.ok(trazaServ.getAllTrazabilidad());
		}catch(Exception ex){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
