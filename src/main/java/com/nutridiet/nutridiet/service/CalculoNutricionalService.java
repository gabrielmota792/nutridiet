package com.nutridiet.nutridiet.service;
import com.nutridiet.nutridiet.entity.Alimento;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.stereotype.Service;

@Service
public class CalculoNutricionalService {
    
    public BigDecimal calcularPorGramas(
        BigDecimal valorPor100g,
        BigDecimal quantidadeGramas){
            if (valorPor100g == null || quantidadeGramas == null){
                return null;
            }
            return valorPor100g
                .multiply(quantidadeGramas)
                .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP );
        }
        public BigDecimal calcularCalorias(
            Alimento alimento,
            BigDecimal  quantidadeGramas
        ){
            return calcularPorGramas(alimento.getEnergiaKcal(), quantidadeGramas);
        }
        public BigDecimal calcularCarboidrato(
            Alimento alimento,
            BigDecimal quantidadeGramas
        ){
            return calcularPorGramas(alimento.getCarboidrato(), quantidadeGramas);
        }
        public BigDecimal calcularProteina(
            Alimento alimento,
            BigDecimal quantidadeGramas
        ){
           return calcularPorGramas(alimento.getProteina(), quantidadeGramas); 
        }
        public BigDecimal calcularLipidios(
            Alimento alimento,
            BigDecimal quantidadeGramas
        ){
            return calcularPorGramas(alimento.getLipidios(), quantidadeGramas);
        }
        public BigDecimal calcularFibras(
            Alimento alimento,
            BigDecimal quantidadeGramas 
        ){
            return calcularPorGramas(alimento.getFibraAlimentar(), quantidadeGramas);
        }
}
