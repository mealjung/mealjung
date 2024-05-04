package com.mealjung.domaincore.infrastructure.user;

import com.mealjung.domaincore.domain.model.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserJpaRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByName(String username);
}
