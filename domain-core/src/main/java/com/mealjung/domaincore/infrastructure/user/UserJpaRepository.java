package com.mealjung.domaincore.infrastructure.user;

import com.mealjung.domaincore.domain.model.user.UserEntity;
import com.mealjung.domaincore.domain.model.user.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserJpaRepository implements UserRepository {
    private final IUserJpaRepository userRepository;

    public UserJpaRepository(IUserJpaRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity findByName(String name) {
        return userRepository.findByName(name);
    }
}
