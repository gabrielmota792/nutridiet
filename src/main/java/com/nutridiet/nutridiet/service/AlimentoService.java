package com.nutridiet.nutridiet.service;
import com.nutridiet.nutridiet.entity.Alimento;
import com.nutridiet.nutridiet.repository.AlimentoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service 
public class AlimentoService {
    private final AlimentoRepository alimentoRepository;
    public AlimentoService(AlimentoRepository alimentoRepository){
        this.alimentoRepository = alimentoRepository;
    }
    public Alimento salvar(Alimento alimento){
        return alimentoRepository.save(alimento);
    }
    public List<Alimento> listar(){
        return alimentoRepository.findAll();
    }
    
}
