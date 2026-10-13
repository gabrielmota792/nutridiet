package com.nutridiet.nutridiet.controller;
import com.nutridiet.nutridiet.entity.Dieta;
import com.nutridiet.nutridiet.service.DietaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping ("/dietas")
public class DietaController {
    private final DietaService dietaService;
    public DietaController(DietaService dietaService){
        this.dietaService = dietaService;
    }
    @PostMapping 
    public Dieta salvar(@RequestBody Dieta dieta){
        return dietaService.salvar(dieta);
    }
    @GetMapping 
    public List<Dieta> listar(){
        return dietaService.listar();
    }
}
