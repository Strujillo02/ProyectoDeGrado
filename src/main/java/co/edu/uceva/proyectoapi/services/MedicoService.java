package co.edu.uceva.proyectoapi.services;

import co.edu.uceva.proyectoapi.models.Medico;

import co.edu.uceva.proyectoapi.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MedicoService {
    @Autowired
    MedicoRepository medicoRepository;

    public ArrayList<Medico> obtenerMedicos(){
        return (ArrayList<Medico>) medicoRepository.findAll();
    }

    public Medico guardarMedico(Medico medico){

        return medicoRepository.save(medico);
    }

    public Optional<Medico> obtenerMedicoPorId(Integer Id){

        return  medicoRepository.findById(Id);
    }

    public boolean eliminarMedico(Integer Id){
        try{
            medicoRepository.deleteById(Id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
