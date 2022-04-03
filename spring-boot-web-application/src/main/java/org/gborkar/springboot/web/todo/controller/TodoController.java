package org.gborkar.springboot.web.todo.controller;

import java.util.Date;

import org.gborkar.springboot.web.todo.model.Todo;
import org.gborkar.springboot.web.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class TodoController {

  @Autowired
  TodoService todoService;
  
  @RequestMapping(value = "/todo", method = RequestMethod.GET)
  public String showAddUpdateTodo(){
    return "todo";
  }

  @RequestMapping(value = "/addUpdateTodo", method = RequestMethod.POST)
  public String addUpdateTodo(ModelMap modelMap, @RequestParam String description) {
    todoService.addUpdateTodo(new Todo(4, (String) modelMap.get("username"), description, new Date(), false));
    return "redirect:/listTodo";
  }

  @RequestMapping("/listTodo")
  public String listTodo(ModelMap modelMap){
    modelMap.put("todoList", todoService.retrieveTodos((String) modelMap.get("username")));
    return "listTodo";
  }
}
