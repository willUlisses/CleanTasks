package com.will.CleanTasks.infrastructure.mapper;

import com.will.CleanTasks.core.entities.Task;
import com.will.CleanTasks.core.entities.User;
import com.will.CleanTasks.infrastructure.persistence.UserEntity;

import java.util.List;

public class UserEntityMapper {

    public static UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        entity.setId(user.id());
        entity.setEmail(user.email());
        entity.setPassword(user.password());
        return entity;
    }

    public static User toDomain(UserEntity entity) {
        List<Task> tasks = entity.getTasks() == null
                ? List.of()
                : entity.getTasks().stream()
                .map(TaskEntityMapper::toDomain)
                .toList();

        return new User(
                entity.getId(),
                entity.getEmail(),
                entity.getPassword(),
                tasks
        );
    }
}