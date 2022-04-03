package org.gborkar.springboot.web.todo.model;

import java.util.Date;

public class Todo {
  int id;
  String username;
  String description;
  Date targetDate;
  boolean isDone;

  public Todo(int id, String username, String description, Date targetDate,
      boolean isDone) {
    super();
    this.id = id;
    this.username = username;
    this.description = description;
    this.targetDate = targetDate;
    this.isDone = isDone;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getTargetDate() {
    return targetDate;
  }

  public void setTargetDate(Date targetDate) {
    this.targetDate = targetDate;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean isDone) {
    this.isDone = isDone;
  }

  @Override
  public String toString() {
    return String.format(
        "Todo [id=%s, user=%s, desc=%s, targetDate=%s, isDone=%s]", id,
        username, description, targetDate, isDone);
  }
}
