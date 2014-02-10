package com.mb.controllers;

import com.mb.domain.User;
import com.mb.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class UserController {

    @Inject
    private UserService userService;

      @RequestMapping(value = "/users", produces="application/json")
      @ResponseBody
        public Iterable<User> index() {
            userService.getAllUsers();
            return userService.getAllUsers();
        }

}
