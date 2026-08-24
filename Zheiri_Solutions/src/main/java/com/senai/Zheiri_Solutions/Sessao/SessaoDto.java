package com.senai.Zheiri_Solutions.Sessao;

import com.senai.Zheiri_Solutions.entitys.NivelAcesso;

public record SessaoDto(

        Long usuarioId,
        String nome,
        NivelAcesso nivelAcesso

) {
}
