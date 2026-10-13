package com.nutridiet.nutridiet.controller;
import com.nutridiet.nutridiet.entity.Refeicao;
import com.nutridiet.nutridiet.service.RefeicaoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping ("/refeicoes")
public class RefeicaoController {
    private final RefeicaoService refeicaoService;

    public RefeicaoController(RefeicaoService refeicaoService){
        this.refeicaoService = refeicaoService;
    }
    @PostMapping 
    public Refeicao salvar(@RequestBody Refeicao refeicao){
        return refeicaoService.salvar(refeicao);
    }
     @GetMapping
    public List<Refeicao> listar() {
        return refeicaoService.listar();
    }
    @GetMapping ("/dieta/{dietaId}")
    public List<Refeicao> listarPorDieta(@PathVariable Long dietaId){
        return refeicaoService.listarPorDieta(dietaId);
    }
    
}
