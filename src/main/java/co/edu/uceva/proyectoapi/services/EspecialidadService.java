package co.edu.uceva.proyectoapi.services;

import co.edu.uceva.proyectoapi.models.Especialidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.uceva.proyectoapi.repositories.EspecialidadRepository;

import java.util.ArrayList;

@Service
public class EspecialidadService {
    @Autowired
    EspecialidadRepository especialidadRepository;

    public ArrayList<Especialidad> obtenerEspecialidades(){
         return (ArrayList<Especialidad>) especialidadRepository.findAll();
    }
}
