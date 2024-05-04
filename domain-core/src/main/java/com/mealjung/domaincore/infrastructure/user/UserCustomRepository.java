package com.mealjung.domaincore.infrastructure.user;

import com.mealjung.domaincore.domain.model.user.UserEntity;

import java.util.List;

public interface UserCustomRepository {
    List<UserEntity> findAllUsersByAgeRange(int startAgeRange, int endAgeRange);
}
