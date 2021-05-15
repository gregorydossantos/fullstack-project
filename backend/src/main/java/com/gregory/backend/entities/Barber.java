package com.gregory.backend.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_barbers")
public class Barber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "barber")
    private List<Schedule> schedules = new ArrayList<>();

    public Barber() {}

    public Barber(String name) {
        this.name = name;
    }

    public Barber(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

}
