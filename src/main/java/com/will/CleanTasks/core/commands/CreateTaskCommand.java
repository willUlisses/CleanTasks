package com.will.CleanTasks.core.commands;

public record CreateTaskCommand(String title, String description, Long userId) {
}
