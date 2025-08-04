package com.szrthk.taskmanager.controller;


import com.szrthk.taskmanager.entity.Task;
import com.szrthk.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PrivateKey;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired //injecting
    private TaskService taskService; // injecting this to call busines layer.

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }
    @GetMapping
    public List<Task> getALL(){
        return taskService.getAllTasks();
    }
    @GetMapping("{id}")
    public Optional<Task> gettaskbyid(@PathVariable String id){
        return taskService.gettaskbyid(id);
    }
    @PutMapping("{id}")
    public Task updateTask(@PathVariable String id, @RequestBody Task task){
        return taskService.updateTask(id, task);
    }
    @DeleteMapping
    public String delete(@PathVariable String id) {
        taskService.deletebyid(id);
        return "Task deleted with ID: " + id;
    }

}
