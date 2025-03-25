package com.neurotask.backend.Mapper;

import com.neurotask.backend.DTOs.TodoDTO;
import com.neurotask.backend.Entity.TodoList;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface TodoMapper {
    TodoMapper INSTANCE = Mappers.getMapper(TodoMapper.class);

    TodoDTO toDto(TodoList todoList);
    TodoList toEntity(TodoDTO todoDTO);
    List<TodoDTO> toDTOList(List<TodoList> todos);
}
