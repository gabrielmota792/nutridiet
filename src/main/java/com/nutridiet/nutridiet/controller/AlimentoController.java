package com.nutridiet.nutridiet.controller;
import com.nutridiet.nutridiet.entity.Alimento;
import com.nutridiet.nutridiet.service.AlimentoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping ("/alimentos")
public class AlimentoController {
    private final AlimentoService alimentoService;
    public AlimentoController(AlimentoService alimentoService){
        this.alimentoService = alimentoService;
    }
    @PostMapping 
    public Alimento salvar(@RequestBody Alimento alimento){
        return alimentoService.salvar(alimento);
    }

    @GetMapping 
    public List<Alimento> listar(){
        return alimentoService.listar();
    }
}
