package com.szrthk.taskmanager.repo;

import com.szrthk.taskmanager.entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends MongoRepository<Task, String> {
}
