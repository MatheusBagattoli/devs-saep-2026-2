package com.senai.solucao_agendamento_SA.services;

import com.senai.solucao_agendamento_SA.dtos.usuario.UsuarioLoginDto;
import com.senai.solucao_agendamento_SA.entities.UsuarioEntity;
import com.senai.solucao_agendamento_SA.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioEntity realizarLogin(UsuarioLoginDto login) {
        return usuarioRepository.findByEmailAndSenha(login.email(), login.senha())
                .orElseThrow(() -> new RuntimeException("Usuário ou senha incorreta!"));
    }
}
