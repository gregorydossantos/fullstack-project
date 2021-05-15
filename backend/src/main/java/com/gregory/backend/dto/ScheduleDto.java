package com.gregory.backend.dto;

import java.time.Instant;

public class ScheduleDto {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Instant dateHour;
    private BarberDto barber;
    private UserDto user;

    public ScheduleDto() {}

    public ScheduleDto(Long id, Instant dateHour, BarberDto barber, UserDto user) {
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

    public Instant getDateHour() {
        return dateHour;
    }

    public void setDateHour(Instant dateHour) {
        this.dateHour = dateHour;
    }

    public BarberDto getBarber() {
        return barber;
    }

    public void setBarber(BarberDto barber) {
        this.barber = barber;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
