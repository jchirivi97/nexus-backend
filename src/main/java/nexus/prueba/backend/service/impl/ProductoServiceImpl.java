package nexus.prueba.backend.service.impl;

import java.util.List;

import nexus.prueba.backend.model.Producto;
import nexus.prueba.backend.persistence.ProductoPersistence;
import nexus.prueba.backend.persistence.UsuarioPersistence;
import nexus.prueba.backend.service.NexusException;
import nexus.prueba.backend.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	ProductoPersistence prodPers;

	/**
	 * Metodo para crear un nuevo producto
	 * @param product, un objeto de tipo producto
	 * @return Producto, un objeto de tipo producto que fue creado
	 */
	@Override
	public Producto saveProduct(Producto product) throws NexusException {
		try{
			prodPers.save(product);
			return product;			
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);
		}
	}

	/**
	 * Metodo que retorna todos los productos registrados
	 * @return List<Producto>, retorna una lista con productos 
	 */
	@Override
	public List<Producto> getAllProducts() throws NexusException {
		try{
			return prodPers.findAll();
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);
		}
	}

	/**
	 * Metodo que actualiza un producto registrado
	 * @param producto, objeto de tipo producto
	 * @return producto, objeto de tipo producto
	 */
	@Override
	public Producto updateProducto(Producto producto) throws NexusException {
		try{
			prodPers.save(producto);
			return producto;
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);
		}
	}

	/**
	 * Metodo para eliminar un producto registrado
	 * @param producto, Objeto de tipo producto a eliminar
	 * @return producto, Objeto de tipo producto eliminado
	 */
	@Override
	public Producto deleteProducto(Producto producto) throws NexusException {
		try{
			prodPers.delete(producto);
			return producto;
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);
		}
	}

	

}
