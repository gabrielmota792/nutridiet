package com.nutridiet.nutridiet.repository;
import com.nutridiet.nutridiet.entity.Refeicao;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RefeicaoRepository extends JpaRepository<Refeicao, Long> {
    List<Refeicao> findByDietaId(Long dietaId);
    
}
