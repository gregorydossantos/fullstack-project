package com.gregory.app.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.time.Instant;
import java.util.Objects;

@DatabaseTable(tableName = "tb_schedules")
public class Schedule {

    @DatabaseField(generatedId = true)
    private Long id;

    private Instant dateHour;

    private Barber barber;

    private User user;

    public Schedule() {}

    public Schedule(Instant dateHour, Barber barber, User user) {
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

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", dateHour=" + dateHour +
                ", barber=" + barber +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(id, schedule.id) &&
                Objects.equals(dateHour, schedule.dateHour) &&
                Objects.equals(barber, schedule.barber) &&
                Objects.equals(user, schedule.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateHour, barber, user);
    }
}
