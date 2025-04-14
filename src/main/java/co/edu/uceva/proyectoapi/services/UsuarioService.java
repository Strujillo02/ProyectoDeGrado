package co.edu.uceva.proyectoapi.services;

import co.edu.uceva.proyectoapi.models.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.uceva.proyectoapi.repositories.UsuarioRepository;

import java.util.ArrayList;

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
}
