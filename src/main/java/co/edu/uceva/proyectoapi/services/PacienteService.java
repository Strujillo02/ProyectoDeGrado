package co.edu.uceva.proyectoapi.services;

import co.edu.uceva.proyectoapi.models.Paciente;
import co.edu.uceva.proyectoapi.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;

    public ArrayList<Paciente> obtenerPacientes(){

        return (ArrayList<Paciente>) pacienteRepository.findAll();
    }

    public Paciente guardarPaciente(Paciente paciente){

        return pacienteRepository.save(paciente);
    }

    public Optional<Paciente> obtenerPacientePorId(Integer Id){

        return pacienteRepository.findById(Id);
    }

//    public ArrayList<Usuario> obtenerUsuarioPorTipoUsuario(String TipoUsuario){
//        return usuarioRepository.findByTipoUsuario(TipoUsuario);
//    }

    public boolean eliminarPaciente(Integer Id){
        try{
            pacienteRepository.deleteById(Id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
