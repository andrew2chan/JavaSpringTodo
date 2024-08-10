package com.andrew2chan.javatodolist.services.impl;

import com.andrew2chan.javatodolist.domain.TodoEntity;
import com.andrew2chan.javatodolist.respositories.TodoRepository;
import com.andrew2chan.javatodolist.services.TodoService;
import org.springframework.stereotype.Service;

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
}
