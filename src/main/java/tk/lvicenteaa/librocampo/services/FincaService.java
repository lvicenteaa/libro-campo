package tk.lvicenteaa.librocampo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import tk.lvicenteaa.librocampo.entities.Finca;
import tk.lvicenteaa.librocampo.repository.FincaRepository;

@Service
public class FincaService {
	
	@Autowired
	private FincaRepository fincaRepository;
	
	
	
	public List<Finca> mostrarTodos(){
		return this.fincaRepository.findAll();
	}
	
	public ResponseEntity<Finca> buscar(Long id){
		Optional<Finca> fincaOpt = this.fincaRepository.findById(id);
		
		if(fincaOpt.isPresent())
			return ResponseEntity.ok(fincaOpt.get());
		else
			return ResponseEntity.notFound().build();
	}
	
	public ResponseEntity<Finca> crear(Finca finca){
		if(finca.getId() != null)
			return ResponseEntity.badRequest().build();
		Finca result = this.fincaRepository.save(finca);
		return ResponseEntity.ok(result);
	}
	
	public ResponseEntity<Finca> actualizar(Finca finca){
		if(finca.getId() == null)
			return ResponseEntity.badRequest().build();
		if(!this.fincaRepository.existsById(finca.getId()))
			return ResponseEntity.notFound().build();
		Finca result = this.fincaRepository.save(finca);
		return ResponseEntity.ok(result);
	}

	public ResponseEntity<Finca> borrar(Long id){
		if(!this.fincaRepository.existsById(id))
			return ResponseEntity.notFound().build();
		this.fincaRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	public ResponseEntity<Finca> borrarTodos(){
		this.fincaRepository.deleteAll();
		return ResponseEntity.noContent().build();
	}
	
}
