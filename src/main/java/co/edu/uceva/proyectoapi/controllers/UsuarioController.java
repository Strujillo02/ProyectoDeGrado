package co.edu.uceva.proyectoapi.controllers;

import co.edu.uceva.proyectoapi.models.Usuario;
import co.edu.uceva.proyectoapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.edu.uceva.proyectoapi.services.UsuarioService;

import java.util.ArrayList;
import java.util.Optional;

@RestController
/*@RequestMapping("/usuario")

public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<Usuario> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<Usuario> obtenerUsuarioPorId(@PathVariable("id") Integer id) {
        return this.usuarioService.obtenerUsuarioPorId(id);
    }

    @GetMapping("/tipo-usuario")
    public ArrayList<Usuario> obtenerUsuariosPorTipo(@RequestParam("tipoUsuario") String TipoUsuario) {
        return this.usuarioService.obtenerUsuarioPorTipoUsuario(TipoUsuario);
    }
    @GetMapping("/identificacion")
    public ArrayList<Usuario> obtenerUsuariosPorIdentificacion(@RequestParam("identificacion") String identificacion){
        return this.usuarioService.obtenerUsuarioPorIdentificacion(identificacion);
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
}*/

public  class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/register")
    public Usuario Register(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @PostMapping("/login")
    public Usuario Login(@RequestBody Usuario usuario) {
        Usuario oldUSuario = usuarioRepository.findByTipoUsuarioAndContrasenaAndIdentificacion(usuario.getTipoUsuario(), usuario.getContrasena(), usuario.getIdentificacion());
        return oldUSuario;
    }
}
