package co.edu.uceva.proyectoapi.repositories;

import co.edu.uceva.proyectoapi.models.Cita;
import co.edu.uceva.proyectoapi.models.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Integer> {
    //public abstract ArrayList<Usuario> findByTipoUsuario(String tipoUsuario);
}
