package com.gregory.backend.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_schedules")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Sao_Paulo")
    private LocalDate dateHour;

    @ManyToOne
    @JoinColumn(name = "barber_id")
    private Barber barber;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Schedule() {}

    public Schedule(LocalDate dateHour, Barber barber, User user) {
        this.dateHour = dateHour;
        this.barber = barber;
        this.user = user;
    }

    public Schedule(Long id, LocalDate dateHour, Barber barber, User user) {
        this.id = id;
        this.dateHour = dateHour;
        this.barber = barber;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateHour() {
        return dateHour;
    }

    public void setDateHour(LocalDate dateHour) {
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
