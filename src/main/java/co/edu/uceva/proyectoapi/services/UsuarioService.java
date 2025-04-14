package co.edu.uceva.proyectoapi.services;

import co.edu.uceva.proyectoapi.models.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.uceva.proyectoapi.repositories.UsuarioRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Usuarios> obtenerUsuarios(){
        return (ArrayList<Usuarios>) usuarioRepository.findAll();
    }

    public Usuarios guardarUsuario(Usuarios usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuarios> obtenerUsuarioPorId(Integer Id){
        return usuarioRepository.findById(Id);
    }

    public ArrayList<Usuarios> obtenerUsuarioPorTipoUsuario(String TipoUsuario){
        return usuarioRepository.findByTipoUsuario(TipoUsuario);
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
