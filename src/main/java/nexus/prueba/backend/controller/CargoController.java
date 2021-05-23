package nexus.prueba.backend.controller;

import java.util.List;

import nexus.prueba.backend.model.Cargo;
import nexus.prueba.backend.model.Producto;
import nexus.prueba.backend.service.CargoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/cargo")
public class CargoController {
	
	@Autowired
	CargoService cargoServ;
	
	@CrossOrigin(origins={"http://localhost:4200"})
	@RequestMapping(method=RequestMethod.POST,path="/new")
	public ResponseEntity<Cargo> saveProduct(@RequestBody Cargo cargo){
		try{
			return ResponseEntity.ok(cargoServ.saveCargo(cargo));
		}catch(Exception ex){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:4200"})
	@RequestMapping(method=RequestMethod.GET,path="/all")
	public ResponseEntity<List<Cargo>> getAllCargos(){
		try{
			return ResponseEntity.ok(cargoServ.getAllCargos());
		}catch(Exception ex){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:4200"})
	@RequestMapping(method=RequestMethod.PUT,path="/update")
	public ResponseEntity<Cargo> updateProduct(@RequestBody Cargo cargo){
		try{
			return ResponseEntity.ok(cargoServ.updateCargo(cargo));
		}catch(Exception ex){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:4200"})
	@RequestMapping(method=RequestMethod.DELETE,path="/delete")
	public ResponseEntity<Cargo> deleteProduct(@RequestBody Cargo cargo){
		try{
			return ResponseEntity.ok(cargoServ.deleteCargo(cargo));
		}catch(Exception ex){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
