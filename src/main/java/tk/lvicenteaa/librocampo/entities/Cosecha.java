package tk.lvicenteaa.librocampo.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cosecha")
public class Cosecha {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate fecha;
	private Integer numeroRacimos;
	private Double pesoTotal;
	private Double PrecioVenta;

	/**
	 * @param id
	 * @param fecha
	 * @param numeroRacimos
	 * @param pesoTotal
	 * @param precioVenta
	 */
	public Cosecha(Long id, LocalDate fecha, Integer numeroRacimos, Double pesoTotal, Double precioVenta) {
		this.id = id;
		this.fecha = fecha;
		this.numeroRacimos = numeroRacimos;
		this.pesoTotal = pesoTotal;
		PrecioVenta = precioVenta;
	}

	/**
	 * @param fecha
	 * @param numeroRacimos
	 * @param pesoTotal
	 * @param precioVenta
	 */
	public Cosecha(LocalDate fecha, Integer numeroRacimos, Double pesoTotal, Double precioVenta) {
		this.fecha = fecha;
		this.numeroRacimos = numeroRacimos;
		this.pesoTotal = pesoTotal;
		PrecioVenta = precioVenta;
	}
	
	

	/**
	 * 
	 */
	public Cosecha() {
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
	 * @return the numeroRacimos
	 */
	public Integer getNumeroRacimos() {
		return numeroRacimos;
	}

	/**
	 * @param numeroRacimos the numeroRacimos to set
	 */
	public void setNumeroRacimos(Integer numeroRacimos) {
		this.numeroRacimos = numeroRacimos;
	}

	/**
	 * @return the pesoTotal
	 */
	public Double getPesoTotal() {
		return pesoTotal;
	}

	/**
	 * @param pesoTotal the pesoTotal to set
	 */
	public void setPesoTotal(Double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	/**
	 * @return the precioVenta
	 */
	public Double getPrecioVenta() {
		return PrecioVenta;
	}

	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(Double precioVenta) {
		PrecioVenta = precioVenta;
	}

}
