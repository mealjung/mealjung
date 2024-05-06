package com.mealjung.domaincore.domain.model.user;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String emailRecommend;

    @Column
    private int age;

    @Column
    private String gender;

    @Column
    private LocalDateTime createdDate = LocalDateTime.now();

    @Column
    private LocalDateTime modifiedDate = LocalDateTime.now();

    private UserEntity(String email, String password, String emailRecommend, int age, String gender) {
        this.email = email;
        this.password = password;
        this.emailRecommend = emailRecommend;
        this.age = age;
        this.gender = gender;
    }

    public static UserEntity create(String email, String password, String emailRecommend, int age, String gender) {
        return new UserEntity(email, password, emailRecommend, age, gender);
    }
}


