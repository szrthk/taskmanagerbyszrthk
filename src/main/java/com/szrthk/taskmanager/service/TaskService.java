package com.szrthk.taskmanager.service;

import com.szrthk.taskmanager.entity.Task;
import com.szrthk.taskmanager.repo.TaskRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepo taskRepo;

    public Task createTask(Task task){// here we are building backend logic
        return taskRepo.save(task);
    }
    public List<Task> getAllTasks(){ // backend logic to get/find all tasks
        return taskRepo.findAll();
    }
    public Optional<Task>gettaskbyid(String id){
        return taskRepo.findById(id);
    }
    public Task updateTask(String id,Task taskDetails){ // use to update task, lil difficult to process need revision
        Task task = taskRepo.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setTitle(taskDetails.getTitle());
        task.setDescription(taskDetails.getDescription());
        task.setStatus(taskDetails.getStatus());
        return taskRepo.save(task);
    }
    public void deletebyid(String id){
        taskRepo.deleteById(id);
    }
}
