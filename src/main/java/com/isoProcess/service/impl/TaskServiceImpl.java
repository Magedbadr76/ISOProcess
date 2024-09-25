package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.Task;
import com.isoProcess.repo.TaskRepository;
import com.isoProcess.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task saveOrUpdateTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task getTaskById(Integer id) {
        Optional<Task> task = taskRepository.findById(id);
        return task.orElse(null);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public void deleteTaskById(Integer id) {
        taskRepository.deleteById(id);
    }

    @Override
    public Task updateTaskStatus(Integer id, String status) {
        Task task = getTaskById(id);
        if (task != null) {
            task.setTask_status(status);
            return taskRepository.save(task);
        }
        return null;
    }
}