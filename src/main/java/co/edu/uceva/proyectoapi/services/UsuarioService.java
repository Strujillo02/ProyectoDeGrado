package co.edu.uceva.proyectoapi.services;

import co.edu.uceva.proyectoapi.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.uceva.proyectoapi.repositories.UsuarioRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Usuario> obtenerUsuarios(){
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> obtenerUsuarioPorId(Integer Id){
        return usuarioRepository.findById(Id);
    }

    public ArrayList<Usuario> obtenerUsuarioPorTipoUsuario(String TipoUsuario){
        return usuarioRepository.findByTipoUsuario(TipoUsuario);
    }
    public ArrayList<Usuario> obtenerUsuarioPorIdentificacion(String Identificacion){
        return usuarioRepository.findByIdentificacion(Identificacion);
    }

    public boolean eliminarUsuario(Integer Id){
        try{
            usuarioRepository.deleteById(Id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
