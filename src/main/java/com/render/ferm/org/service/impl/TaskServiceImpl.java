package com.render.ferm.org.service.impl;

import com.render.ferm.org.entity.Task;
import com.render.ferm.org.service.TaskService;
import com.render.ferm.org.user.TaskRepository;
import com.render.ferm.org.user.UserRepository;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public TaskServiceImpl(TaskRepository taskRepository, UserRepository userRepository) {
        this.taskRepository = taskRepository;

        this.userRepository = userRepository;
    }

    private String getCurrentUserName() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String currentUserName = authentication.getName();
            return currentUserName;
        }
        return null;
    }

    @Override
    public void saveTask(Task task) {
        final String currentUserName = getCurrentUserName();
        //userRepository.findById()
        taskRepository.save(task);
    }

    @Override
    public void showTask(Task task) {
        taskRepository.findAll();
    }
}
