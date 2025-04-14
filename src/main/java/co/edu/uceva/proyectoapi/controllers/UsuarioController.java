package controllers;

import models.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.UsuarioService;

import java.util.ArrayList;

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
}
