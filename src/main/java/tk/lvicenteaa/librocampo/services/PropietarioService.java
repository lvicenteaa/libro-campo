package tk.lvicenteaa.librocampo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import tk.lvicenteaa.librocampo.entities.Propietario;
import tk.lvicenteaa.librocampo.repository.PropietarioRepository;

@Service
public class PropietarioService {

	@Autowired
	private PropietarioRepository propietarioRepository;

	public List<Propietario> mostrarTodos() {
		return this.propietarioRepository.findAll();
	}

	public ResponseEntity<Propietario> buscar(Long id) {
		Optional<Propietario> propietarioOpt = this.propietarioRepository.findById(id);
		if (propietarioOpt.isPresent())
			return ResponseEntity.ok(propietarioOpt.get());
		else
			return ResponseEntity.notFound().build();
	}

	public ResponseEntity<Propietario> crear(Propietario propietario) {
		if (propietario.getId() != null) {
			return ResponseEntity.badRequest().build();
		}
		Propietario result = this.propietarioRepository.save(propietario);
		return ResponseEntity.ok(result);
	}

	public ResponseEntity<Propietario> actualizar(Propietario propietario) {
		if (propietario.getId() == null)
			return ResponseEntity.badRequest().build();
		if (!this.propietarioRepository.existsById(propietario.getId()))
			return ResponseEntity.notFound().build();
		Propietario result = this.propietarioRepository.save(propietario);
		return ResponseEntity.ok(result);
	}

	public ResponseEntity<Propietario> borrar(Long id) {
		if (!this.propietarioRepository.existsById(id))
			return ResponseEntity.notFound().build();
		this.propietarioRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	public ResponseEntity<Propietario> borrarTodos() {
		this.propietarioRepository.deleteAll();
		return ResponseEntity.noContent().build();
	}

}
