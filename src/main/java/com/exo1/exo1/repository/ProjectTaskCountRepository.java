package com.exo1.exo1.repository;

import com.exo1.exo1.entity.ProjectTaskCountView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectTaskCountRepository extends JpaRepository<ProjectTaskCountView, Long> {
}
