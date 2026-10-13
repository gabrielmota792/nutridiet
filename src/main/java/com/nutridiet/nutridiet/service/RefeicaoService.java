package com.nutridiet.nutridiet.service;
import com.nutridiet.nutridiet.entity.Dieta;
import com.nutridiet.nutridiet.entity.Refeicao;
import com.nutridiet.nutridiet.repository.DietaRepository;
import com.nutridiet.nutridiet.repository.RefeicaoRepository;
import org.springframework.stereotype.Service;
import java.util.List;



@Service 
public class RefeicaoService {
    private final RefeicaoRepository refeicaoRepository;
    private final DietaRepository dietaRepository;

    public RefeicaoService(
        RefeicaoRepository refeicaoRepository,
        DietaRepository dietaRepository){
            this.refeicaoRepository = refeicaoRepository;
            this.dietaRepository = dietaRepository;
        }
    public Refeicao salvar(Refeicao refeicao){
        if(refeicao.getDieta() == null ||
                refeicao.getDieta().getId() == null){
                    throw new RuntimeException("Informe o ID da dieta");
                }
    Long dietaId = refeicao.getDieta().getId();
    Dieta dieta = dietaRepository.findById(dietaId).orElseThrow(() -> new RuntimeException("Dieta não encontrada"));

    refeicao.setDieta(dieta);
    return refeicaoRepository.save(refeicao);
    }
    public List<Refeicao> listar(){
        return refeicaoRepository.findAll();
    }
    public List<Refeicao> listarPorDieta(Long dietaId){
        if(!dietaRepository.existsById(dietaId)){
            throw new RuntimeException("Dieta não encontrada");
        }
    return refeicaoRepository.findByDietaId(dietaId);
    }
}
