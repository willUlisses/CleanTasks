package com.will.CleanTasks.infrastructure.mapper;

import com.will.CleanTasks.core.entities.User;
import com.will.CleanTasks.infrastructure.persistence.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserEntityMapper {

    public UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        entity.setId(user.id());
        entity.setEmail(user.email());
        entity.setPassword(user.password());
        return entity;
    }

    public User toDomain(UserEntity entity) {
        return new User(
                entity.getId(),
                entity.getEmail(),
                entity.getPassword()
        );
    }
}