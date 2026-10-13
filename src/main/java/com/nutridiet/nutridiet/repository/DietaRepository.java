package com.nutridiet.nutridiet.repository;
import com.nutridiet.nutridiet.entity.Dieta;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DietaRepository extends JpaRepository<Dieta, Long> {
    
}
