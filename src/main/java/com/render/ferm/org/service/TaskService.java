package com.render.ferm.org.service;

import com.render.ferm.org.entity.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {
    void saveTask(Task task);
    void showTask(Task task);
}
