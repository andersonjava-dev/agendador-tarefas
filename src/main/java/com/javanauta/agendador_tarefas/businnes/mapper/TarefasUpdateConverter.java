package com.javanauta.agendador_tarefas.businnes.mapper;

import com.javanauta.agendador_tarefas.businnes.dto.TarefasDTO;
import com.javanauta.agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefasUpdateConverter {

    TarefasEntity updateTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity );
}
