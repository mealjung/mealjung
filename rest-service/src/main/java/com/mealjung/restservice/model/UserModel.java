package com.mealjung.restservice.model;

import com.mealjung.domaincore.domain.model.user.UserEntity;

public class UserModel {
    Long id;
    String name;
    int age;
    String gender;

    public UserModel(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static UserModel from(UserEntity user) {
        return new UserModel(user.getEmail(), user.getAge(), user.getGender());
    }
}
