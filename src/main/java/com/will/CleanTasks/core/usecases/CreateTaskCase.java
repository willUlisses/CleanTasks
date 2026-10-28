package com.will.CleanTasks.core.usecases;

import com.will.CleanTasks.core.entities.Task;

public interface CreateTaskCase {

    Task execute(Task task);

}
