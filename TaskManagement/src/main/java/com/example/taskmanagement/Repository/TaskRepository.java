package com.example.taskmanagement.Repository;

import com.example.taskmanagement.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}