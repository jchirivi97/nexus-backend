package nexus.prueba.backend.persistence;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import nexus.prueba.backend.model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface ProductoPersistence extends JpaRepository<Producto,Integer> {
	
	@Transactional
    @Modifying
    @Query("update Producto p set p.cantidad = ?2,p.fecha = ?3,p.nombre = ?4 where p.idproducto = ?1")
	void updateProducto(int id,int cantidad,Date fecha,String nombre);
	
	@Query(value="select p.idproducto,p.cantidad,p.fecha,p.nombre from Producto p join Trazabilidad t on t.producto = p.idproducto join Usuario u on u.id = t.usuario where u.id=?1 and t.tipo = 'CREAR'",nativeQuery=true)
	List<Producto> getProductCreate(int usuario);
	
	@Modifying
    @Query("delete from Trazabilidad t where t.producto = ?1")
	void deleteTraza(int producto);
	

}
