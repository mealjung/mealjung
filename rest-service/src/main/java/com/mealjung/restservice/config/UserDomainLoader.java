package com.mealjung.restservice.config;

import com.mealjung.domaincore.domain.model.user.UserRepository;
import com.mealjung.domaincore.domain.model.user.UserCommand;
import com.mealjung.domaincore.domain.model.user.UserQuery;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDomainLoader {
    @Bean
    public UserCommand userCommand(UserRepository userRepository) {
        return new UserCommand(userRepository);
    }

    @Bean
    public UserQuery userQuery(UserRepository userRepository) {
        return new UserQuery(userRepository);
    }
}
