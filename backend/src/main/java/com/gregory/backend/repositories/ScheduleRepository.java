package com.gregory.backend.repositories;

import com.gregory.backend.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
