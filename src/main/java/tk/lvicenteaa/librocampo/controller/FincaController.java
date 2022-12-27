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

import tk.lvicenteaa.librocampo.entities.Finca;
import tk.lvicenteaa.librocampo.services.FincaService;

@RestController
@RequestMapping("/api/finca")
public class FincaController {

	@Autowired
	private FincaService fincaService;

	
	@GetMapping
	public List<Finca> findAll(){
		return this.fincaService.mostrarTodos();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Finca> findOneById(@PathVariable Long id){
		return this.fincaService.buscar(id);
	}
	
	@PostMapping
	public ResponseEntity<Finca> create(@RequestBody Finca finca){
		return this.fincaService.crear(finca);
	}
	
	@PutMapping
	public ResponseEntity<Finca> update(@RequestBody Finca finca){
		return this.fincaService.actualizar(finca);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Finca> delete(@PathVariable Long id){
		return this.fincaService.borrar(id);
	}
	
	@DeleteMapping
	public ResponseEntity<Finca> deleteAll(){
		return this.fincaService.borrarTodos();
	}
	
}
