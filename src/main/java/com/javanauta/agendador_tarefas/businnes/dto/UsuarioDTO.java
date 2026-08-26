package com.javanauta.agendador_tarefas.businnes.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {


    private String email;
    private String senha;

}
