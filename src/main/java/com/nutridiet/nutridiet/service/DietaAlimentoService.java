package com.nutridiet.nutridiet.service;
import com.nutridiet.nutridiet.entity.Alimento;
import com.nutridiet.nutridiet.entity.DietaAlimento;
import com.nutridiet.nutridiet.entity.Refeicao;
import com.nutridiet.nutridiet.repository.AlimentoRepository;
import com.nutridiet.nutridiet.repository.DietaAlimentoRepository;
import com.nutridiet.nutridiet.repository.RefeicaoRepository;
import com.nutridiet.nutridiet.dto.AlimentoRefeicaoDTO;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import java.util.List;

@Service 
public class DietaAlimentoService {
    private final DietaAlimentoRepository dietaAlimentoRepository;
    private final RefeicaoRepository refeicaoRepository;
    private final AlimentoRepository alimentoRepository;
    private final CalculoNutricionalService calculoNutricionalService;
            
    
    public DietaAlimentoService(
        DietaAlimentoRepository dietaAlimentoRepository,
        RefeicaoRepository refeicaoRepository,
        AlimentoRepository alimentoRepository,
        CalculoNutricionalService calculoNutricionalService){
    this.dietaAlimentoRepository = dietaAlimentoRepository;
    this.refeicaoRepository =refeicaoRepository;
    this.alimentoRepository = alimentoRepository;
    this.calculoNutricionalService = calculoNutricionalService;
    }

    public DietaAlimento salvar(DietaAlimento dietaAlimento){
        if (dietaAlimento.getRefeicao() == null
        || dietaAlimento.getRefeicao().getId() == null){
            throw new RuntimeException("Informe o ID da refeição");
        }
        if (dietaAlimento.getAlimento() == null
        || dietaAlimento.getAlimento().getId() == null){
            throw new RuntimeException("Informe o ID do alimento");            
        }
        if (dietaAlimento.getQuantidadeGramas() == null
        || dietaAlimento.getQuantidadeGramas().signum() <= 0){
            throw new RuntimeException("A quantidade deve ser maior que zero");
        }
        Long refeicaoId = dietaAlimento.getRefeicao().getId();
        Long alimentoId = dietaAlimento.getAlimento().getId(); 

        Refeicao refeicao = refeicaoRepository.findById(refeicaoId).orElseThrow(
            () -> new RuntimeException("Refeição não encontrada"));

        Alimento alimento = alimentoRepository.findById(alimentoId).orElseThrow(
            ()-> new RuntimeException("Alimento não encontrado"));

        dietaAlimento.setRefeicao(refeicao);
        dietaAlimento.setAlimento(alimento);
        
        return dietaAlimentoRepository.save(dietaAlimento);
    }

    public List<DietaAlimento> listar(){
        return dietaAlimentoRepository.findAll();
    }
    public List<DietaAlimento> listarPorRefeicao(Long refeicaoId){
        if (!refeicaoRepository.existsById(refeicaoId)){
            throw new RuntimeException("Refeição não encontrada");
        }
        return dietaAlimentoRepository.findByRefeicaoId(refeicaoId);
    }
    public List<AlimentoRefeicaoDTO> listarPorRefeicaoComNutrientes(Long refeicaoId){
        List<DietaAlimento> itens = listarPorRefeicao(refeicaoId);
        List<AlimentoRefeicaoDTO> resultado = new ArrayList<>();
        for (DietaAlimento item : itens){
            Alimento alimento = item.getAlimento();
            var quantidade = item.getQuantidadeGramas();

            AlimentoRefeicaoDTO dto = new AlimentoRefeicaoDTO(
                item.getId(),
                alimento.getNome(),
                quantidade,
                calculoNutricionalService.calcularCalorias(alimento, quantidade),
                calculoNutricionalService.calcularCarboidrato(alimento, quantidade),
                calculoNutricionalService.calcularProteina(alimento, quantidade),
                calculoNutricionalService.calcularLipidios(alimento, quantidade),
                calculoNutricionalService.calcularFibras(alimento, quantidade)
            );
            resultado.add(dto);
        }
        return resultado;
    }

    
}
