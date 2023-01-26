package com.render.ferm.org.mapper;

import com.render.ferm.org.dto.TaskDTO;
import com.render.ferm.org.entity.Task;

public class TaskMapper {
    public static Task map(TaskDTO taskDTO) {
        final Task task = new Task();
        task.setId(taskDTO.getId());
        task.setName(taskDTO.getName());
        task.setStartExpired(taskDTO.getStartExpired());
        task.setEndExpired(taskDTO.getEndExpired());
        return task;
    }
}
