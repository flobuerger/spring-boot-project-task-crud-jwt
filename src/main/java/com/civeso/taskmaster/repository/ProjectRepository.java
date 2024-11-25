package com.civeso.taskmaster.repository;

import com.civeso.taskmaster.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
