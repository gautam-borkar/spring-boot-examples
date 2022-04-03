package org.gborkar.springboot.web.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

  public boolean isValidUser(String username, String password) {
    return "dummy".equalsIgnoreCase(username) && "password".equalsIgnoreCase(password);
  }
}
