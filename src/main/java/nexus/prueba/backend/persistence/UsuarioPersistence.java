package nexus.prueba.backend.persistence;


import java.sql.Date;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import nexus.prueba.backend.model.*;

public interface UsuarioPersistence extends JpaRepository<Usuario,Integer>  {
	
	@Transactional
    @Modifying
    @Query("update Usuario u set u.cargo = ?2, u.edad = ?3, u.fechaIngreso = ?4, u.nombre = ?5 where u.id = ?1")
	void setUpdate(int id,int cargo,int edad,Date fechaIngreso,String nombre);	
}
