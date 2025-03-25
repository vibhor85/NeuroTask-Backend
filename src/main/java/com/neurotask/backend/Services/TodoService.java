package com.neurotask.backend.Services;

import com.neurotask.backend.DTOs.TodoDTO;
import com.neurotask.backend.Entity.TodoList;
import com.neurotask.backend.Mapper.TodoMapper;
import com.neurotask.backend.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private TodoMapper todoMapper;

    public TodoDTO createTask(TodoDTO todoDTO) {
        TodoList todo = todoMapper.toEntity(todoDTO);
        return todoMapper.toDto(todoRepository.save(todo));
    }

    public List<TodoDTO> getAllTasks() {
        return todoMapper.toDTOList(todoRepository.findAll());
    }

}
