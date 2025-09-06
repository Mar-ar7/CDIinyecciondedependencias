package com.tareaCDI.controller;

import com.tareaCDI.model.Task;
import com.tareaCDI.service.TaskService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("taskController")
@SessionScoped
public class TaskController implements Serializable {

    private Task task = new Task();

    @Inject
    private TaskService service;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public List<Task> getTasks() {
        return service.getTasks();
    }

    public void addTask() {
        service.addTask(task);
        task = new Task();
    }
}
