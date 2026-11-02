package com.will.CleanTasks.infrastructure.mapper;

import com.will.CleanTasks.core.entities.Task;
import com.will.CleanTasks.infrastructure.persistence.TaskEntity;
import com.will.CleanTasks.infrastructure.persistence.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskEntityMapper {

    public TaskEntity toEntity(Task task, UserEntity user) {
        return new TaskEntity(
                task.id(),
                task.title(),
                task.description(),
                task.isCompleted(),
                task.createdAt(),
                user
        );
    }

    public Task toDomain(TaskEntity entity) {
        return new Task(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.isCompleted(),
                entity.getCreatedAt(),
                entity.getUser().getId()
        );
    }



}
