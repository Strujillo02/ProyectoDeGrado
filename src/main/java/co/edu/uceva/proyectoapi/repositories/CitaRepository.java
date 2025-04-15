package co.edu.uceva.proyectoapi.repositories;

import co.edu.uceva.proyectoapi.models.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends CrudRepository<Cita, Integer> {
    //public abstract ArrayList<Usuario> findByTipoUsuario(String tipoUsuario);
}
