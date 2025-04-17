package co.edu.uceva.proyectoapi.repositories;

import co.edu.uceva.proyectoapi.models.Especialidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends CrudRepository<Especialidad, Integer> {
}
