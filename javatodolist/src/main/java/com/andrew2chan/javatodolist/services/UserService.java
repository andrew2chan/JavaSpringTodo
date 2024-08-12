package com.andrew2chan.javatodolist.services;

import com.andrew2chan.javatodolist.domain.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getUsers();
}
