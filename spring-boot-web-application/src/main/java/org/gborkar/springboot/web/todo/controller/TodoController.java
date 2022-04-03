package org.gborkar.springboot.web.todo.controller;

import org.gborkar.springboot.web.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class TodoController {

  @Autowired
  TodoService todoService;
  
  @RequestMapping("/listTodo")
  public String listTodo(ModelMap modelMap){
    modelMap.put("todoList", todoService.retrieveTodos((String) modelMap.get("username")));
    return "listTodo";
  }
}
