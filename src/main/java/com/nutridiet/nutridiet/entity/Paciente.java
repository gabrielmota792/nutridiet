package com.nutridiet.nutridiet.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity 
@Table (name = "paciente")
public class Paciente {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne 
    @JoinColumn(name = "usuario_id", nullable = false, unique = true)
    private Usuario usuario;

    @Column (name = "data_nascimento")
    private LocalDate dataNascimento;

    @Enumerated (EnumType.STRING)
    private Sexo sexo;

    private BigDecimal altura;
    private BigDecimal peso;

    @Column (name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;

    public Paciente(){}
    
    @PrePersist 
    public void prePersist(){
        if (dataCadastro == null){
            dataCadastro = LocalDateTime.now();
        }
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo(){
        return sexo;
    }

    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getPeso(){
        return peso;
    }

    public void setPeso(BigDecimal peso){
        this.peso = peso;
    }

    public LocalDateTime getDataCadastro(){
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro){
        this.dataCadastro = dataCadastro;
    }
}
