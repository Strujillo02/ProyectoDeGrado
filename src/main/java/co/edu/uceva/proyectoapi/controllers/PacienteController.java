package co.edu.uceva.proyectoapi.controllers;

import co.edu.uceva.proyectoapi.models.Paciente;
import co.edu.uceva.proyectoapi.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/paciente")

public class PacienteController {
    @Autowired
    PacienteService pacienteService;

    @GetMapping()
    public ArrayList<Paciente> obtenerPacientes(){

        return pacienteService.obtenerPacientes();
    }

    @PostMapping()
    public Paciente guardarPaciente(@RequestBody Paciente paciente){
        return this.pacienteService.guardarPaciente(paciente);
    }

    @GetMapping(path = "/{id}")
    public Optional<Paciente> obtenerPacientesPorId(@PathVariable("id") Integer id){
        return this.pacienteService.obtenerPacientePorId(id);
    }

//    @GetMapping("/query")
//    public ArrayList<Usuario> obtenerUsuariosPorTipo(@RequestParam("tipoUsuario") String TipoUsuario){
//        return this.usuarioService.obtenerUsuarioPorTipoUsuario(TipoUsuario);
//    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.pacienteService.eliminarPaciente(id);
        if(ok){
            return "Usuario eliminado exitosamente";
        }else{
            return "Usuario no eliminado con id "+ id;
        }
    }
}
