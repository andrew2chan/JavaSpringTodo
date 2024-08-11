package com.andrew2chan.javatodolist.services;

import com.andrew2chan.javatodolist.domain.UserEntity;

public interface UserService {
    UserEntity createUser(UserEntity userEntity);
    UserEntity getUser(UserEntity userEntity);
}
