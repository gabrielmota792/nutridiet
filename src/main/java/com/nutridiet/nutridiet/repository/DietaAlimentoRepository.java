package com.nutridiet.nutridiet.repository;
import com.nutridiet.nutridiet.entity.DietaAlimento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DietaAlimentoRepository extends JpaRepository<DietaAlimento, Long> {
    List<DietaAlimento> findByRefeicaoId(Long refeicaoId);
    
}
