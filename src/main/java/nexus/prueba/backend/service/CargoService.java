package nexus.prueba.backend.service;

import java.util.List;

import nexus.prueba.backend.model.Cargo;

public interface CargoService {
	
	List<Cargo> getAllCargos() throws NexusException;;
	
	Cargo saveCargo(Cargo cargo) throws NexusException;;
	
	Cargo updateCargo(Cargo cargo) throws NexusException;;
	
	Cargo deleteCargo(Cargo cargo) throws NexusException;;

}
