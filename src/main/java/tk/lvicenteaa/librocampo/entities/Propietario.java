package tk.lvicenteaa.librocampo.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "propietario")
public class Propietario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombres;
	private String apellidos;
	private String noCedula;
	private String expedicion_Cedula;
	private String telefono;
	private LocalDate fechaNacimiento;
	private String email;

	@OneToMany
	private List<Finca> fincas;

	/**
	 * @param id
	 * @param nombres
	 * @param apellidos
	 * @param noCedula
	 * @param expedicion_Cedula
	 * @param telefono
	 * @param fechaNacimiento
	 * @param email
	 */
	public Propietario(Long id, String nombres, String apellidos, String noCedula, String expedicion_Cedula,
			String telefono, LocalDate fechaNacimiento, String email) {
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.noCedula = noCedula;
		this.expedicion_Cedula = expedicion_Cedula;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
	}

	/**
	 * @param nombres
	 * @param apellidos
	 * @param noCedula
	 * @param expedicion_Cedula
	 * @param telefono
	 * @param fechaNacimiento
	 * @param email
	 */
	public Propietario(String nombres, String apellidos, String noCedula, String expedicion_Cedula, String telefono,
			LocalDate fechaNacimiento, String email) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.noCedula = noCedula;
		this.expedicion_Cedula = expedicion_Cedula;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
	}
	
	

	/**
	 * 
	 */
	public Propietario() {
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
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the noCedula
	 */
	public String getNoCedula() {
		return noCedula;
	}

	/**
	 * @param noCedula the noCedula to set
	 */
	public void setNoCedula(String noCedula) {
		this.noCedula = noCedula;
	}

	/**
	 * @return the expedicion_Cedula
	 */
	public String getExpedicion_Cedula() {
		return expedicion_Cedula;
	}

	/**
	 * @param expedicion_Cedula the expedicion_Cedula to set
	 */
	public void setExpedicion_Cedula(String expedicion_Cedula) {
		this.expedicion_Cedula = expedicion_Cedula;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
