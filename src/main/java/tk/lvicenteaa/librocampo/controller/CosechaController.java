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

import tk.lvicenteaa.librocampo.entities.Cosecha;
import tk.lvicenteaa.librocampo.services.CosechaService;

@RestController("/api/cosecha")
public class CosechaController {

	private CosechaService cosechaService;
	
	public CosechaController(CosechaService cosechaService) {
		this.cosechaService = cosechaService;
	}
	
	@GetMapping
	public List<Cosecha> findAll(){
		return this.cosechaService.mostrarTodos();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cosecha> findOneById(@PathVariable Long id){
		return this.cosechaService.buscar(id);
	}
	
	@PostMapping
	public ResponseEntity<Cosecha> create(@RequestBody Cosecha finca){
		return this.cosechaService.crear(finca);
	}
	
	@PutMapping
	public ResponseEntity<Cosecha> update(@RequestBody Cosecha finca){
		return this.cosechaService.actualizar(finca);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Cosecha> delete(@PathVariable Long id){
		return this.cosechaService.borrar(id);
	}
	
	@DeleteMapping
	public ResponseEntity<Cosecha> deleteAll(){
		return this.cosechaService.borrarTodos();
	}
	
}
