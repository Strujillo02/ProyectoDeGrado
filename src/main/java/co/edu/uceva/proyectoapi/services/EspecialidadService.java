package co.edu.uceva.proyectoapi.services;

import co.edu.uceva.proyectoapi.models.Especialidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.uceva.proyectoapi.repositories.EspecialidadRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EspecialidadService {
    @Autowired
    EspecialidadRepository especialidadRepository;

    public ArrayList<Especialidad> obtenerEspecialidades(){
         return (ArrayList<Especialidad>) especialidadRepository.findAll();
    }

    public Especialidad guardarEspecialidad(Especialidad  especialidad){

        return especialidadRepository.save(especialidad);
    }

    public Optional<Especialidad> obtenerEspecialidadPorId(Integer Id){

        return especialidadRepository.findById(Id);
    }



    public boolean eliminarEspecialidad(Integer Id){
        try{
            especialidadRepository.deleteById(Id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
