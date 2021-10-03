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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Sao_Paulo")
    private Date dateHour;

    @ManyToOne
    @JoinColumn(name = "barber_id")
    private Barber barber;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Builders
    public Schedule() {}

    public Schedule(Date dateHour, Barber barber, User user) {
        this.dateHour = dateHour;
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

    public Date getDateHour() {
        return dateHour;
    }

    public void setDateHour(Date dateHour) {
        this.dateHour = dateHour;
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
