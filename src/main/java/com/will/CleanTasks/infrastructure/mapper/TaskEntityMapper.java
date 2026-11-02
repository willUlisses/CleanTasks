package com.will.CleanTasks.infrastructure.mapper;

import com.will.CleanTasks.core.entities.Task;
import com.will.CleanTasks.infrastructure.persistence.TaskEntity;


public record TaskMapper() {

    public static TaskEntity toEntity(Task task) {
        return new TaskEntity(
                task.title(),
                task.description(),
                task.isCompleted(),
                task.createdAt(),
                task.user()
        );
    }

    public static 



}
