package co.edu.uceva.proyectoapi.controllers;

import co.edu.uceva.proyectoapi.models.Medico;
import co.edu.uceva.proyectoapi.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/medico")

public class MedicoController {
    @Autowired
    MedicoService medicoService;

    @GetMapping()
    public ArrayList<Medico> obtenerMedicos(){
        return medicoService.obtenerMedicos();
    }

    @PostMapping()
    public Medico guardarMedico(@RequestBody Medico medico){
        return this.medicoService.guardarMedico(medico);
    }

    @GetMapping(path = "/{id}")
    public Optional<Medico> obtenerMedicoPorId(@PathVariable("id") Integer id){
        return this.medicoService.obtenerMedicoPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.medicoService.eliminarMedico(id);
        if(ok){
            return "Medico eliminado exitosamente";
        }else{
            return "Medicono se pudo borrar por id "+ id;
        }
    }
}
