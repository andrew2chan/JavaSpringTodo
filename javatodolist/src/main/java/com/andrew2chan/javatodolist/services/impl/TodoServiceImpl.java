package com.andrew2chan.javatodolist.services.impl;

import com.andrew2chan.javatodolist.domain.TodoEntity;
import com.andrew2chan.javatodolist.domain.UserEntity;
import com.andrew2chan.javatodolist.respositories.TodoRepository;
import com.andrew2chan.javatodolist.respositories.UserRepository;
import com.andrew2chan.javatodolist.services.TodoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TodoServiceImpl implements TodoService {
    private TodoRepository todoRepository;
    private UserRepository userRepository;

    public TodoServiceImpl(TodoRepository todoRepository, UserRepository userRepository) {
        this.todoRepository = todoRepository;
        this.userRepository = userRepository;
    }

    @Override
    public TodoEntity createTodo(TodoEntity todo) {
        UserEntity userEntity = todo.getUsername();
        if(userRepository.findById(userEntity.getUsername()).isPresent()) {
            todo.setUsername(userRepository.findById(userEntity.getUsername()).get());
        }

        return todoRepository.save(todo);
    }

    @Override
    public List<TodoEntity> getAllTodos() {
        return StreamSupport.stream(todoRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
