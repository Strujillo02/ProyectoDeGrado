package co.edu.uceva.proyectoapi.services;

import co.edu.uceva.proyectoapi.models.Especialidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.uceva.proyectoapi.repositories.EspecialidadRepository;

import java.util.ArrayList;

@Service
public class EspecialidadService {
    @Autowired
    EspecialidadRepository especialidadRepository;

    public ArrayList<Especialidades> obtenerEspecialidades(){
         return (ArrayList<Especialidades>) especialidadRepository.findAll();
    }
}
