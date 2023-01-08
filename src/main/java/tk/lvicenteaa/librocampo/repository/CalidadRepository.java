package tk.lvicenteaa.librocampo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tk.lvicenteaa.librocampo.entities.Calidad;

@Repository
public interface CalidadRepository extends JpaRepository<Calidad, Long> {

	
}
