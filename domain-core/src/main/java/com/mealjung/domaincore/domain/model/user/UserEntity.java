package com.mealjung.domaincore.domain.model.user;

import jakarta.persistence.*;

@Entity
@Table(
    name = "user"
)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String gender;

    private UserEntity(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static UserEntity create(String name, int age, String gender) {
        return new UserEntity(name, age, gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
