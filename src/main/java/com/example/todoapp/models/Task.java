package com.example.todoapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String title;

  private boolean completed;

  public void setTitle(String title) {
    this.title = title;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  public boolean isCompleted() {
    return this.completed;
  }
}
