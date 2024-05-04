package com.mealjung.restservice.service;

import com.mealjung.domaincore.domain.model.user.UserQuery;
import com.mealjung.restservice.model.UserModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class UserApplicationProvider {
    private final UserQuery userQuery;

    public UserApplicationProvider(UserQuery userQuery) {
        this.userQuery = userQuery;
    }

    public UserModel findUserByName(String name) {
        return UserModel.from(userQuery.findUserByName(name));
    }

    public List<UserModel> findAllByAgeRange(int startAgeRange, int endAgeRange) {
        return userQuery.findAllUsersByAgeRange(startAgeRange, endAgeRange)
                .stream()
                .map(UserModel::from)
                .collect(Collectors.toList());
    }
}
