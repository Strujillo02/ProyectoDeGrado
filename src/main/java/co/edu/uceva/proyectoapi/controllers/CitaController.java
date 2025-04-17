package co.edu.uceva.proyectoapi.controllers;

import co.edu.uceva.proyectoapi.models.Cita;
import co.edu.uceva.proyectoapi.services.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/cita")

public class CitaController {
    @Autowired
    CitaService citaService;

    @GetMapping()
    public ArrayList<Cita> obtenerCitas(){
        return citaService.obtenerCitas();
    }

    @PostMapping()
    public Cita guardarCita(@RequestBody Cita cita){
        return this.citaService.guardarCita(cita);
    }

    @GetMapping(path = "/{id}")
    public Optional<Cita> obtenerCitaPorId(@PathVariable("id") Integer id){
        return this.citaService.obtenerCitaPorId(id);
    }

//    @GetMapping("/query")
//    public ArrayList<Usuario> obtenerUsuariosPorTipo(@RequestParam("tipoUsuario") String TipoUsuario){
//        return this.usuarioService.obtenerUsuarioPorTipoUsuario(TipoUsuario);
//    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.citaService.eliminarCita(id);
        if(ok){
            return "Cita eliminada exitosamente";
        }else{
            return "Cita no eliminada  con el id: "+ id;
        }
    }
}
