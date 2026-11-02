package com.will.CleanTasks.core.usecases;

import com.will.CleanTasks.core.commands.CreateTaskCommand;
import com.will.CleanTasks.core.entities.Task;

import java.time.LocalDate;

public class CreateTaskCaseImpl implements CreateTaskCase {

    @Override
    public Task execute(CreateTaskCommand cmd) {
        return new Task(
                null,
                cmd.title(),
                cmd.description(),
                false,
                LocalDate.now(),
                cmd.userId()
        );
    }


}
