package nexus.prueba.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cargo")
public class Cargo {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int idcargo;
	private String nombre;
	
	public int getIdcargo() {
		return idcargo;
	}
	public void setIdcargo(int idcargo) {
		this.idcargo = idcargo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
