package com.neurotask.backend.DTOs;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoDTO {
    private Long id;
    private String taskName;
    private String status;
    private Integer priority;
    private LocalDateTime dueDate;
    private LocalDateTime createdAt;
}
