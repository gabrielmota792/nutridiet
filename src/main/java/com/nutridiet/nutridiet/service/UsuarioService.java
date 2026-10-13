package com.nutridiet.nutridiet.service;
import com.nutridiet.nutridiet.entity.Usuario;
import com.nutridiet.nutridiet.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service 
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    
    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }
}
