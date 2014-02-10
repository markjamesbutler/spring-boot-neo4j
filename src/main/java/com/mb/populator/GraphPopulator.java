package com.mb.populator;

import com.mb.service.UserService;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class GraphPopulator {

    @Inject
    public GraphPopulator(UserService userService) {

        userService.createUser("mark");

    }

}
