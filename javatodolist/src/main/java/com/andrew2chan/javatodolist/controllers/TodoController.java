package com.andrew2chan.javatodolist.controllers;

import com.andrew2chan.javatodolist.domain.TodoEntity;
import com.andrew2chan.javatodolist.domain.dto.TodoDTO;
import com.andrew2chan.javatodolist.services.TodoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping(path = "/todo")
    public TodoDTO createTodo(@RequestBody TodoDTO todo) {
        return todoService.createTodo(todo);
    }
}
