package com.gregory.backend.dto;

import com.gregory.backend.entities.Schedule;

import java.time.LocalDate;

public class ScheduleDto {
    private static final long serialVersionUID = 1L;

    private Long id;
    private LocalDate dateHour;
    private BarberDto barber;
    private UserDto user;

    public ScheduleDto() {}

    public ScheduleDto(Long id, LocalDate dateHour, BarberDto barber, UserDto user) {
        this.id = id;
        this.dateHour = dateHour;
        this.barber = barber;
        this.user = user;
    }

    public ScheduleDto(Schedule schedule) {
        id = schedule.getId();
        dateHour = schedule.getDateHour();
        barber = new BarberDto(schedule.getBarber());
        user = new UserDto(schedule.getUser());
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
