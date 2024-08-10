package com.andrew2chan.javatodolist.mappers.impl;

import com.andrew2chan.javatodolist.domain.TodoEntity;
import com.andrew2chan.javatodolist.domain.dto.TodoDTO;
import com.andrew2chan.javatodolist.mappers.TodoMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TodoMapperImpl implements TodoMapper<TodoEntity, TodoDTO> {
    private ModelMapper mapper;

    public TodoMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public TodoDTO mapTo(TodoEntity todoEntity) {
        return mapper.map(todoEntity, TodoDTO.class);
    }

    @Override
    public TodoEntity mapFrom(TodoDTO todoDTO) {
        return mapper.map(todoDTO, TodoEntity.class);
    }
}
