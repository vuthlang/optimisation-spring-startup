package com.exo1.exo1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "project_task_count")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectTaskCount {
    @Id
    private Long projectId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "task_count")
    private Long taskCount;
}
