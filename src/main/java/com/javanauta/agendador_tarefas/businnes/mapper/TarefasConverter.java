package com.javanauta.agendador_tarefas.businnes.mapper;

import com.javanauta.agendador_tarefas.businnes.dto.TarefasDTO;
import com.javanauta.agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "dataCriacao", target = "dataCriacao")
    @Mapping(source = "dataEvento", target = "dataEvento")


    TarefasEntity paraTarefaEntity(TarefasDTO dto);


    TarefasDTO paraTarefaDTO(TarefasEntity entity);

    List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> entity);

    List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dto);

}

