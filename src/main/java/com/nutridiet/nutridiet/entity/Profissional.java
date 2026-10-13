package com.nutridiet.nutridiet.entity;
import jakarta.persistence.*;

@Entity 
@Table (name = "profissional")
public class Profissional {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne 
    @JoinColumn (name = "usuario_id", nullable = false, unique = true)
    private Usuario usuario;

    @Column (name = "registro_profissional", length = 50)
    private String registroProfiossional;

    public Profissional(){    }

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

    public String getRegistroProfissional(){
        return registroProfiossional;
    }

    public void setRegistroProfissional(String registroProfissional){
        this.registroProfiossional = registroProfissional;
    }
    
}
