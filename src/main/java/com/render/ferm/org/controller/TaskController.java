package com.render.ferm.org.controller;

import com.render.ferm.org.dto.TaskDTO;
import com.render.ferm.org.mapper.TaskMapper;
import com.render.ferm.org.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/task")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;


    @PostMapping("/save")
    public void saveTask(@RequestBody TaskDTO taskDTO) {
        taskService.saveTask(TaskMapper.map(taskDTO));
    }
}
