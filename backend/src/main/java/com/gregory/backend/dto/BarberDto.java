package com.gregory.backend.dto;

import com.gregory.backend.entities.Barber;

import java.io.Serializable;

public class BarberDto implements Serializable {
    private static final long serialVersionUID = 1L;

    // Attributes
    private Long id;
    private String name;

    // Builders
    public BarberDto() {
    }

    public BarberDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public BarberDto(Barber barber) {
        id = barber.getId();
        name = barber.getName();
    }

    // Methods
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

}
