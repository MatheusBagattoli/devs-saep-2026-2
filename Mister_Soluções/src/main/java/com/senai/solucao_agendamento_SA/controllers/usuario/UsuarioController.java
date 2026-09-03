package com.senai.solucao_agendamento_SA.controllers.usuario;

import com.senai.solucao_agendamento_SA.dtos.usuario.UsuarioLoginDto;
import com.senai.solucao_agendamento_SA.entities.UsuarioEntity;
import com.senai.solucao_agendamento_SA.services.UsuarioService;
import com.senai.solucao_agendamento_SA.sessao.SessaoDto;
import com.senai.solucao_agendamento_SA.sessao.SessaoUtil;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/login")
    public String realizarLogin(UsuarioLoginDto login, Model model, HttpSession session) {
        try {
            UsuarioEntity usuario = usuarioService.realizarLogin(login);
            SessaoUtil.logar(session, new SessaoDto(
                    usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getMatricula()
            ));
            return "redirect:/home";
        } catch (Exception e) {
            model.addAttribute("erro", e.getMessage());
            return "login";
        }
    }
}
