package com.senai.Zheiri_Solutions.dtos;

import com.senai.Zheiri_Solutions.entitys.NivelAcesso;

public record UsuarioSaidaDto(

        String nome,
        NivelAcesso nivelAcesso
) {
}
