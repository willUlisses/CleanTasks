package com.will.CleanTasks.core.entities;

import java.time.LocalDate;

public record Task(
        Long id,
        String title,
        String description,
        boolean isCompleted,
        LocalDate createdAt,
        User user
) {



}
