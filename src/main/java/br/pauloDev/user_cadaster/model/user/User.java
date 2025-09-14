package br.pauloDev.user_cadaster.model.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class User extends AbstractEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column (name = "email")
    private String email;
}
