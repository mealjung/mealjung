package com.mealjung.restservice.service;

import com.mealjung.domaincore.domain.model.user.UserQuery;
import com.mealjung.restservice.model.UserModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
