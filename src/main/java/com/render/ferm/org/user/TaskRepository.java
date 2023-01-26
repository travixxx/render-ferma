package com.render.ferm.org.user;

import com.render.ferm.org.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
