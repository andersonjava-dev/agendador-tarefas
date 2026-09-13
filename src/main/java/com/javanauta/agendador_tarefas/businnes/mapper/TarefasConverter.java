package com.javanauta.agendador_tarefas.businnes.mapper;

import com.javanauta.agendador_tarefas.businnes.dto.TarefasDTO;
import com.javanauta.agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {


    TarefasEntity paraTarefaEntity(TarefasDTO dto);


    TarefasDTO paraTarefaDTO (TarefasEntity entity);
}