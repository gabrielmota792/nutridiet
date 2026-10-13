package com.nutridiet.nutridiet.repository;
import com.nutridiet.nutridiet.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    
}
