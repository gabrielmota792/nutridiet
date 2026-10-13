package com.nutridiet.nutridiet.service;
import com.nutridiet.nutridiet.entity.Profissional;
import com.nutridiet.nutridiet.entity.Usuario;
import com.nutridiet.nutridiet.repository.ProfissionalRepository;
import com.nutridiet.nutridiet.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service 
public class ProfissionalService {
    
    private final ProfissionalRepository profissionalRepository;
    private final UsuarioRepository usuarioRepository;

    public ProfissionalService(
        ProfissionalRepository profissionalRepository,
        UsuarioRepository usuarioRepository){
            this.profissionalRepository = profissionalRepository;
            this.usuarioRepository = usuarioRepository;
        }
    public Profissional salvar(Profissional profissional){
        Long usuarioId = profissional.getUsuario().getId();
        Usuario usuario = usuarioRepository.findById(usuarioId)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        profissional.setUsuario(usuario);
        return profissionalRepository.save(profissional);
    }    
    public List<Profissional> listar(){
        return profissionalRepository.findAll();
    }
}
