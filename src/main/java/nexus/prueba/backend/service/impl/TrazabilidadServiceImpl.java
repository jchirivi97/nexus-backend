package nexus.prueba.backend.service.impl;

import java.util.List;

import nexus.prueba.backend.model.Trazabilidad;
import nexus.prueba.backend.persistence.TrazabilidadPersistence;
import nexus.prueba.backend.service.NexusException;
import nexus.prueba.backend.service.TrazabilidadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrazabilidadServiceImpl implements TrazabilidadService {
	
	@Autowired
	TrazabilidadPersistence trazaPer;

	@Override
	public Trazabilidad saveTrazabilidad(Trazabilidad trazabilidad)
			throws NexusException {
		try{
			trazaPer.save(trazabilidad);
			return trazabilidad;
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);			
		}
	}

	@Override
	public Trazabilidad updateTrazabilidad(Trazabilidad trazabilidad)
			throws NexusException {
		try{
			trazaPer.save(trazabilidad);
			return trazabilidad;
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);			
		}
	}

	@Override
	public List<Trazabilidad> getAllTrazabilidad() throws NexusException {
		try{
			return trazaPer.findAll();
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);			
		}
	}
}
