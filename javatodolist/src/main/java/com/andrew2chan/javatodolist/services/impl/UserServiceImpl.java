package com.andrew2chan.javatodolist.services.impl;

import com.andrew2chan.javatodolist.domain.UserEntity;
import com.andrew2chan.javatodolist.respositories.UserRepository;
import com.andrew2chan.javatodolist.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> getUsers() {
        return StreamSupport
                .stream(userRepository.findAll().spliterator(), false).
                collect(Collectors.toList());
    }
}
