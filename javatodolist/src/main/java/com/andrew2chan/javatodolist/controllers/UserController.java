package com.andrew2chan.javatodolist.controllers;

import com.andrew2chan.javatodolist.domain.UserEntity;
import com.andrew2chan.javatodolist.domain.dto.UserDTO;
import com.andrew2chan.javatodolist.mappers.TodoMapper;
import com.andrew2chan.javatodolist.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {
    private UserService userService;
    private TodoMapper<UserEntity, UserDTO> mapper;

    public UserController(UserService userService, TodoMapper<UserEntity, UserDTO> mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @GetMapping(path = "/users")
    public List<UserDTO> getUsers() {
        List<UserEntity> userEntities = userService.getUsers();

        return userEntities.stream().map(mapper::mapTo).collect(Collectors.toList());
    }
}
