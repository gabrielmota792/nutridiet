package com.nutridiet.nutridiet.dto;
import java.math.BigDecimal;

public class AlimentoRefeicaoDTO {
    private Long dietaAlimentoId;
    private String alimento;
    private BigDecimal quantidadeGramas;
    private BigDecimal energiaKcal;
    private BigDecimal carboidrato;
    private BigDecimal proteina;
    private BigDecimal lipidios;
    private BigDecimal fibraAlimentar;
    
    public AlimentoRefeicaoDTO(
        Long dietaAlimentoId,
        String alimento,
        BigDecimal quantidadeGramas,
        BigDecimal energiaKcal,
        BigDecimal carboidrato,
        BigDecimal proteina,
        BigDecimal lipidios,
        BigDecimal fibraAlimentar
    ){
        this.dietaAlimentoId = dietaAlimentoId;
        this.alimento = alimento;
        this.quantidadeGramas = quantidadeGramas;
        this.energiaKcal = energiaKcal;
        this.carboidrato = carboidrato;
        this.proteina = proteina;
        this.lipidios = lipidios;
        this.fibraAlimentar = fibraAlimentar;
    }
    public Long getDietaAlimentoId(){
        return dietaAlimentoId;
    }
    public String getAlimento(){
        return alimento;
    }
    public BigDecimal getQuantidadeGramas(){
        return quantidadeGramas;
    }
    public BigDecimal getEnergiaKcal(){
        return energiaKcal;
    }
    public BigDecimal getCarboidrato(){
        return carboidrato;
    }
    public BigDecimal getProteina(){
        return proteina;
    }
    public BigDecimal getLipidios(){
        return lipidios;
    }
    public BigDecimal getFibraAlimentar(){
        return fibraAlimentar;
    }
    
}
