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
}
