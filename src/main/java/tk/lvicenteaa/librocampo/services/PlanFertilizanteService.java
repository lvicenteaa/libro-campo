package tk.lvicenteaa.librocampo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import tk.lvicenteaa.librocampo.entities.PlanFertilizante;
import tk.lvicenteaa.librocampo.repository.PlanFertilizanteRepository;

@Service
public class PlanFertilizanteService {
	
	@Autowired
	private PlanFertilizanteRepository planFertilizanteRepository;



	public List<PlanFertilizante> mostrarTodos() {
		return this.planFertilizanteRepository.findAll();
	}

	public ResponseEntity<PlanFertilizante> buscar(Long id) {
		Optional<PlanFertilizante> planFertilizanteOpt = this.planFertilizanteRepository.findById(id);
		if (planFertilizanteOpt.isPresent())
			return ResponseEntity.ok(planFertilizanteOpt.get());
		else
			return ResponseEntity.notFound().build();
	}

	public ResponseEntity<PlanFertilizante> crear(PlanFertilizante planFertilizante) {
		if (planFertilizante.getId() != null) {
			return ResponseEntity.badRequest().build();
		}
		PlanFertilizante result = this.planFertilizanteRepository.save(planFertilizante);
		return ResponseEntity.ok(result);
	}

	public ResponseEntity<PlanFertilizante> actualizar(PlanFertilizante planFertilizante) {
		if (planFertilizante.getId() == null)
			return ResponseEntity.badRequest().build();
		if (!this.planFertilizanteRepository.existsById(planFertilizante.getId()))
			return ResponseEntity.notFound().build();
		PlanFertilizante result = this.planFertilizanteRepository.save(planFertilizante);
		return ResponseEntity.ok(result);
	}

	public ResponseEntity<PlanFertilizante> borrar(Long id) {
		if (!this.planFertilizanteRepository.existsById(id))
			return ResponseEntity.notFound().build();
		this.planFertilizanteRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	public ResponseEntity<PlanFertilizante> borrarTodos() {
		this.planFertilizanteRepository.deleteAll();
		return ResponseEntity.noContent().build();
	}
}
