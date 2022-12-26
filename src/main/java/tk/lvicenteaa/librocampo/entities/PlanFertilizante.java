package tk.lvicenteaa.librocampo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "planFertilizante")
public class PlanFertilizante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String claseFertilizante;
	private Integer numeroBultos;
	private Integer gramosPalma;

	/**
	 * @param id
	 * @param claseFertilizante
	 * @param numeroBultos
	 * @param gramosPalma
	 */
	public PlanFertilizante(Long id, String claseFertilizante, Integer numeroBultos, Integer gramosPalma) {
		this.id = id;
		this.claseFertilizante = claseFertilizante;
		this.numeroBultos = numeroBultos;
		this.gramosPalma = gramosPalma;
	}

	/**
	 * @param claseFertilizante
	 * @param numeroBultos
	 * @param gramosPalma
	 */
	public PlanFertilizante(String claseFertilizante, Integer numeroBultos, Integer gramosPalma) {
		this.claseFertilizante = claseFertilizante;
		this.numeroBultos = numeroBultos;
		this.gramosPalma = gramosPalma;
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
	 * @return the claseFertilizante
	 */
	public String getClaseFertilizante() {
		return claseFertilizante;
	}

	/**
	 * @param claseFertilizante the claseFertilizante to set
	 */
	public void setClaseFertilizante(String claseFertilizante) {
		this.claseFertilizante = claseFertilizante;
	}

	/**
	 * @return the numeroBultos
	 */
	public Integer getNumeroBultos() {
		return numeroBultos;
	}

	/**
	 * @param numeroBultos the numeroBultos to set
	 */
	public void setNumeroBultos(Integer numeroBultos) {
		this.numeroBultos = numeroBultos;
	}

	/**
	 * @return the gramosPalma
	 */
	public Integer getGramosPalma() {
		return gramosPalma;
	}

	/**
	 * @param gramosPalma the gramosPalma to set
	 */
	public void setGramosPalma(Integer gramosPalma) {
		this.gramosPalma = gramosPalma;
	}

}
