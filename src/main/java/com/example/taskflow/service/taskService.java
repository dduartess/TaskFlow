package com.example.taskflow.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskflow.model.Task;

@Service
public class TaskService {

    Task newTask = new Task();

    @Autowired
    TaskValidation validation;
    private List<Task> tasks = new ArrayList<>();

    public Task createTask(String title, String description) {
        if (!validation.taskTitleIsValid(title)) {
            return null;
        }
        if (!validation.taskDescriptionIsValid(description)) {
            return null;
        }

        Task newTask = new Task(title, description);
        tasks.add(newTask);
        return newTask;
    }
}
