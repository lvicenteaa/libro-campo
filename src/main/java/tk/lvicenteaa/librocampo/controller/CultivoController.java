package tk.lvicenteaa.librocampo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tk.lvicenteaa.librocampo.entities.Cultivo;
import tk.lvicenteaa.librocampo.services.CultivoService;

@RestController("/api/cultivo")
public class CultivoController {

	private CultivoService cultivoService;

	public CultivoController(CultivoService cultivoService) {
		this.cultivoService = cultivoService;
	}

	@GetMapping
	public List<Cultivo> findAll() {
		return this.cultivoService.mostrarTodos();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cultivo> findOneById(@PathVariable Long id) {
		return this.cultivoService.buscar(id);
	}

	@PostMapping
	public ResponseEntity<Cultivo> create(@RequestBody Cultivo finca) {
		return this.cultivoService.crear(finca);
	}

	@PutMapping
	public ResponseEntity<Cultivo> update(@RequestBody Cultivo finca) {
		return this.cultivoService.actualizar(finca);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Cultivo> delete(@PathVariable Long id) {
		return this.cultivoService.borrar(id);
	}

	@DeleteMapping
	public ResponseEntity<Cultivo> deleteAll() {
		return this.cultivoService.borrarTodos();
	}

}
