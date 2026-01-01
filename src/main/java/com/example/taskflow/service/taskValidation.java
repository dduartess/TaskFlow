package com.example.taskflow.service;

public class TaskValidation {

public boolean taskTitleIsValid(String title){
    if (title == null || title.trim().isEmpty()) {
        System.out.println("Invalid task title.");
        return false;
    }
    else {
        return true;
    }
}

public boolean taskDescriptionIsValid(String description){
    if (description == null || description.trim().isEmpty()) {
        System.out.println("Invalid task description.");
        return false;
    }
    else {
        return true;
    }
}

}
