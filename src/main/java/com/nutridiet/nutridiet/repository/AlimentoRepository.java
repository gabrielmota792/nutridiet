package com.nutridiet.nutridiet.repository;
import com.nutridiet.nutridiet.entity.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AlimentoRepository extends JpaRepository<Alimento, Long> {
    
}
