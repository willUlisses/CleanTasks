package com.will.CleanTasks.infrastructure.presentation;

import com.will.CleanTasks.core.entities.Task;
import com.will.CleanTasks.core.usecases.CreateTaskCase;
import com.will.CleanTasks.infrastructure.dtos.request.CreateTaskRequest;
import com.will.CleanTasks.infrastructure.dtos.response.TaskResponse;
import com.will.CleanTasks.infrastructure.mapper.TaskDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final CreateTaskCase createTask;
    private final TaskDtoMapper dtoMapper;

    @PostMapping()
    public ResponseEntity<TaskResponse> createTask(@RequestBody CreateTaskRequest req) {
        Task newTask = createTask.execute(dtoMapper.toCommand(req, 1L));

        return new ResponseEntity<>(dtoMapper.toResponse(newTask), HttpStatus.CREATED);
    }

}
