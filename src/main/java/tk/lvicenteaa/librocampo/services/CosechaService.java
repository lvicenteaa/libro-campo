package tk.lvicenteaa.librocampo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import tk.lvicenteaa.librocampo.entities.Cosecha;
import tk.lvicenteaa.librocampo.repository.CosechaRepository;

@Service
public class CosechaService {

	private CosechaRepository cosechaRepository;

	public CosechaService(CosechaRepository cosechaRepository) {
		this.cosechaRepository = cosechaRepository;
	}

	public List<Cosecha> mostrarTodos() {
		return this.cosechaRepository.findAll();
	}

	public ResponseEntity<Cosecha> buscar(Long id) {
		Optional<Cosecha> cosechaOpt = this.cosechaRepository.findById(id);
		if (cosechaOpt.isPresent())
			return ResponseEntity.ok(cosechaOpt.get());
		else
			return ResponseEntity.notFound().build();
	}

	public ResponseEntity<Cosecha> crear(Cosecha cosecha) {
		if (cosecha.getId() != null) {
			return ResponseEntity.badRequest().build();
		}
		Cosecha result = this.cosechaRepository.save(cosecha);
		return ResponseEntity.ok(result);
	}

	public ResponseEntity<Cosecha> actualizar(Cosecha cosecha) {
		if (cosecha.getId() == null)
			return ResponseEntity.badRequest().build();
		if (!this.cosechaRepository.existsById(cosecha.getId()))
			return ResponseEntity.notFound().build();
		Cosecha result = this.cosechaRepository.save(cosecha);
		return ResponseEntity.ok(result);
	}

	public ResponseEntity<Cosecha> borrar(Long id) {
		if (!this.cosechaRepository.existsById(id))
			return ResponseEntity.notFound().build();
		this.cosechaRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	public ResponseEntity<Cosecha> borrarTodos() {
		this.cosechaRepository.deleteAll();
		return ResponseEntity.noContent().build();
	}
}
