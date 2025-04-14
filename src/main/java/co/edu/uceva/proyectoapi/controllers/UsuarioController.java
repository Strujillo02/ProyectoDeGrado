package co.edu.uceva.proyectoapi.controllers;

import co.edu.uceva.proyectoapi.models.Usuarios;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.edu.uceva.proyectoapi.services.UsuarioService;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<Usuarios> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public Usuarios guardarUsuario(@RequestBody Usuarios usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<Usuarios> obtenerUsuarioPorId(@PathVariable("id") Integer id){
        return this.usuarioService.obtenerUsuarioPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<Usuarios> obtenerUsuariosPorTipo(@RequestParam("tipoUsuario") String TipoUsuario){
        return this.usuarioService.obtenerUsuarioPorTipoUsuario(TipoUsuario);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if(ok){
            return "Usuario eliminado exitosamente";
        }else{
            return "Usuario no eliminado con id "+ id;
        }
    }
}
