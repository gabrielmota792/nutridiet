package com.nutridiet.nutridiet.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity 
@Table (name = "dieta_alimento")
public class DietaAlimento {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "refeicao_id", nullable = false)
    private Refeicao refeicao;
    
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "alimento_id", nullable = false)
    private Alimento alimento;

    @Column (name = "quantidade_gramas", nullable = false, precision = 10, scale = 2)
    private BigDecimal quantidadeGramas;

    @Column(name = "observacao", columnDefinition = "TEXT")
    private String observacoes;

    public DietaAlimento(){

    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Refeicao getRefeicao(){
        return refeicao;
    }
    public void setRefeicao(Refeicao refeicao){
        this.refeicao = refeicao;
    }
    public Alimento getAlimento(){
        return alimento;
    }
    public void setAlimento(Alimento alimento){
        this.alimento = alimento;
    }
    public BigDecimal getQuantidadeGramas(){
        return quantidadeGramas;
    }
    public void setQuantidadeGramas(BigDecimal quantidadeGramas){
        this.quantidadeGramas = quantidadeGramas;
    }
    public String getObservacao(){
        return observacoes;
    }
    public void setObservacoes(String observacao){
        this.observacoes = observacao;
    }
}
