package com.andrew2chan.javatodolist.services;

import com.andrew2chan.javatodolist.domain.TodoEntity;

public interface TodoService {
    TodoEntity createTodo(TodoEntity todo);
}
