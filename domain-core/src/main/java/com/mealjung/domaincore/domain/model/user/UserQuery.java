package com.mealjung.domaincore.domain.model.user;

public class UserQuery {
    private final UserRepository userRepository;

    public UserQuery(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity findUserByName(String username) {
        return userRepository.findByName(username);
    }
}
