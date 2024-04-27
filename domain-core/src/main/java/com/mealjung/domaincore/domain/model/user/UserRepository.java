package com.mealjung.domaincore.domain.model.user;

public interface UserRepository {
    UserEntity findByName(String name);
}
