package com.gregory.backend.services;

import com.gregory.backend.dto.BarberDto;
import com.gregory.backend.dto.ScheduleDto;
import com.gregory.backend.dto.UserDto;
import com.gregory.backend.entities.Barber;
import com.gregory.backend.entities.Schedule;
import com.gregory.backend.entities.User;
import com.gregory.backend.repositories.BarberRepository;
import com.gregory.backend.repositories.ScheduleRepository;
import com.gregory.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScheduleService {

    private Schedule scheduleUpdate;

    @Autowired
    ScheduleRepository scheduleRepository;

    @Autowired
    BarberRepository barberRepository;

    @Autowired
    UserRepository userRepository;

    @Transactional(readOnly = true)
    public Page<ScheduleDto> findAll(Pageable pageable) {
        Page<Schedule> result = scheduleRepository.findAll(pageable);
        return result.map(ScheduleDto::new);
    }

    @Transactional
    public ScheduleDto save(ScheduleDto scheduleDto) {
        Schedule schedule = new Schedule();
        schedule.setDateHour(scheduleDto.getDateHour());

        Barber barber = barberRepository.getOne(scheduleDto.getBarber().getId());
        schedule.setBarber(barber);

        User user = userRepository.getOne(scheduleDto.getUser().getId());
        schedule.setUser(user);

        schedule = scheduleRepository.save(schedule);
        return new ScheduleDto(schedule);
    }

    @Transactional
    public ScheduleDto update(Long id, ScheduleDto scheduleDto) {
        var schedule = scheduleRepository.findById(id);
        if (schedule.isPresent()) {
            scheduleUpdate = schedule.get();
            scheduleUpdate.setDateHour(scheduleDto.getDateHour());

            Barber barber = barberRepository.getOne(scheduleDto.getBarber().getId());
            scheduleUpdate.setBarber(barber);

            User user = userRepository.getOne(scheduleDto.getUser().getId());
            scheduleUpdate.setUser(user);
        }
        scheduleUpdate = scheduleRepository.save(scheduleUpdate);
        return new ScheduleDto(scheduleUpdate);
    }

    @Transactional
    public void delete(Long id) {
        var schedule = scheduleRepository.findById(id);
        if (schedule.isPresent()) {
            var scheduleDelete = schedule.get();
            scheduleRepository.delete(scheduleDelete);
        }
    }
}
