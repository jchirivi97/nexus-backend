package nexus.prueba.backend.service;

import java.util.List;

import nexus.prueba.backend.model.Trazabilidad;

public interface TrazabilidadService {
	
	Trazabilidad saveTrazabilidad(Trazabilidad trazabilidad) throws NexusException;
	
	Trazabilidad updateTrazabilidad(Trazabilidad trazabilidad)  throws NexusException;
	
	List<Trazabilidad> getAllTrazabilidad() throws NexusException;
}
