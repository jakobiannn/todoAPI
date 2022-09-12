package com.example.jakSpringApp.repository;

import com.example.jakSpringApp.entity.TodoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> {
}
