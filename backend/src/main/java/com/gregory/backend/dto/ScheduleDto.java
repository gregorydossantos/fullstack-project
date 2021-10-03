package com.gregory.backend.dto;

import com.gregory.backend.entities.Schedule;

import java.io.Serializable;
import java.sql.Time;
import java.time.Instant;
import java.util.Date;

public class ScheduleDto implements Serializable {
    private static final long serialVersionUID = 1L;

    // Attributes
    private Long id;
    private Date dateHour;
    private BarberDto barber;
    private UserDto user;

    // Builders
    public ScheduleDto() {}

    public ScheduleDto(Schedule schedule) {
        id = schedule.getId();
        dateHour = schedule.getDateHour();
        barber = new BarberDto(schedule.getBarber());
        user = new UserDto(schedule.getUser());
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
