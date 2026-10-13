package com.nutridiet.nutridiet.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity 
@Table(name = "usuario")
public class Usuario {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, unique = true, length =150)
    private String email;

    @Column(nullable = false, length = 255)
    private String senha;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoUsuario tipo;

    @Column (name= "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;

    public Usuario(){}

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

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;

    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha =  senha;
    }

    public TipoUsuario getTipo(){
        return tipo;
    }

    public void setTipe(TipoUsuario tipo){
        this.tipo = tipo;
    }

    @PrePersist 
    public void PrePersist(){
        if (dataCadastro ==  null){
            dataCadastro = LocalDateTime.now();
        }
    }

    public LocalDateTime getDataCadastro(){
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro){
        this.dataCadastro = dataCadastro;
    }

}
