package com.nutridiet.nutridiet.controller;
import com.nutridiet.nutridiet.entity.Usuario;
import com.nutridiet.nutridiet.service.UsuarioService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService; 
    
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping 
    public Usuario salvar(@RequestBody Usuario usuario){
        return usuarioService.salvar(usuario);
    }
    
    @GetMapping 
    public List<Usuario> listar(){
        return usuarioService.listar();
    }
}
