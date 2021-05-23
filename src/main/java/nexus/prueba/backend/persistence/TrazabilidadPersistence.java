package nexus.prueba.backend.persistence;

import nexus.prueba.backend.model.Trazabilidad;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TrazabilidadPersistence extends JpaRepository<Trazabilidad,Integer> {

}
