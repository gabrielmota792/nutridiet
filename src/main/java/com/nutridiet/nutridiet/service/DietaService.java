package com.nutridiet.nutridiet.service;
import com.nutridiet.nutridiet.entity.Dieta;
import com.nutridiet.nutridiet.entity.Paciente;
import com.nutridiet.nutridiet.repository.DietaRepository;
import com.nutridiet.nutridiet.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service 
public class DietaService {
    private final DietaRepository dietaRepository;
    private final PacienteRepository pacienteRepository;

    public DietaService(
        DietaRepository dietaRepository,
        PacienteRepository pacienteRepository){
            this.dietaRepository = dietaRepository;
            this.pacienteRepository = pacienteRepository;
        }

    public Dieta salvar(Dieta dieta){
        Long pacienteId = dieta.getPaciente().getId();
        Paciente paciente = pacienteRepository.findById(pacienteId)
            .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
        dieta.setPaciente(paciente);
        return dietaRepository.save(dieta);    
    }
    public List<Dieta> listar(){
        return dietaRepository.findAll();
    }
}
