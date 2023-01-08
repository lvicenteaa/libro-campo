package tk.lvicenteaa.librocampo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.lvicenteaa.librocampo.entities.PlanFertilizante;
import tk.lvicenteaa.librocampo.services.PlanFertilizanteService;

@RestController
@RequestMapping("/api/planFertilizante")
public class PlanFertilizanteController {

	@Autowired
	private PlanFertilizanteService planFertilizanteService;

	

	@GetMapping
	public List<PlanFertilizante> findAll() {
		return this.planFertilizanteService.mostrarTodos();
	}

	@GetMapping("/{id}")
	public ResponseEntity<PlanFertilizante> findOneById(@PathVariable Long id) {
		return this.planFertilizanteService.buscar(id);
	}

	@PostMapping
	public ResponseEntity<PlanFertilizante> create(@RequestBody PlanFertilizante finca) {
		return this.planFertilizanteService.crear(finca);
	}

	@PutMapping
	public ResponseEntity<PlanFertilizante> update(@RequestBody PlanFertilizante finca) {
		return this.planFertilizanteService.actualizar(finca);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<PlanFertilizante> delete(@PathVariable Long id) {
		return this.planFertilizanteService.borrar(id);
	}

	@DeleteMapping
	public ResponseEntity<PlanFertilizante> deleteAll() {
		return this.planFertilizanteService.borrarTodos();
	}

}
