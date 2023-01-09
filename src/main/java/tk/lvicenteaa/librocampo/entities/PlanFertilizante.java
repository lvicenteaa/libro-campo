package tk.lvicenteaa.librocampo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "planFertilizante")
public class PlanFertilizante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String claseFertilizante;
	private Integer numeroBultos;
	private Integer gramosPalma;

	@ManyToOne
	private Cultivo cultivo;

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

	public PlanFertilizante(Long id, String claseFertilizante, Integer numeroBultos, Integer gramosPalma, Cultivo cultivo) {
		this.id = id;
		this.claseFertilizante = claseFertilizante;
		this.numeroBultos = numeroBultos;
		this.gramosPalma = gramosPalma;
		this.cultivo = cultivo;
	}

	/**
	 * 
	 */
	public PlanFertilizante() {
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

	public Cultivo getCultivo() {
		return cultivo;
	}

	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}



}
