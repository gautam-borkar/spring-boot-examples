package org.gborkar.springboot.web.controller;

import org.gborkar.springboot.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  @Autowired
  LoginService loginService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String showLoginPage() {
    return "login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String login(ModelMap modelMap, @RequestParam String username, @RequestParam String password) {
    boolean isValidUser = loginService.isValidUser(username, password);

    if (!isValidUser) {
      modelMap.put("errorMessage", "Invalid Credentials!");
      return "login";
    }

    modelMap.put("username", username);
    return "welcome";
  }
}
