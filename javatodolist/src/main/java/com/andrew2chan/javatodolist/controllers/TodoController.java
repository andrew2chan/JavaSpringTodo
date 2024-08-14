package com.andrew2chan.javatodolist.controllers;

import com.andrew2chan.javatodolist.domain.TodoEntity;
import com.andrew2chan.javatodolist.domain.dto.TodoDTO;
import com.andrew2chan.javatodolist.mappers.TodoMapper;
import com.andrew2chan.javatodolist.services.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TodoController {

    private TodoService todoService;
    private TodoMapper<TodoEntity, TodoDTO> mapper;

    public TodoController(TodoService todoService, TodoMapper<TodoEntity, TodoDTO> mapper) {
        this.todoService = todoService;
        this.mapper = mapper;
    }

    @PostMapping(path = "/todo")
    public ResponseEntity<TodoDTO> createTodo(@RequestBody TodoDTO todo) {
        TodoEntity todoEntity = mapper.mapFrom(todo);
        TodoEntity savedEntity = todoService.createTodo(todoEntity);
        TodoDTO todoDTO = mapper.mapTo(savedEntity);

        return new ResponseEntity<>(todoDTO, HttpStatus.CREATED);
    }

    @GetMapping(path = "/todo")
    public List<TodoDTO> getAllTodos() {
        List<TodoEntity> listOfTodos = todoService.getAllTodos();

        return listOfTodos.stream()
                .map(mapper::mapTo)
                .collect(Collectors.toList());

    }

    @DeleteMapping(path = "/todo/{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);

        return new ResponseEntity<>("Deleted", HttpStatus.NO_CONTENT);
    }
}
