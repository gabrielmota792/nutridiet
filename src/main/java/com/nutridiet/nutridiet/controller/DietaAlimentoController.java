package com.nutridiet.nutridiet.controller;
import com.nutridiet.nutridiet.entity.DietaAlimento;
import com.nutridiet.nutridiet.service.DietaAlimentoService;
import org.springframework.web.bind.annotation.*;
import com.nutridiet.nutridiet.dto.AlimentoRefeicaoDTO;
import java.util.List;

@RestController 
@RequestMapping ("/dieta-alimentos")
public class DietaAlimentoController {
    private final DietaAlimentoService dietaAlimentoService;
    public DietaAlimentoController(
        DietaAlimentoService dietaAlimentoService){
            this.dietaAlimentoService = dietaAlimentoService;
        }
    
    @PostMapping 
    public DietaAlimento salvar(
        @RequestBody DietaAlimento dietaAlimento){
            return dietaAlimentoService.salvar(dietaAlimento);
        }

    @GetMapping ("/refeicao/{refeicaoId}")
    public List<DietaAlimento> listarPorRefeicao(
        @PathVariable Long refeicaoId
    ){
        return dietaAlimentoService.listarPorRefeicao(refeicaoId);
    }

    @GetMapping ("/refeicao/{refeicaoId}/nutrientes")
    public List<AlimentoRefeicaoDTO> listarPorRefeicaoComNutrientes(
        @PathVariable Long refeicaoId
    ){
        return dietaAlimentoService.listarPorRefeicaoComNutrientes(refeicaoId);
    }
    
}
