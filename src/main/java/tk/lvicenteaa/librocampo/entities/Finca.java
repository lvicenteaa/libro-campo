package tk.lvicenteaa.librocampo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="finca")
public class Finca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private Double area;
	private Double areaPalma;
	private String asociacion;
	private String plano;

	@ManyToOne
	private Propietario propietario;

	@JsonIgnore
	@OneToMany
	private List<Cultivo> cultivo;

	/**
	 * @param id
	 * @param nombre
	 * @param area
	 * @param areaPalma
	 * @param asociacion
	 * @param plano
	 */
	public Finca(Long id, String nombre, Double area, Double areaPalma, String asociacion, String plano) {
		this.id = id;
		this.nombre = nombre;
		this.area = area;
		this.areaPalma = areaPalma;
		this.asociacion = asociacion;
		this.plano = plano;
	}
	/**
	 * @param nombre
	 * @param area
	 * @param areaPalma
	 * @param asociacion
	 * @param plano
	 */
	public Finca(String nombre, Double area, Double areaPalma, String asociacion, String plano) {
		this.nombre = nombre;
		this.area = area;
		this.areaPalma = areaPalma;
		this.asociacion = asociacion;
		this.plano = plano;
	}

	public Finca(Long id, String nombre, Double area, Double areaPalma, String asociacion, String plano, Propietario propietario) {
		this.id = id;
		this.nombre = nombre;
		this.area = area;
		this.areaPalma = areaPalma;
		this.asociacion = asociacion;
		this.plano = plano;
		this.propietario = propietario;
	}

	public Finca(Long id, String nombre, Double area, Double areaPalma, String asociacion, String plano, Propietario propietario, List<Cultivo> cultivo) {
		this.id = id;
		this.nombre = nombre;
		this.area = area;
		this.areaPalma = areaPalma;
		this.asociacion = asociacion;
		this.plano = plano;
		this.propietario = propietario;
		this.cultivo = cultivo;
	}

	/**
	 * 
	 */
	public Finca() {
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the area
	 */
	public Double getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(Double area) {
		this.area = area;
	}
	/**
	 * @return the areaPalma
	 */
	public Double getAreaPalma() {
		return areaPalma;
	}
	/**
	 * @param areaPalma the areaPalma to set
	 */
	public void setAreaPalma(Double areaPalma) {
		this.areaPalma = areaPalma;
	}
	/**
	 * @return the asociacion
	 */
	public String getAsociacion() {
		return asociacion;
	}
	/**
	 * @param asociacion the asociacion to set
	 */
	public void setAsociacion(String asociacion) {
		this.asociacion = asociacion;
	}
	/**
	 * @return the plano
	 */
	public String getPlano() {
		return plano;
	}
	/**
	 * @param plano the plano to set
	 */
	public void setPlano(String plano) {
		this.plano = plano;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public List<Cultivo> getCultivo() {
		return cultivo;
	}

	public void setCultivo(List<Cultivo> cultivo) {
		this.cultivo = cultivo;
	}
}
