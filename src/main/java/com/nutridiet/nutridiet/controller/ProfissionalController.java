package com.nutridiet.nutridiet.controller;
import com.nutridiet.nutridiet.entity.Profissional;
import com.nutridiet.nutridiet.service.ProfissionalService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping("/profissionais")
public class ProfissionalController {
    private final ProfissionalService profissionalService;
    public ProfissionalController(ProfissionalService profissionalService){
        this.profissionalService = profissionalService;
    }

@PostMapping 
public Profissional salvar(@RequestBody Profissional profissional){
    return profissionalService.salvar(profissional);
}

@GetMapping 
public List<Profissional> listar(){
    return profissionalService.listar();
}
    
}
