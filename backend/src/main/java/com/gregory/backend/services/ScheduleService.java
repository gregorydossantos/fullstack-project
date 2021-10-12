package com.gregory.backend.services;

import com.gregory.backend.dto.ScheduleDto;
import com.gregory.backend.entities.Barber;
import com.gregory.backend.entities.Schedule;
import com.gregory.backend.entities.User;
import com.gregory.backend.repositories.BarberRepository;
import com.gregory.backend.repositories.ScheduleRepository;
import com.gregory.backend.repositories.UserRepository;
import com.gregory.backend.usefuls.StringUseful;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScheduleService {

    Schedule schedule;

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
        schedule = new Schedule();
        schedule.setDate(scheduleDto.getDate());
        Barber barber = barberRepository.getBarberByName(scheduleDto.getBarber().getName());
        User user = userRepository.getUserByName(scheduleDto.getUser().getUserName());
        if (!StringUseful.isNullOrEmpty(barber))
            schedule.setBarber(barber);
//        else
//            throw new MyException();
        if (!StringUseful.isNullOrEmpty(user))
            schedule.setUser(user);
//        else
//            throw new MyException();

        if (!StringUseful.isNullOrEmpty(schedule))
            return new ScheduleDto(schedule);
//        else
//            throw new MyException();

        return null;
    }

    @Transactional
    public ScheduleDto update(Long id, ScheduleDto scheduleDto) {
        return null;
    }

    @Transactional
    public void delete(Long id) {
    }

}
