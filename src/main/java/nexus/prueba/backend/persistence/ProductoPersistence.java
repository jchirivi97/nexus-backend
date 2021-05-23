package nexus.prueba.backend.persistence;

import nexus.prueba.backend.model.Producto;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ProductoPersistence extends JpaRepository<Producto,Integer> {
	/*
	@Transactional
    @Modifying
    @Query("update Producto p set p.cantidad=?2,p.fecha=?3,p.nombre=?4 where p.idproducto= ?1")
	void setProducto("")*/

}
