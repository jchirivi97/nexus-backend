package nexus.prueba.backend.persistence;

import nexus.prueba.backend.model.Cargo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoPersistence extends JpaRepository<Cargo,Integer> {

}
