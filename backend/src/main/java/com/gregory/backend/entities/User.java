package com.gregory.backend.entities;

import com.gregory.backend.dto.UserDto;

import javax.persistence.*;

@Entity
@Table(name = "tb_users")
public class User {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer login;
    private Integer password;

    // Builders
    public User() {}

    public User(Long id, String name, Integer login, Integer password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
    }

    // Methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLogin() {
        return login;
    }

    public void setLogin(Integer login) {
        this.login = login;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

}
