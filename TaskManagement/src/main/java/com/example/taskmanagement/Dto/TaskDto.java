package com.example.taskmanagement.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class TaskDto {
    @NotBlank(message = "Title cannot be blank")
    private String title;

    @Size(min = 5, max = 200, message = "Description must be between 5 and 200 characters")
    private String description;

    @NotNull(message = "Status cannot be null")
    private String status;

    // Getters and Setters
}