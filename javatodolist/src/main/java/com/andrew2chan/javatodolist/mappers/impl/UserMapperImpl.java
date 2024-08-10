package com.andrew2chan.javatodolist.mappers.impl;

import com.andrew2chan.javatodolist.domain.UserEntity;
import com.andrew2chan.javatodolist.domain.dto.UserDTO;
import com.andrew2chan.javatodolist.mappers.TodoMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements TodoMapper<UserEntity, UserDTO> {
    private ModelMapper mapper;

    public UserMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public UserDTO mapTo(UserEntity userEntity) {
        return mapper.map(userEntity, UserDTO.class);
    }

    @Override
    public UserEntity mapFrom(UserDTO userDTO) {
        return mapper.map(userDTO, UserEntity.class);
    }
}
