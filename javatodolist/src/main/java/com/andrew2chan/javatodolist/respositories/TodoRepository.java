package com.andrew2chan.javatodolist.respositories;

import com.andrew2chan.javatodolist.domain.TodoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<TodoEntity, Long> {
}
