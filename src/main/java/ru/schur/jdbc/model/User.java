package ru.schur.jdbc.model;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String firstName;

    private String lastName;

    private int age;

    public User() {
    }

    public User(Integer id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
