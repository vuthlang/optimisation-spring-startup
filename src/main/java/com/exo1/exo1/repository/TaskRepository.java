package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
