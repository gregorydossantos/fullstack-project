package com.gregory.backend.repositories;

import com.gregory.backend.entities.Barber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BarberRepository extends JpaRepository<Barber, Long> {

    @Query("SELECT * FROM Barber WHERE name = ?1")
    Barber getBarberByName(String name);
}
