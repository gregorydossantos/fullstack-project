package com.gregory.app.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@DatabaseTable(tableName = "tb_barbers")
public class Barber {

    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField
    private String name;

    @DatabaseField
    private List<Schedule> schedules = new ArrayList<>();

    public Barber() {}

    public Barber(String name, List<Schedule> schedules) {
        this.name = name;
        this.schedules = schedules;
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

    @Override
    public String toString() {
        return "Barber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", schedules=" + schedules +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barber barber = (Barber) o;
        return Objects.equals(id, barber.id) &&
                Objects.equals(name, barber.name) &&
                Objects.equals(schedules, barber.schedules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, schedules);
    }
}
