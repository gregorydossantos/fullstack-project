package com.gregory.backend.dto;

import com.gregory.backend.entities.Schedule;

import java.io.Serializable;
import java.util.Date;

public class ScheduleDto implements Serializable {
    private static final long serialVersionUID = 1L;

    // Attributes
    private Long id;
    private Date date;
    private String hour;

    private BarberDto barber;
    private UserDto user;

    // Builders
    public ScheduleDto() {}

    public ScheduleDto(Long id, Date date, String hour, BarberDto barber,
                       UserDto user) {
        this.id = id;
        this.date = date;
        this.hour = hour;
        this.barber = barber;
        this.user = user;
    }

    public ScheduleDto(Schedule schedule) {
        id = schedule.getId();
        date = schedule.getDate();
        hour = schedule.getHour();
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
