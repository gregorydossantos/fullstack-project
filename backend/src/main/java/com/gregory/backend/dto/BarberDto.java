package com.gregory.backend.dto;

import com.gregory.backend.entities.Barber;

import java.io.Serializable;

public class BarberDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private ScheduleDto schedule;

    public BarberDto() {}

    public BarberDto(Long id, String name, ScheduleDto schedule) {
        this.id = id;
        this.name = name;
        this.schedule = schedule;
    }

    public BarberDto(Barber barber) {
        id = barber.getId();
        name = barber.getName();
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

    public ScheduleDto getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleDto schedule) {
        this.schedule = schedule;
    }

}
