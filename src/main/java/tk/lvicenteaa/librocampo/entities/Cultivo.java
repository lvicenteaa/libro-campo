package tk.lvicenteaa.librocampo.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "cultivo")
public class Cultivo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private Double ancho;
	private Double largo;
	private String mapeo;
	private LocalDate inicioSiembra;

	@JsonIgnore
	@OneToMany
	private List<PlanFertilizante> planFertilizantes;
	@ManyToOne
	private Finca finca;

	@JsonIgnore
	@OneToMany
	private List<Calidad> calidad;

	@JsonIgnore
	@OneToMany
	private List<Cosecha> cosecha;

	/**
	 * @param nombre
	 * @param ancho
	 * @param largo
	 * @param mapeo
	 * @param inicioSiembra
	 */
	public Cultivo(String nombre, Double ancho, Double largo, String mapeo, LocalDate inicioSiembra) {
		this.nombre = nombre;
		this.ancho = ancho;
		this.largo = largo;
		this.mapeo = mapeo;
		this.inicioSiembra = inicioSiembra;
	}

	/**
	 * @param id
	 * @param nombre
	 * @param ancho
	 * @param largo
	 * @param mapeo
	 * @param inicioSiembra
	 */
	public Cultivo(Long id, String nombre, Double ancho, Double largo, String mapeo, LocalDate inicioSiembra) {
		this.id = id;
		this.nombre = nombre;
		this.ancho = ancho;
		this.largo = largo;
		this.mapeo = mapeo;
		this.inicioSiembra = inicioSiembra;
	}

	public Cultivo(Long id, String nombre, Double ancho, Double largo, String mapeo, LocalDate inicioSiembra, List<PlanFertilizante> planFertilizantes, Finca finca, List<Calidad> calidad, List<Cosecha> cosecha) {
		this.id = id;
		this.nombre = nombre;
		this.ancho = ancho;
		this.largo = largo;
		this.mapeo = mapeo;
		this.inicioSiembra = inicioSiembra;
		this.planFertilizantes = planFertilizantes;
		this.finca = finca;
		this.calidad = calidad;
		this.cosecha = cosecha;
	}

	public Cultivo() {
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
	 * @return the ancho
	 */
	public Double getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the largo
	 */
	public Double getLargo() {
		return largo;
	}

	/**
	 * @param largo the largo to set
	 */
	public void setLargo(Double largo) {
		this.largo = largo;
	}

	/**
	 * @return the mapeo
	 */
	public String getMapeo() {
		return mapeo;
	}

	/**
	 * @param mapeo the mapeo to set
	 */
	public void setMapeo(String mapeo) {
		this.mapeo = mapeo;
	}

	/**
	 * @return the inicioSiembra
	 */
	public LocalDate getInicioSiembra() {
		return inicioSiembra;
	}

	/**
	 * @param inicioSiembra the inicioSiembra to set
	 */
	public void setInicioSiembra(LocalDate inicioSiembra) {
		this.inicioSiembra = inicioSiembra;
	}

	public List<PlanFertilizante> getPlanFertilizantes() {
		return planFertilizantes;
	}

	public void setPlanFertilizantes(List<PlanFertilizante> planFertilizantes) {
		this.planFertilizantes = planFertilizantes;
	}

	public Finca getFinca() {
		return finca;
	}

	public void setFinca(Finca finca) {
		this.finca = finca;
	}

	public List<Calidad> getCalidad() {
		return calidad;
	}

	public void setCalidad(List<Calidad> calidad) {
		this.calidad = calidad;
	}

	public List<Cosecha> getCosecha() {
		return cosecha;
	}

	public void setCosecha(List<Cosecha> cosecha) {
		this.cosecha = cosecha;
	}
}
