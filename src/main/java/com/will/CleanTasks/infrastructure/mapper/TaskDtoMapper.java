package com.will.CleanTasks.infrastructure.mapper;

import com.will.CleanTasks.core.commands.CreateTaskCommand;
import com.will.CleanTasks.core.entities.Task;
import com.will.CleanTasks.infrastructure.dtos.request.CreateTaskRequest;
import com.will.CleanTasks.infrastructure.dtos.response.TaskResponse;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoMapper {

    public static CreateTaskCommand toCommand(CreateTaskRequest request, Long userId) {
        return new CreateTaskCommand(
                request.title(),
                request.description(),
                userId
        );
    }

    public static TaskResponse toResponse(Task task) {
        return new TaskResponse(
                task.id(),
                task.title(),
                task.description(),
                task.isCompleted(),
                task.createdAt()
        );
    }
}
