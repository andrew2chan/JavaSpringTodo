package com.andrew2chan.javatodolist.services;

import com.andrew2chan.javatodolist.domain.TodoEntity;

import java.util.List;

public interface TodoService {
    TodoEntity createTodo(TodoEntity todo);
    List<TodoEntity> getAllTodos();
    void deleteTodo(Long id);
}
