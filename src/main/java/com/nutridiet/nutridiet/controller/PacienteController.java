package com.nutridiet.nutridiet.controller;
import com.nutridiet.nutridiet.entity.Paciente;
import com.nutridiet.nutridiet.service.PacienteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping("/pacientes")
public class PacienteController {
    private final PacienteService pacienteService;
    public PacienteController(PacienteService pacienteService){
        this.pacienteService = pacienteService;
    }
    
    @PostMapping 
    public Paciente salvar(@RequestBody Paciente paciente){
        return pacienteService.salvar(paciente);
    }

     @GetMapping
    public List<Paciente> listar() {
        return pacienteService.listar();
    }
}
