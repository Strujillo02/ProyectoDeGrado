package co.edu.uceva.proyectoapi.controllers;

import co.edu.uceva.proyectoapi.models.Especialidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.uceva.proyectoapi.services.EspecialidadService;

import java.util.ArrayList;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {
    @Autowired
    EspecialidadService especialidadService;

    @GetMapping
    public ArrayList<Especialidad> obtenerEspecialidades(){
        return especialidadService.obtenerEspecialidades();
    }
}
