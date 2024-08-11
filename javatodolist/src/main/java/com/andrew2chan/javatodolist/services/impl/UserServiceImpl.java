package com.andrew2chan.javatodolist.services.impl;

import com.andrew2chan.javatodolist.domain.UserEntity;
import com.andrew2chan.javatodolist.respositories.UserRepository;
import com.andrew2chan.javatodolist.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity getUser(UserEntity userEntity) {
        return null;
    }
}
