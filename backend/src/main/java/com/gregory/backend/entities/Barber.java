package com.gregory.backend.entities;

import com.gregory.backend.dto.BarberDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_barbers")
public class Barber {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Builders
    public Barber() {
    }

    public Barber(Long id, String name) {
        this.id = id;
        this.name = name;
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
