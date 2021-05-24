package nexus.prueba.backend.service;

import java.util.List;

import nexus.prueba.backend.model.Producto;

public interface ProductoService {
	
	Producto saveProduct(Producto product) throws NexusException;
	
	List<Producto> getAllProducts() throws NexusException;
	
	Producto updateProducto(Producto producto) throws NexusException;
	
	Producto deleteProducto(Producto producto) throws NexusException;
	
	List<Producto> getProductCreate(int usuario) throws NexusException;
	
	
}
