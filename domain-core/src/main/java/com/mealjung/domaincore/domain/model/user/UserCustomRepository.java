package com.mealjung.domaincore.domain.model.user;

import com.mealjung.domaincore.domain.model.user.UserEntity;

import java.util.List;

public interface UserCustomRepository {
    List<UserEntity> findAllUsersByAgeRange(int startAgeRange, int endAgeRange);
}
