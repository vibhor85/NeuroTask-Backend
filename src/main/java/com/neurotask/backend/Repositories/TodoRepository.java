package com.neurotask.backend.Repositories;

import com.neurotask.backend.Entity.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoList, Long> {

}
