package com.civeso.taskmaster.repository;

import com.civeso.taskmaster.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
