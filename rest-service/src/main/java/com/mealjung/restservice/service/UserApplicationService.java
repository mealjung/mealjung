package com.mealjung.restservice.service;

import com.mealjung.domaincore.domain.model.user.UserCommand;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserApplicationService {
    private final UserCommand userCommand;
    public UserApplicationService(UserCommand userCommand) {
        this.userCommand = userCommand;
    }
}
