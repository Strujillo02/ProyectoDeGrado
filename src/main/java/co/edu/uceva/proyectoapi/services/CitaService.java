package co.edu.uceva.proyectoapi.services;

import co.edu.uceva.proyectoapi.models.Cita;
import co.edu.uceva.proyectoapi.repositories.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CitaService {
    @Autowired
    CitaRepository citaRepository;

    public ArrayList<Cita> obtenerCitas(){
        return (ArrayList<Cita>) citaRepository.findAll();
    }

    public Cita guardarCita(Cita cita){

        return citaRepository.save(cita);
    }

    public Optional<Cita> obtenerCitaPorId(Integer Id){

        return citaRepository.findById(Id);
    }



    public boolean eliminarCita(Integer Id){
        try{
            citaRepository.deleteById(Id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
