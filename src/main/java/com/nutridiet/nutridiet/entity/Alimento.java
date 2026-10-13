package com.nutridiet.nutridiet.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity 
@Table (name = "alimento")
public class Alimento {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 200)
    private String nome;
    @Column(length = 200)
    private String categoria;
    @Column(name = "energia_kcal", precision = 10, scale = 2)
    private BigDecimal energiaKcal;
    @Column(name = "energia_kj", precision = 10, scale = 2)
    private BigDecimal energiaKj;
    @Column (precision = 10, scale = 2)
    private BigDecimal carboidrato;
    @Column (precision = 10, scale = 2)
    private BigDecimal proteina;
    @Column(precision = 10, scale = 2)
    private BigDecimal lipidios;
    @Column (name = "fibra_alimentar", precision = 10, scale = 2)
    private BigDecimal fibraAlimentar;
    @Column (precision = 10, scale = 2)
    private BigDecimal calcio;
    @Column (precision = 10, scale = 2)
    private BigDecimal ferro;
    @Column (precision = 10, scale = 2)
    private BigDecimal magnesio;
    @Column (precision = 10, scale = 2)
    private BigDecimal fosforo;
    @Column (precision = 10, scale = 2)
    private BigDecimal potassio;
    @Column (precision = 10, scale = 2)
    private BigDecimal sodio;
    @Column (precision = 10, scale = 2)
    private BigDecimal zinco;
    @Column (precision = 10, scale = 2)
    private BigDecimal cobre;
    @Column (name ="vitamina_a", precision = 10, scale = 2)
    private BigDecimal vitaminaA;
    @Column (name = "vitamina_b1", precision = 10, scale = 2)
    private BigDecimal vitaminaB1;
    @Column (name = "vitamina_b2", precision = 10, scale = 2)
    private BigDecimal vitaminaB2;
    @Column (name = "vitamina_b3", precision = 10, scale = 2)
    private BigDecimal vitaminaB3;
    @Column (name = "vitamina_b6", precision = 10, scale = 2)
    private BigDecimal vitaminaB6;
    @Column (name = "vitamina_b12", precision = 10, scale = 2)
    private BigDecimal vitaminaB12;
    @Column (name = "vitamina_c", precision = 10, scale = 2)
    private BigDecimal vitaminaC;
    @Column (name = "vitamina_d", precision = 10, scale = 2)
    private BigDecimal vitaminaD;
    @Column (name = "vitamina_e", precision = 10, scale = 2)
    private BigDecimal vitaminaE;
    @Column (name ="vitamina_k", precision = 10, scale = 2)
    private BigDecimal vitaminaK;
    @Column (length = 100)
    private String fonte;
    @Column(columnDefinition = "TEXT") 
    private String observacoes;
    @Column (name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;

    public Alimento(){}
    @PrePersist 
    public void prePersist(){
        if(dataCadastro == null){
            dataCadastro = LocalDateTime.now();
        }
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public BigDecimal getEnergiaKcal(){
        return energiaKcal;
    }
    public void setEnergiaKcal(BigDecimal energiaKcal){
        this.energiaKcal = energiaKcal;
    }
    public BigDecimal getEnergiaKj(){
        return energiaKj; 
    }
    public void setEnergiaKj(BigDecimal energiaKj){
        this.energiaKj = energiaKj;
    }
    public BigDecimal getCarboidrato(){
        return carboidrato;
    }
    public void setCarboidrato(BigDecimal carboidrato){
        this.carboidrato = carboidrato;
    }
    public BigDecimal getProteina(){
        return proteina;
    }
    public void setProteina(BigDecimal proteina){
        this.proteina = proteina;
    }
    public BigDecimal getLipidios(){
        return lipidios;
    }
    public void setLipidios(BigDecimal lipidios){
        this.lipidios = lipidios;
    }
    public BigDecimal getFibraAlimentar(){
        return fibraAlimentar;
    }
    public void setFibraAlimentar(BigDecimal fibraAlimentar){
        this.fibraAlimentar = fibraAlimentar;
    }
    public BigDecimal getCalcio(){
        return calcio;
    }
    public void setCalcio(BigDecimal calcio){
        this.calcio = calcio;
    }
    public BigDecimal getFerro(){
        return ferro;
    }
    public void setFerro(BigDecimal ferro){
        this.ferro = ferro;
    }
    public BigDecimal getMagnesio(){
        return magnesio;
    }
    public void setMagnesio(BigDecimal magnesio){
        this.magnesio =  magnesio;
    }
    public BigDecimal getFosforo(){
        return fosforo;
    }
    public void setFosforo(BigDecimal fosforo){
        this.fosforo = fosforo;
    }
    public BigDecimal getPotassio(){
        return potassio;
    }
    public void setPotassio(BigDecimal potassio){
        this.potassio = potassio;
    }
    public BigDecimal getSodio(){
        return sodio;
    }
    public void setSodio(BigDecimal sodio){
        this.sodio = sodio;
    }
    public BigDecimal getZinco(){
        return zinco;
    }
    public void setZinco(BigDecimal zinco){
        this.zinco = zinco;
    }
    public BigDecimal getCobre(){
        return cobre;
    }
    public void setCobre(BigDecimal cobre){
        this.cobre = cobre;
    }
    public BigDecimal getVitaminaA(){
        return vitaminaA;
    }
    public void setVitaminaA(BigDecimal vitaminaA){
        this.vitaminaA = vitaminaA;
    }
    public BigDecimal getVitaminaB1(){
        return vitaminaB1;
    }
    public void setVitaminaB1(BigDecimal vitaminaB1){
        this.vitaminaB1 = vitaminaB1;
    }
    public BigDecimal getVitaminaB2(){
        return vitaminaB2;
    }
    public void setVitaminaB2(BigDecimal vitaminaB2){
        this.vitaminaB2 = vitaminaB2;
    }
    public BigDecimal getVitaminaB3(){
        return vitaminaB3;
    }
    public void setVitaminaB3(BigDecimal vitaminaB3){
        this.vitaminaB3 = vitaminaB3;
    }
    public BigDecimal getVitaminaB6(){
        return vitaminaB6;
    }
    public void setVitaminaB6(BigDecimal vitaminaB6){
        this.vitaminaB6 = vitaminaB6;
    }
    public BigDecimal getVitaminaB12(){
        return vitaminaB12;
    }
    public void setVitaminaB12(BigDecimal vitaminaB12){
        this.vitaminaB12 = vitaminaB12;
    }
    public BigDecimal getVitaminaC(){
        return vitaminaC;
    }
    public void setVitaminaC(BigDecimal vitaminaC){
        this.vitaminaC = vitaminaC;
    }
    public BigDecimal getVitaminaD(){
        return vitaminaD;
    }
    public void setVitaminaD(BigDecimal vitaminaD){
        this.vitaminaD = vitaminaD;
    }
    public BigDecimal getVitaminaE(){
        return vitaminaE;
    }
    public void setVitaminaE(BigDecimal vitaminaE){
        this.vitaminaE = vitaminaE;
    }
    public BigDecimal getVitaminaK(){
    return vitaminaK;
    }
    public void setVitaminaK(BigDecimal vitaminaK){
        this.vitaminaK = vitaminaK;
    }
    public String getFonte(){
        return fonte;
    }
    public void setFonte(String fonte){
        this.fonte = fonte;
    }
    public String getObservacoes(){
        return observacoes;
    }
    public void setObservacoes(String observacoes){
        this.observacoes = observacoes;
    }
    public LocalDateTime getDataCadastro(){
        return dataCadastro;
    }
    public void setDataCadastro(LocalDateTime dataCadastro){
        this.dataCadastro = dataCadastro;
    }
}
