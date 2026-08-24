package com.senai.Zheiri_Solutions.Controllers;

import com.senai.Zheiri_Solutions.Repository.UsuarioRepository;
import com.senai.Zheiri_Solutions.Sessao.SessaoDto;
import com.senai.Zheiri_Solutions.Sessao.SessaoUtil;
import com.senai.Zheiri_Solutions.entitys.UsuarioEntity;
import com.senai.Zheiri_Solutions.excecoes.ResourceNotFoundException;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioPageController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioPageController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/")
    public String index(){
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/home")
    public String home(Authentication authentication, Model model) {

        String email = authentication.getName();

        UsuarioEntity usuario = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado"));

        model.addAttribute("usuario", usuario);

        return "home";
    }

}
