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

import tk.lvicenteaa.librocampo.entities.Calidad;
import tk.lvicenteaa.librocampo.services.CalidadService;

@RestController
@RequestMapping("/api/calidad")
public class CalidadController {

	@Autowired
	private CalidadService calidadService;
	

	
	@GetMapping
	public List<Calidad> findAll(){
		return this.calidadService.mostrarTodos();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Calidad> findOneById(@PathVariable Long id){
		return this.calidadService.buscar(id);
	}
	
	@PostMapping
	public ResponseEntity<Calidad> create(@RequestBody Calidad finca){
		return this.calidadService.crear(finca);
	}
	
	@PutMapping
	public ResponseEntity<Calidad> update(@RequestBody Calidad finca){
		return this.calidadService.actualizar(finca);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Calidad> delete(@PathVariable Long id){
		return this.calidadService.borrar(id);
	}
	
	@DeleteMapping
	public ResponseEntity<Calidad> deleteAll(){
		return this.calidadService.borrarTodos();
	}
	
}
