package com.isoProcess.controller;

import com.isoProcess.entity.Task;
import com.isoProcess.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task createOrUpdateTask(@RequestBody Task task) {
        return taskService.saveOrUpdateTask(task);
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Integer id) {
        return taskService.getTaskById(id);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @DeleteMapping("/{id}")
    public String deleteTaskById(@PathVariable Integer id) {
        taskService.deleteTaskById(id);
        return "Task deleted successfully!";
    }

    @PutMapping("/{id}/status")
    public Task updateTaskStatus(@PathVariable Integer id, @RequestParam String status) {
        return taskService.updateTaskStatus(id, status);
    }
}