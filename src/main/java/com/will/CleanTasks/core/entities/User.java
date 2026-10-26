package com.will.CleanTasks.core.entities;

import java.util.List;

public record User(
        Long id,
        String email,
        String password,
        List<Task> tasks
) {
}
