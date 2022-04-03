package org.gborkar.springboot.web.todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.gborkar.springboot.web.todo.model.Todo;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
  static List<Todo> todoList = new ArrayList<>();

  static {
    todoList.add(new Todo(1, "dummy", "Learn Spring MVC", new Date(),
        false));
    todoList.add(new Todo(2, "dummy", "Learn Struts", new Date(), false));
    todoList.add(new Todo(3, "alice", "Learn Hibernate", new Date(),
        false));
  }

  public List<Todo> retrieveTodos(String username) {
    List<Todo> returList = new ArrayList<>();

    for (Todo todo : todoList) {
      if (todo.getUsername().equalsIgnoreCase(username)) {
        returList.add(todo);
      }
    }

    return returList;
  }
}
