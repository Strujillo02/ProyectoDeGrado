package co.edu.uceva.proyectoapi.controllers;

import co.edu.uceva.proyectoapi.models.Especialidad;
import co.edu.uceva.proyectoapi.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.edu.uceva.proyectoapi.services.EspecialidadService;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {
    @Autowired
    EspecialidadService especialidadService;

    @GetMapping
    public ArrayList<Especialidad> obtenerEspecialidades(){
        return especialidadService.obtenerEspecialidades();
    }


    @PostMapping()
    public Especialidad guardarEspecialidad(@RequestBody Especialidad especialidad){
        return this.especialidadService.guardarEspecialidad(especialidad);
    }

    @GetMapping(path = "/{id}")
    public Optional<Especialidad> obtenerEspecialidadPorId(@PathVariable("id") Integer id){
        return this.especialidadService.obtenerEspecialidadPorId(id);
    }


    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.especialidadService.eliminarEspecialidad(id);
        if(ok){
            return "Especialidad eliminada exitosamente";
        }else{
            return "Especialidad no eliminado con id "+ id;
        }
    }
}
