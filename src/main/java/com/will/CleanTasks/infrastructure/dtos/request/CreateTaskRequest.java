package com.will.CleanTasks.infrastructure.dtos.request;

public record CreateTaskRequest(
        String title,
        String description
) {
}
