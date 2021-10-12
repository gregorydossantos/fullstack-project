package com.gregory.backend.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_users")
public class User {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private Integer password;

    @OneToMany(mappedBy = "user")
    private List<Schedule> schedules = new ArrayList<>();

    // Builders
    public User() {}

    public User(Long id, String userName, Integer password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    // Methods
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

    public List<Schedule> getSchedules() {
        return schedules;
    }
}
