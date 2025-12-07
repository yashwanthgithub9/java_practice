package com.todoapp.smarttodo.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this will create task_seq table The key is to use the GenerationType.IDENTITY strategy.
    private int taskId;
    private String taskName;
//    private String desc;
    private String description;
    private boolean isCompleted=false;
    private LocalDateTime createdAt;

/*    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="userId",nullable = false )
    private User user;*/

    public Task(int taskId, String taskName, String description, boolean isCompleted, LocalDateTime createdAt) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.description = description;
        this.isCompleted = isCompleted;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", desc='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                ", createdAt=" + createdAt +
                '}';
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String gettaskName() {
        return taskName;
    }

    public void settaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
