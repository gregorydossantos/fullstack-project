package com.gregory.backend.repositories;

import com.gregory.backend.entities.Barber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarberRepository extends JpaRepository<Barber, Long> {
}
