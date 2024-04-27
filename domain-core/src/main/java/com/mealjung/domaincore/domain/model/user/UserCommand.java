package com.mealjung.domaincore.domain.model.user;

public class UserCommand {
    private final UserRepository userRepository;
    public UserCommand(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
