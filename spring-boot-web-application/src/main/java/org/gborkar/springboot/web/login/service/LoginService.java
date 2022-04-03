package org.gborkar.springboot.web.login.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

  public boolean isValidUser(String username, String password) {
    return "dummy".equalsIgnoreCase(username) && "password".equalsIgnoreCase(password);
  }
}
