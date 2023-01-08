package tk.lvicenteaa.librocampo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import tk.lvicenteaa.librocampo.entities.Calidad;
import tk.lvicenteaa.librocampo.repository.CalidadRepository;

@Service
public class CalidadService {
	
	@Autowired
	private CalidadRepository calidadRepository;
	//private final Logger log = LoggerFactory.getLogger(CalidadService.class);
	
	
	public List<Calidad> mostrarTodos(){
		return this.calidadRepository.findAll();
	}
	
	public ResponseEntity<Calidad> buscar(Long id){
		Optional<Calidad> calidadOpt = this.calidadRepository.findById(id);
		
		if (calidadOpt.isPresent())
			return ResponseEntity.ok(calidadOpt.get());
		else
			return ResponseEntity.notFound().build();
	}
	
	public ResponseEntity<Calidad> crear(Calidad calidad){
		if (calidad.getId() != null)
			return ResponseEntity.badRequest().build();
		Calidad result = this.calidadRepository.save(calidad);
		return ResponseEntity.ok(result);
	}
	
	public ResponseEntity<Calidad> actualizar(Calidad calidad){
		if(calidad.getId() == null)
			return ResponseEntity.badRequest().build();
		if(!this.calidadRepository.existsById(calidad.getId()))
			return ResponseEntity.notFound().build();
		Calidad result = this.calidadRepository.save(calidad);
		return ResponseEntity.ok(result);
	}
	
	public ResponseEntity<Calidad> borrar(Long id){
		if(!this.calidadRepository.existsById(id))
			return ResponseEntity.notFound().build();
		this.calidadRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	public ResponseEntity<Calidad> borrarTodos(){
		this.calidadRepository.deleteAll();
		return ResponseEntity.noContent().build();
	}

}
