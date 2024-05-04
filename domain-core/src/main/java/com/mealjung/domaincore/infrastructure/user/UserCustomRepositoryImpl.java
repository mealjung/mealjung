package com.mealjung.domaincore.infrastructure.user;

import com.mealjung.domaincore.domain.model.user.UserEntity;
import com.mealjung.domaincore.infrastructure.config.QuerydslRepositorySupport;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;

import java.util.List;

import static com.mealjung.domaincore.domain.model.user.QUserEntity.userEntity;

public class UserCustomRepositoryImpl extends QuerydslRepositorySupport implements UserCustomRepository {
    private final JPAQueryFactory queryFactory;

    public UserCustomRepositoryImpl(EntityManager entityManager) {
        super(UserEntity.class);
        this.queryFactory = new JPAQueryFactory(entityManager);
    }
    @Override
    public List<UserEntity> findAllUsersByAgeRange(int startAgeRange, int endAgeRange) {
        return selectFrom(userEntity)
                .where(
                        isAgeRange(startAgeRange, endAgeRange)
                ).fetch();
    }

    private BooleanExpression isAgeRange(int startAgeRange, int endAgeRange) {
        return userEntity.age.between(startAgeRange, endAgeRange);
    }
}
