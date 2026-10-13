package com.nutridiet.nutridiet.entity;
import jakarta.persistence.*;
import java.time.LocalTime;

@Entity 
@Table (
    name = "refeicao",
    uniqueConstraints = { 
        @UniqueConstraint (
            name = "uk_refeicao_dieta_ordem",
            columnNames = {"dieta_id", "ordem"}
        )
    }
)
public class Refeicao {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "dieta_id", nullable = false)
    private Dieta dieta;
    @Column (nullable = false, length = 100)
    private String nome;
    @Column (nullable = false)
    private Integer ordem;
    @Column 
    private LocalTime horario;

    public Refeicao(){}
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Dieta getDieta(){
        return dieta;
    }
    public void setDieta(Dieta dieta){
        this.dieta = dieta;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Integer getOrdem(){
        return ordem;
    }
    public void setOrdem(Integer ordem){
        this.ordem = ordem;
    }
    public LocalTime getHorario(){
        return horario;
    }
    public void setHorario(LocalTime horario){
        this.horario = horario;
    }
     
}
