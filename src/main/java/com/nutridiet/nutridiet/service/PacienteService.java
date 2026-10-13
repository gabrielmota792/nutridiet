package com.nutridiet.nutridiet.service;
import com.nutridiet.nutridiet.entity.Paciente;
import com.nutridiet.nutridiet.entity.Usuario;
import com.nutridiet.nutridiet.repository.PacienteRepository;
import com.nutridiet.nutridiet.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service 
public class PacienteService{
    private final PacienteRepository pacienteRepository;
    private final UsuarioRepository usuarioRepository;

    public PacienteService(
        PacienteRepository pacienteRepository,
        UsuarioRepository usuarioRepository){
            this.pacienteRepository = pacienteRepository;
            this.usuarioRepository = usuarioRepository;
        }
    
    public Paciente salvar(Paciente paciente){
        Long usuarioId = paciente.getUsuario().getId();
        Usuario usuario = usuarioRepository.findById(usuarioId)
            .orElseThrow(() -> new RuntimeException("Usuário não econtrado"));
        paciente.setUsuario(usuario);
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> listar(){
        return pacienteRepository.findAll();
    }
}