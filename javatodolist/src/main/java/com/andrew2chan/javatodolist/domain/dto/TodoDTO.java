package com.andrew2chan.javatodolist.domain.dto;

import com.andrew2chan.javatodolist.domain.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoDTO {
    private Long id;
    private UserEntity username;
    private String todo;
}
