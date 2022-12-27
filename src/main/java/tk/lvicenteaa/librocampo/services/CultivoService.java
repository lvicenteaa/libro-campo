package tk.lvicenteaa.librocampo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import tk.lvicenteaa.librocampo.entities.Cultivo;
import tk.lvicenteaa.librocampo.repository.CultivoRepository;

@Service
public class CultivoService {

	private CultivoRepository cultivoRepository;

	public CultivoService(CultivoRepository cultivoRepository) {
		this.cultivoRepository = cultivoRepository;
	}

	public List<Cultivo> mostrarTodos() {
		return this.cultivoRepository.findAll();
	}

	public ResponseEntity<Cultivo> buscar(Long id) {
		Optional<Cultivo> cultivoOpt = this.cultivoRepository.findById(id);
		if (cultivoOpt.isPresent())
			return ResponseEntity.ok(cultivoOpt.get());
		else
			return ResponseEntity.notFound().build();
	}

	public ResponseEntity<Cultivo> crear(Cultivo cultivo) {
		if (cultivo.getId() != null) {
			return ResponseEntity.badRequest().build();
		}
		Cultivo result = this.cultivoRepository.save(cultivo);
		return ResponseEntity.ok(result);
	}

	public ResponseEntity<Cultivo> actualizar(Cultivo cultivo) {
		if (cultivo.getId() == null)
			return ResponseEntity.badRequest().build();
		if (!this.cultivoRepository.existsById(cultivo.getId()))
			return ResponseEntity.notFound().build();
		Cultivo result = this.cultivoRepository.save(cultivo);
		return ResponseEntity.ok(result);
	}

	public ResponseEntity<Cultivo> borrar(Long id) {
		if (!this.cultivoRepository.existsById(id))
			return ResponseEntity.notFound().build();
		this.cultivoRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	public ResponseEntity<Cultivo> borrarTodos() {
		this.cultivoRepository.deleteAll();
		return ResponseEntity.noContent().build();
	}
}
