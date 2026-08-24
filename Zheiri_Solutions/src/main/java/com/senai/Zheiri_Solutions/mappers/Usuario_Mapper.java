package com.senai.Zheiri_Solutions.mappers;

import com.senai.Zheiri_Solutions.dtos.UsuarioSaidaDto;
import com.senai.Zheiri_Solutions.entitys.UsuarioEntity;

public class Usuario_Mapper {

    //Converte Entity em Dto
    public static UsuarioSaidaDto entityParaDto(UsuarioEntity usuarioEntity) {
        return new UsuarioSaidaDto(
                usuarioEntity.getNome(),
                usuarioEntity.getNivelAcesso()
        );
    }

}
