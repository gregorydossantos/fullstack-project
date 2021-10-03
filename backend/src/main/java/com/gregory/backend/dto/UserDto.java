package com.gregory.backend.dto;

import com.gregory.backend.entities.User;

import java.io.Serializable;

public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    // Attributes
    private Long id;
    private String name;
    private Integer login;
    private Integer password;

    // Builders
    public UserDto() {

    }

    public UserDto(User user) {
        id = user.getId();
        name = user.getName();
        login = user.getLogin();
        password = user.getPassword();
    }

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
