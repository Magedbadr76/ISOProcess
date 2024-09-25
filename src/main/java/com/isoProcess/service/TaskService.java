package com.isoProcess.service;

import com.isoProcess.entity.Task;

import java.util.List;

public interface TaskService {
    
    // Create or update a Task
    Task saveOrUpdateTask(Task task);
    
    // Retrieve a Task by ID
    Task getTaskById(Integer id);
    
    // Retrieve all Tasks
    List<Task> getAllTasks();
    
    // Delete a Task by ID
    void deleteTaskById(Integer id);
    
    // Update task status
    Task updateTaskStatus(Integer id, String status);
}
