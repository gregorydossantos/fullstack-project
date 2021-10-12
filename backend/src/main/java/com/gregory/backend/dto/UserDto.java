package com.gregory.backend.dto;

import com.gregory.backend.entities.User;

import java.io.Serializable;

public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    // Attributes
    private Long id;
    private String userName;
    private Integer password;

    // Builders
    public UserDto() {

    }

    public UserDto(Long id, String name, Integer password) {
        this.id = id;
        this.userName = name;
        this.password = password;
    }

    public UserDto(User user) {
        id = user.getId();
        userName = user.getUserName();
        password = user.getPassword();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

}
