package com.mealjung.domaincore.domain.model.user;

import com.mealjung.domaincore.infrastructure.user.UserCustomRepository;

import java.util.List;

public class UserQuery {
    private final UserRepository userRepository;
    private final UserCustomRepository customRepository;

    public UserQuery(UserRepository userRepository, UserCustomRepository customRepository) {
        this.userRepository = userRepository;
        this.customRepository = customRepository;
    }

    public UserEntity findUserByName(String username) {
        return userRepository.findByName(username);
    }

    public List<UserEntity> findAllUsersByAgeRange(int startAgeRange, int endAgeRange) {
        return customRepository.findAllUsersByAgeRange(startAgeRange, endAgeRange);
    }
}
