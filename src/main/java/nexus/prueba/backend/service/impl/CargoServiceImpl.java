package nexus.prueba.backend.service.impl;

import java.util.List;

import nexus.prueba.backend.model.Cargo;
import nexus.prueba.backend.persistence.CargoPersistence;
import nexus.prueba.backend.service.CargoService;
import nexus.prueba.backend.service.NexusException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoServiceImpl implements CargoService {

	@Autowired
	CargoPersistence cargoPer;

	@Override
	public List<Cargo> getAllCargos() throws NexusException {
		try{
			return cargoPer.findAll();			
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);
		}
	}

	@Override
	public Cargo saveCargo(Cargo cargo) throws NexusException {
		try{
			return cargoPer.save(cargo);			
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);
		}
	}

	@Override
	public Cargo updateCargo(Cargo cargo) throws NexusException {
		try{
			return cargoPer.save(cargo);			
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);
		}
	}

	@Override
	public Cargo deleteCargo(Cargo cargo) throws NexusException {
		try{
			cargoPer.delete(cargo);		
			return cargo;
		}catch(Exception ex){
			throw new NexusException(ex.getMessage(),ex);
		}
	}


	
}
