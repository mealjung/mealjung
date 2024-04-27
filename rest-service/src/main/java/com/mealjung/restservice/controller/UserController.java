package com.mealjung.restservice.controller;

import com.mealjung.restservice.model.UserModel;
import com.mealjung.restservice.service.UserApplicationService;
import com.mealjung.restservice.service.UserApplicationProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserApplicationService userApplicationService;
    private final UserApplicationProvider userApplicationProvider;

    public UserController(UserApplicationService userApplicationService, UserApplicationProvider userApplicationProvider) {
        this.userApplicationService = userApplicationService;
        this.userApplicationProvider = userApplicationProvider;
    }

    @GetMapping("{username}")
    public UserModel findUserByName(
        @PathVariable String username
    ) {
        return userApplicationProvider.findUserByName(username);
    }
}
