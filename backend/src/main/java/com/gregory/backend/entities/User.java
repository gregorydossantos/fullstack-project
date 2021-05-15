package com.gregory.backend.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String mail;
    private Long login;
    private Integer password;

    public User() {}

    public User(String name, String phone, String mail, Long login, Integer password) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.login = login;
        this.password = password;
    }

    public User(Long id, String name, String phone, String mail, Long login, Integer password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.login = login;
        this.password = password;
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
