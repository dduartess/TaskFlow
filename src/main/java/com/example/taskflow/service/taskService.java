package com.example.taskflow.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.taskflow.model.Task;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public Task createTask(String title, String description) {
        Task newTask = new Task(title, description);
        tasks.add(newTask);
        return newTask;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task getTaskById(Long id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void deleteTask(Long id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }
    
}
