package nexus.prueba.backend.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Trazabilidad")
public class Trazabilidad {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO )
	private int id;
	private Date fecha;
	private int usuario;
	private int producto;
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getUsuario() {
		return usuario;
	}
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
	public int getProducto() {
		return producto;
	}
	public void setProducto(int producto) {
		this.producto = producto;
	};
	
	
}
