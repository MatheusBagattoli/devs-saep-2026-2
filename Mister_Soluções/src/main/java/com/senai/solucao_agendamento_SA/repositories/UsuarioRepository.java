package com.senai.solucao_agendamento_SA.repositories;

import com.senai.solucao_agendamento_SA.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    Optional<UsuarioEntity> findByEmailAndSenha(String email, String senha);
}
