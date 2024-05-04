package com.mealjung.domaincore.infrastructure.user;

import com.mealjung.domaincore.domain.model.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserJpaRepository extends JpaRepository<UserEntity, Long>, UserCustomRepository {
    UserEntity findByName(String username);

    List<UserEntity> findAllByAgeRange(int startAgeRange, int endAgeRange);
}
