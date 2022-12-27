package tk.lvicenteaa.librocampo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.lvicenteaa.librocampo.entities.Propietario;
import tk.lvicenteaa.librocampo.services.PropietarioService;

@RestController
@RequestMapping("/api/propietario")
public class PropietarioController {

	private PropietarioService propietarioService;

	public PropietarioController(PropietarioService propietarioService) {
		this.propietarioService = propietarioService;
	}

	@GetMapping
	public List<Propietario> findAll() {
		return this.propietarioService.mostrarTodos();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Propietario> findOneById(@PathVariable Long id) {
		return this.propietarioService.buscar(id);
	}

	@PostMapping
	public ResponseEntity<Propietario> create(@RequestBody Propietario finca) {
		return this.propietarioService.crear(finca);
	}

	@PutMapping
	public ResponseEntity<Propietario> update(@RequestBody Propietario finca) {
		return this.propietarioService.actualizar(finca);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Propietario> delete(@PathVariable Long id) {
		return this.propietarioService.borrar(id);
	}

	@DeleteMapping
	public ResponseEntity<Propietario> deleteAll() {
		return this.propietarioService.borrarTodos();
	}
	
}
