package com.nutridiet.nutridiet.entity;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity 
@Table (name = "dieta")
public class Dieta {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne 
    @JoinColumn (name = "paciente_id", nullable = false)
    private Paciente paciente;
    @Column (nullable = false, length = 150)
    private String nome;
    @Column (name = "data_inicio", nullable = false)
    private LocalDate dataInicio;
    @Column (name = "data_fim")
    private LocalDate dataFim;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusDieta status = StatusDieta.RASCUNHO;
    @Column (columnDefinition = "TEXT")
    private String observacoes;
    @Column (name = "data_criacao", nullable = false)
    private LocalDateTime dataCriacao;

    public Dieta(){}

    @PrePersist 
    public void prePersist(){
        if(dataCriacao == null){
            dataCriacao = LocalDateTime.now();
        }
        if(status == null){
            status = StatusDieta.RASCUNHO;
        }
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Paciente getPaciente() {
         return paciente;
    }
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public LocalDate getDataInicio(){
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio){
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataFim(){
        return dataFim;
    }
    public void setDataFim(LocalDate dataFim){
        this.dataFim = dataFim;
    }
    public StatusDieta getStauts(){
        return status;
    }
    public void setStatus(StatusDieta status){
        this.status = status;
    }
    public String getObservacoes(){
        return observacoes;
    }
    public void setStatus(String observacoes){
        this.observacoes = observacoes;
    }
    public LocalDateTime getDataCriacao(){
        return dataCriacao;
    }
    public void setDataCriacao(LocalDateTime dataCriacao){
        this.dataCriacao = dataCriacao;
    }
}
