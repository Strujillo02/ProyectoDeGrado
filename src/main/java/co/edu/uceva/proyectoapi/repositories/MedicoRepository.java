package co.edu.uceva.proyectoapi.repositories;

import co.edu.uceva.proyectoapi.models.Medico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends CrudRepository<Medico, Integer> {
   //ArrayList<Medico> findByEspecialidad(Especialidad especialidades);
}
