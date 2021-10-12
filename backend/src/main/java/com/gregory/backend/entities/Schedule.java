package com.gregory.backend.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Time;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "tb_schedules")
public class Schedule {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "America/Sao_Paulo")
    private Date date;

    private String hour;

    @ManyToOne
    @JoinColumn(name = "barber_id")
    private Barber barber;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Builders
    public Schedule() {}

    public Schedule(Date date, String hour, Barber barber, User user) {
        this.date = date;
        this.hour = hour;
        this.barber = barber;
        this.user = user;
    }

    // Methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Barber getBarber() {
        return barber;
    }

    public void setBarber(Barber barber) {
        this.barber = barber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
