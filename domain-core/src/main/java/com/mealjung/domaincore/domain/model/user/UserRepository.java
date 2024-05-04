package com.mealjung.domaincore.domain.model.user;

import java.util.List;

public interface UserRepository {
    UserEntity findByName(String name);
}
