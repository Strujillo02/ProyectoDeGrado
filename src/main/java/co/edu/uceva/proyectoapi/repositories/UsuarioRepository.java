package co.edu.uceva.proyectoapi.repositories;

import co.edu.uceva.proyectoapi.models.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    public abstract ArrayList<Usuario> findByTipoUsuario(String tipoUsuario);
}
