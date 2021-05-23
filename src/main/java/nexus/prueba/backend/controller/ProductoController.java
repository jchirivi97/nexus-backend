package nexus.prueba.backend.controller;

import java.util.List;

import nexus.prueba.backend.model.Producto;
import nexus.prueba.backend.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/product")
public class ProductoController {
	
	@Autowired
	ProductoService prodServ;
	
	@CrossOrigin(origins={"http://localhost:4200"})
	@RequestMapping(method=RequestMethod.POST,path="/new")
	public ResponseEntity<Producto> saveProduct(@RequestBody Producto producto){
		try{
			return ResponseEntity.ok(prodServ.saveProduct(producto));
		}catch(Exception ex){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:4200"})
	@RequestMapping(method=RequestMethod.GET,path="/all")
	public ResponseEntity<List<Producto>> getAllProducts(){
		try{
			return ResponseEntity.ok(prodServ.getAllProducts());
		}catch(Exception ex){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:4200"})
	@RequestMapping(method=RequestMethod.PUT,path="/update")
	public ResponseEntity<Producto> updateProduct(@RequestBody Producto producto){
		try{
			return ResponseEntity.ok(prodServ.updateProducto(producto));
		}catch(Exception ex){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:4200"})
	@RequestMapping(method=RequestMethod.DELETE,path="/delete")
	public ResponseEntity<Producto> deleteProduct(@RequestBody Producto producto){
		try{
			return ResponseEntity.ok(prodServ.deleteProducto(producto));
		}catch(Exception ex){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
