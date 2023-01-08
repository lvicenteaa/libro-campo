package tk.lvicenteaa.librocampo.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calidad")
public class Calidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate fecha;
	private Integer racimosVerdes;
	private Integer racimosSobremaduros;
	private Integer racimosPedunculoLargo;
	private Integer racimosPodridos;
	private String impurezas;

	/**
	 * @param id
	 * @param fecha
	 * @param racimosVerdes
	 * @param racimosSobremaduros
	 * @param racimosPedunculoLargo
	 * @param racimosPodridos
	 * @param impurezas
	 */
	public Calidad(Long id, LocalDate fecha, Integer racimosVerdes, Integer racimosSobremaduros,
			Integer racimosPedunculoLargo, Integer racimosPodridos, String impurezas) {
		this.id = id;
		this.fecha = fecha;
		this.racimosVerdes = racimosVerdes;
		this.racimosSobremaduros = racimosSobremaduros;
		this.racimosPedunculoLargo = racimosPedunculoLargo;
		this.racimosPodridos = racimosPodridos;
		this.impurezas = impurezas;
	}

	/**
	 * @param fecha
	 * @param racimosVerdes
	 * @param racimosSobremaduros
	 * @param racimosPedunculoLargo
	 * @param racimosPodridos
	 * @param impurezas
	 */
	public Calidad(LocalDate fecha, Integer racimosVerdes, Integer racimosSobremaduros, Integer racimosPedunculoLargo,
			Integer racimosPodridos, String impurezas) {
		this.fecha = fecha;
		this.racimosVerdes = racimosVerdes;
		this.racimosSobremaduros = racimosSobremaduros;
		this.racimosPedunculoLargo = racimosPedunculoLargo;
		this.racimosPodridos = racimosPodridos;
		this.impurezas = impurezas;
	}
	
	

	/**
	 * 
	 */
	public Calidad() {
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
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the racimosVerdes
	 */
	public Integer getRacimosVerdes() {
		return racimosVerdes;
	}

	/**
	 * @param racimosVerdes the racimosVerdes to set
	 */
	public void setRacimosVerdes(Integer racimosVerdes) {
		this.racimosVerdes = racimosVerdes;
	}

	/**
	 * @return the racimosSobremaduros
	 */
	public Integer getRacimosSobremaduros() {
		return racimosSobremaduros;
	}

	/**
	 * @param racimosSobremaduros the racimosSobremaduros to set
	 */
	public void setRacimosSobremaduros(Integer racimosSobremaduros) {
		this.racimosSobremaduros = racimosSobremaduros;
	}

	/**
	 * @return the racimosPedunculoLargo
	 */
	public Integer getRacimosPedunculoLargo() {
		return racimosPedunculoLargo;
	}

	/**
	 * @param racimosPedunculoLargo the racimosPedunculoLargo to set
	 */
	public void setRacimosPedunculoLargo(Integer racimosPedunculoLargo) {
		this.racimosPedunculoLargo = racimosPedunculoLargo;
	}

	/**
	 * @return the racimosPodridos
	 */
	public Integer getRacimosPodridos() {
		return racimosPodridos;
	}

	/**
	 * @param racimosPodridos the racimosPodridos to set
	 */
	public void setRacimosPodridos(Integer racimosPodridos) {
		this.racimosPodridos = racimosPodridos;
	}

	/**
	 * @return the impurezas
	 */
	public String getImpurezas() {
		return impurezas;
	}

	/**
	 * @param impurezas the impurezas to set
	 */
	public void setImpurezas(String impurezas) {
		this.impurezas = impurezas;
	}

}
