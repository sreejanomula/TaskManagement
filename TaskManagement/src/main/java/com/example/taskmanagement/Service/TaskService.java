package com.example.taskmanagement.Service;


import com.example.taskmanagement.Entity.Task;
import com.example.taskmanagement.Repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

        public Task createTask(Task task) {
            return taskRepository.save(task);
        }

        public Optional<Task> getTaskById(Long id) {
            return taskRepository.findById(id);
        }

        public List<Task> getAllTasks() {
            return taskRepository.findAll();
        }

        public Task updateTask(Long id, Task taskDetails) {
            Task task = taskRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Task not found with id " + id));
            task.setTitle(taskDetails.getTitle());
            task.setDescription(taskDetails.getDescription());
            task.setStatus(taskDetails.getStatus());
            return taskRepository.save(task);
        }

        public void deleteTask(Long id) {
            Task task = taskRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Task not found with id " + id));
            taskRepository.delete(task);
        }
}

