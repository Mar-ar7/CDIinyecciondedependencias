package com.tareaCDI.service;

import com.tareaCDI.model.Task;
import com.tareaCDI.repository.TaskRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class TaskService {

    @Inject
    private TaskRepository repository;

    public List<Task> getTasks() {
        return repository.findAll();
    }

    public void addTask(Task task) {
        repository.save(task);
    }
}
