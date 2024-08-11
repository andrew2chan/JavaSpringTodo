package com.andrew2chan.javatodolist.services.impl;

import com.andrew2chan.javatodolist.domain.TodoEntity;
import com.andrew2chan.javatodolist.respositories.TodoRepository;
import com.andrew2chan.javatodolist.services.TodoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TodoServiceImpl implements TodoService {
    private TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public TodoEntity createTodo(TodoEntity todo) {
        return todoRepository.save(todo);
    }

    @Override
    public List<TodoEntity> getAllTodos() {
        return StreamSupport.stream(todoRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
