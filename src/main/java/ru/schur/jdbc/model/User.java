package ru.schur.jdbc.model;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String firstName;

    private String lastName;

    private int age;

}
