package com.mealjung.restservice.controller;

import com.mealjung.restservice.model.UserSearchCondition;
import com.mealjung.restservice.model.UserModel;
import com.mealjung.restservice.service.UserApplicationProvider;
import com.mealjung.restservice.service.UserApplicationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@Tag(name = "user 관련 API", description = "user info description")
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

    @GetMapping
    public List<UserModel> findAllUsersByAgeRange(UserSearchCondition condition) {
        return userApplicationProvider.findAllByAgeRange(condition.startAgeRange, condition.endAgeRange);
    }
}
