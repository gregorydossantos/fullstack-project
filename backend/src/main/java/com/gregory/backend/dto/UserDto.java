package com.gregory.backend.dto;

import com.gregory.backend.entities.User;

import java.io.Serializable;

public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;
    private String phone;
    private String mail;
    private Long login;
    private Integer password;

    public UserDto() {}

    public UserDto(Long id, String name, String phone, String mail, Long login, Integer password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.login = login;
        this.password = password;
    }

    public UserDto(User user) {
        id = user.getId();
        name = user.getName();
        phone = user.getPhone();
        mail = user.getMail();
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getLogin() {
        return login;
    }

    public void setLogin(Long login) {
        this.login = login;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

}
