package co.edu.uceva.proyectoapi.repositories;

import co.edu.uceva.proyectoapi.models.Usuarios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuarios, Integer> {
}
